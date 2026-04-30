import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Problema15 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        Random azar = new Random();

        System.out.print("Filas: ");
        int f = sc.nextInt();
        System.out.print("Columnas: ");
        int col = sc.nextInt();

        int[][] m = new int[f][col];

        System.out.println("Matriz");
        for (int r = 0; r < f; r++) {
            for (int c = 0; c < col; c++) {
                m[r][c] = azar.nextInt(30) - 9;
                System.out.printf("%5d", m[r][c]);
            }
            System.out.println();
        }

        System.out.println("Transpuesta:");
        for (int c = 0; c < col; c++) {
            for (int r = 0; r < f; r++) {
                System.out.printf("%5d", m[r][c]);
            }
            System.out.println();
        }

        if (f == col) {
            int suma = 0;
            for (int i = 0; i < f; i++) {
                if (m[i][i] % 2 != 0) {
                    suma += m[i][i];
                }
            }
            System.out.println("Matriz cuadrada.");
            System.out.println("Suma de impares de diagonal = " + suma);
        } else {
            int suma = 0;
            for (int r = 0; r < f; r++) {
                for (int c = 0; c < col; c++) {
                    boolean periferia = r == 0 || r == f - 1 || c == 0 || c == col - 1;
                    if (periferia && m[r][c] % 7 == 0) {
                        suma += m[r][c];
                    }
                }
            }
            System.out.println("No es cuadrada.");
            System.out.println("Suma de multiplos de 7 de periferia = " + suma);
        }
    }
}
