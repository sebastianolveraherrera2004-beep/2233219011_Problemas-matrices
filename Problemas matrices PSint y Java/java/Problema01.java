import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Problema01 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        Random azar = new Random();
        int[][] a = new int[6][5];

        for (int c = 0; c < a[0].length; c++) {
            for (int r = 0; r < a.length; r++) {
                a[r][c] = azar.nextInt(801) + 100;
            }
        }

        System.out.println("Arreglo generado:");
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                System.out.printf("%5d", a[r][c]);
            }
            System.out.println();
        }
    }
}
