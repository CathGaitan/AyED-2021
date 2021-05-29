public class Ejercicio4 {
    private static Random rand = new Random();
    public static int[] randomUno(int n) { //n=4 --> [0,1,2,3]
        int i, x = 0, k;
        int[] a = new int[n]; //array[4]
        for (i = 0; i < n; i++) { // for(i=0;i<4;i++)
            boolean seguirBuscando = true;
            while (seguirBuscando) {
                x = ran_int(0, n - 1);
                seguirBuscando = false;
                for (k = 0; k < i && !seguirBuscando; k++)
                    if (x == a[k])
                        seguirBuscando = true;
            }
            a[i] = x;
        }
        return a;
    }
}
