import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema07 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Enunciado:");
        System.out.println("Dado un arreglo bidimensional irregular de enteros, recorrer cada renglon");
        System.out.println("para encontrar e imprimir el valor menor y el valor mayor de cada renglon.");
    }
}
