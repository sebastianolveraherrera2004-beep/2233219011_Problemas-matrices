import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema11 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        System.out.print("n: ");
        int n = Integer.parseInt(leer());
        String[] nombres = new String[n];

        System.out.println("Dame los " + n + " nombres:");
        for (int i = 0; i < n; i++) {
            nombres[i] = leer().toUpperCase();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nombres[j].compareTo(nombres[j + 1]) > 0) {
                    String temp = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = temp;
                }
            }
        }

        System.out.println("Ordenados");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
