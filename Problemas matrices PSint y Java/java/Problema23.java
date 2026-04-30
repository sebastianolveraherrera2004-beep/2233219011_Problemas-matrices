import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema23 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void convertir(char[] arreglo) {
        String cadena = "";
        for (int i = 0; i < arreglo.length; i++) {
            cadena += arreglo[i];
        }

        int numero = Integer.parseInt(cadena);

        System.out.println("La cadena es " + cadena);
        System.out.println("Convertido a numero y multiplicado por 2 es " + (numero * 2));
    }

    public static void main(String[] args) throws Exception {
        char[] a = {'1', '5', '3', '8', '6', '2'};
        char[] b = {'4', '0', '1'};

        convertir(a);
        convertir(b);
    }
}
