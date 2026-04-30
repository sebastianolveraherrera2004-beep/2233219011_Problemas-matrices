import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Problema14 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void imprimir(int[][] m) {
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                System.out.printf("%5d", m[r][c]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Random azar = new Random();

        System.out.print("Filas de A: ");
        int fa = sc.nextInt();
        System.out.print("Columnas de A: ");
        int ca = sc.nextInt();
        System.out.print("Filas de B: ");
        int fb = sc.nextInt();
        System.out.print("Columnas de B: ");
        int cb = sc.nextInt();

        int[][] A = new int[fa][ca];
        int[][] B = new int[fb][cb];

        for (int r = 0; r < fa; r++) {
            for (int c = 0; c < ca; c++) {
                A[r][c] = azar.nextInt(30) - 9;
            }
        }

        for (int r = 0; r < fb; r++) {
            for (int c = 0; c < cb; c++) {
                B[r][c] = azar.nextInt(30) - 9;
            }
        }

        System.out.println("Matriz A");
        imprimir(A);
        System.out.println("Matriz B");
        imprimir(B);

        if (ca != fb) {
            System.out.println("No es posible multiplicar: columnas de A deben ser iguales a filas de B.");
            return;
        }

        int[][] C = new int[fa][cb];

        for (int r = 0; r < fa; r++) {
            for (int c = 0; c < cb; c++) {
                for (int k = 0; k < ca; k++) {
                    C[r][c] += A[r][k] * B[k][c];
                }
            }
        }

        System.out.println("Matriz C");
        imprimir(C);
    }
}
