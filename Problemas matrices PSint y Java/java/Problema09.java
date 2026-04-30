import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema09 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        System.out.print("De cuantos renglones quieres la figura de triangulo: ");
        int n = sc.nextInt();

        char[][] t = new char[n][];
        for (int r = 0; r < n; r++) {
            t[r] = new char[r + 1];
            for (int c = 0; c < t[r].length; c++) {
                t[r][c] = '*';
            }
        }

        for (int r = 0; r < t.length; r++) {
            for (int c = 0; c < t[r].length; c++) {
                System.out.print(t[r][c] + " ");
            }
            System.out.println();
        }
    }
}
