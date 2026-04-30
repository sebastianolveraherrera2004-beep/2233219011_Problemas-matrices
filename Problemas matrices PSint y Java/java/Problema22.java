import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.ArrayList;
public class Problema22 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static int[] generarUlam(int n) {
        ArrayList<Integer> serie = new ArrayList<>();
        while (n >= 1) {
            serie.add(n);
            if (n == 1) break;
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }

        int[] arreglo = new int[serie.size()];
        for (int i = 0; i < serie.size(); i++) {
            arreglo[i] = serie.get(i);
        }
        return arreglo;
    }

    public static void main(String[] args) throws Exception {
        System.out.print("Para cuantos numeros deseas obtener su serie de Ulam: ");
        int n = sc.nextInt();

        int[] valores = new int[n];
        int[][] series = new int[n][];

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Ingresa valor (mayor que cero): ");
                valores[i] = sc.nextInt();
            } while (valores[i] <= 0);

            series[i] = generarUlam(valores[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("La serie Ulam de " + valores[i] + " es");
            for (int j = 0; j < series[i].length; j++) {
                System.out.print(series[i][j] + " ");
            }
            System.out.println();
        }
    }
}
