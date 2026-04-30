import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Problema19 {
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
        int suma = 0;

        System.out.println("Datos generados entre " + w + " y " + x + ":");
        for (int i = 0; i < n; i++) {
            datos[i] = azar.nextInt(x - w + 1) + w;
            suma += datos[i];
            System.out.print(datos[i] + " ");
        }
        System.out.println();

        double media = (double) suma / n;
        double sumaCuadrados = 0;

        System.out.println("Obs\tDatos\t(xi-xmed)^2");
        for (int i = 0; i < n; i++) {
            double cuadrado = Math.pow(datos[i] - media, 2);
            sumaCuadrados += cuadrado;
            System.out.printf("%d\t%d\t%.8f%n", i + 1, datos[i], cuadrado);
        }

        double s = Math.sqrt(sumaCuadrados / (n - 1));

        System.out.printf("suma= %d\t%.8f%n", suma, sumaCuadrados);
        System.out.printf("xmed= %.3f%n", media);
        System.out.printf("S= %.4f%n", s);
    }
}
