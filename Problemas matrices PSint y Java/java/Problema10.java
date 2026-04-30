import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema10 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        int[][] M = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        for (int r = 0; r < M.length; r++) {
            for (int c = 0; c < M[r].length; c++) {
                System.out.print(M[r][c] + " ");
            }
            System.out.println();
        }
    }
}
