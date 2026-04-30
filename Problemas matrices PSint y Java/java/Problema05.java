import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Problema05 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void generar(int[][] a) {
        Random azar = new Random();
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                a[r][c] = azar.nextInt(90) + 10;
            }
        }
    }

    public static void imprimirArreglo(int[][] a) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                System.out.printf("%4d", a[r][c]);
            }
            System.out.println();
        }
    }

    public static void imprimirRecorrido(int[][] a, int r, int c, int n) {
        System.out.println("Los numeros por los que se paso son:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[r][c] + " ");
            r = (r + 1) % a.length;
            c = (c + 1) % a[0].length;
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int[][] a = new int[4][7];

        generar(a);
        System.out.println("Los numeros generados en el arreglo son:");
        imprimirArreglo(a);

        System.out.print("Renglon inicial (0 a 3): ");
        int r = sc.nextInt();
        System.out.print("Columna inicial (0 a 6): ");
        int c = sc.nextInt();
        System.out.print("Cuantas veces hacer el recorrido: ");
        int n = sc.nextInt();

        imprimirRecorrido(a, r, c, n);
    }
}
