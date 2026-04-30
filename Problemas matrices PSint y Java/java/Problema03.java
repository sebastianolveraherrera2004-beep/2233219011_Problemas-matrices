import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema03 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        int[][] m = new int[7][13];
        m[0][6] = 1;

        for (int r = 1; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                int izqArriba = (c > 0) ? m[r - 1][c - 1] : 0;
                int derArriba = (c < m[r].length - 1) ? m[r - 1][c + 1] : 0;
                m[r][c] = izqArriba + derArriba;
            }
        }

        System.out.println("Triangulo de Pascal:");
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                if (m[r][c] == 0) {
                    System.out.print("    ");
                } else {
                    System.out.printf("%4d", m[r][c]);
                }
            }
            System.out.println();
        }
    }
}
