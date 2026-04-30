import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Problema21 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void meterNumsEnMatriz(int n) {
        Random azar = new Random();
        int[][] m = new int[n][];

        for (int r = 0; r < n; r++) {
            m[r] = new int[n + (r * 2)];
            for (int c = 0; c < m[r].length; c++) {
                int valor;
                do {
                    valor = azar.nextInt(50) + 50;
                } while ((r % 2 == 0 && valor % 2 != 0) || (r % 2 != 0 && valor % 2 == 0));
                m[r][c] = valor;
            }
        }

        System.out.println("Matriz generada:");
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                System.out.print(m[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        meterNumsEnMatriz(4);
    }
}
