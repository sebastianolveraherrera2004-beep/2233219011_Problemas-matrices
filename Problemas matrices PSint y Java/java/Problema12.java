import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Problema12 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        Random azar = new Random();

        System.out.print("n: ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];

        int sumaDiagonal = 0;
        int sumaMultiplos3Arriba = 0;

        System.out.println("Matriz");
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                m[r][c] = azar.nextInt(13);
                System.out.printf("%4d", m[r][c]);

                if (r == c) {
                    sumaDiagonal += m[r][c];
                }
                if (r < c && m[r][c] % 3 == 0) {
                    sumaMultiplos3Arriba += m[r][c];
                }
            }
            System.out.println();
        }

        System.out.println("Suma de la diagonal = " + sumaDiagonal);
        System.out.println("Suma de multiplos de 3 arriba de la diagonal = " + sumaMultiplos3Arriba);
    }
}
