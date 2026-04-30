import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema06 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        int[][] arr = {
            {1, 9, 5, -2, -2, 0},
            {1, 3, 12, 76},
            {9, 5, 7, 80, 45, 34, 26, 12, 45, -1, -9},
            {5, 7, 2}
        };

        int r, c, uno, dos;
        for (r = 0; r < arr.length; r++) {
            c = 0;
            uno = arr[r][c];
            dos = arr[r][c];

            for (c = 1; c < arr[r].length; c++) {
                if (uno > arr[r][c]) {
                    uno = arr[r][c];
                }
                if (dos < arr[r][c]) {
                    dos = arr[r][c];
                }
            }
            System.out.println(uno + " " + dos);
        }
    }
}
