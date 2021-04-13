package Ejercicio3;
public class Estudiante {
    String nombre;
    String apellido;
    int comision;
    String email;
    String direccion;
    
    public String tusDatos(){
        String aux="";
        aux+="Nombre: "+this.getNombre();
        aux+="-Apellido: "+this.getApellido();
        aux+="-Comision: "+this.getComision();
        aux+="-email: "+this.getEmail();
        aux+="-Direccion: "+this.getDireccion();
        return aux;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
