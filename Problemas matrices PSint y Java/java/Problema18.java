import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Problema18 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        Random azar = new Random();

        System.out.print("n: ");
        int n = sc.nextInt();

        int[] v = new int[n];

        System.out.println("Valores generados:");
        for (int i = 0; i < n; i++) {
            v[i] = azar.nextInt(51);
            System.out.print(v[i] + " ");
        }
        System.out.println();

        int mayor = v[0];
        int menor = v[0];

        for (int i = 1; i < n; i++) {
            if (v[i] > mayor) mayor = v[i];
            if (v[i] < menor) menor = v[i];
        }

        System.out.print("Mayor = " + mayor + " en posicion: ");
        for (int i = 0; i < n; i++) {
            if (v[i] == mayor) System.out.print((i + 1) + " ");
        }

        System.out.print("\nMenor = " + menor + " en posicion: ");
        for (int i = 0; i < n; i++) {
            if (v[i] == menor) System.out.print((i + 1) + " ");
        }
        System.out.println();
    }
}
