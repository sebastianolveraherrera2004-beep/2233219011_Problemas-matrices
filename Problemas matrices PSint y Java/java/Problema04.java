import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Problema04 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        Random azar = new Random();

        System.out.print("Cuantas filas tiene el arreglo: ");
        int n = sc.nextInt();

        int[][] bits = new int[n][];
        int[] decimales = new int[n];

        for (int r = 0; r < n; r++) {
            int columnas = azar.nextInt(10) + 1;
            bits[r] = new int[columnas];

            int decimal = 0;
            for (int c = 0; c < bits[r].length; c++) {
                bits[r][c] = azar.nextInt(2);
                decimal = decimal * 2 + bits[r][c];
            }
            decimales[r] = decimal;
        }

        System.out.println("Bits generados aleatoriamente para cada fila son:");
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < bits[r].length; c++) {
                System.out.print(bits[r][c]);
            }
            System.out.println(" equivale a " + decimales[r] + " decimal");
        }
    }
}
