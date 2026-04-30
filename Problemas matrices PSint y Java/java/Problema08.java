import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema08 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        char[][] A = {
            {'a','z','r','e','G','Q','q'},
            {'w','i','T','d','H','j','s','L','k','d'},
            {'f','a'},
            {'x','c','v','m'},
            {'a','f','r','h','y','B','o'}
        };

        for (int r = 0; r < A.length; r++) {
            System.out.print("Renglon " + r + ": ");
            for (int c = 0; c < A[r].length; c++) {
                System.out.print(A[r][c] + " ");
            }
            System.out.println();
        }
    }
}
