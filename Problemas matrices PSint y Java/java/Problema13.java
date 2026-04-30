import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema13 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        System.out.print("n: ");
        int n = sc.nextInt();

        int[] datos = new int[n];
        int[] dif = new int[n - 1];

        System.out.println("Dame los " + n + " numeros:");
        for (int i = 0; i < n; i++) {
            datos[i] = sc.nextInt();
        }

        int mayor = -1;
        int posMayor = 0;

        System.out.println("Diferencia entre consecutivos");
        for (int i = 0; i < n - 1; i++) {
            dif[i] = Math.abs(datos[i + 1] - datos[i]);
            System.out.println(dif[i]);
            if (dif[i] > mayor) {
                mayor = dif[i];
                posMayor = i;
            }
        }

        System.out.println("La diferencia mayor es " + mayor +
                " y esta entre el " + datos[posMayor] + " y " + datos[posMayor + 1]);
    }
}
