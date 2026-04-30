import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Problema16 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        Random azar = new Random();

        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.print("w: ");
        int w = sc.nextInt();
        System.out.print("x: ");
        int x = sc.nextInt();

        int[] datos = new int[n];
        int[] frecuencia = new int[x - w + 1];

        System.out.println("Datos generados entre " + w + " y " + x + ":");
        for (int i = 0; i < n; i++) {
            datos[i] = azar.nextInt(x - w + 1) + w;
            frecuencia[datos[i] - w]++;
            System.out.print(datos[i] + " ");
        }
        System.out.println();

        int maxFrecuencia = 0;
        for (int f : frecuencia) {
            if (f > maxFrecuencia) {
                maxFrecuencia = f;
            }
        }

        System.out.print("La moda es/son: ");
        for (int i = 0; i < frecuencia.length; i++) {
            if (frecuencia[i] == maxFrecuencia) {
                System.out.print((i + w) + " ");
            }
        }
        System.out.println("y se repite(n) " + maxFrecuencia + " veces");
    }
}
