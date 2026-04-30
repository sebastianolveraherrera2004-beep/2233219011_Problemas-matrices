import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema20 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static int valor(char c) {
        c = Character.toUpperCase(c);
        if (c >= '0' && c <= '9') return c - '0';
        return c - 'A' + 10;
    }

    public static char digito(int v) {
        if (v < 10) return (char) ('0' + v);
        return (char) ('A' + (v - 10));
    }

    public static String sumar(String a, String b, int base) {
        int max = Math.max(a.length(), b.length());
        a = String.format("%" + max + "s", a).replace(' ', '0');
        b = String.format("%" + max + "s", b).replace(' ', '0');

        StringBuilder res = new StringBuilder();
        int acarreo = 0;

        for (int i = max - 1; i >= 0; i--) {
            int suma = valor(a.charAt(i)) + valor(b.charAt(i)) + acarreo;
            res.append(digito(suma % base));
            acarreo = suma / base;
        }

        while (acarreo > 0) {
            res.append(digito(acarreo % base));
            acarreo /= base;
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) throws Exception {
        System.out.print("Base: ");
        int base = sc.nextInt();
        leer();

        if (base < 2 || base > 16) {
            System.out.println("La base debe estar entre 2 y 16.");
            return;
        }

        System.out.print("Sumando A: ");
        String a = leer().toUpperCase();
        System.out.print("Sumando B: ");
        String b = leer().toUpperCase();

        String resultado = sumar(a, b, base);
        int max = Math.max(resultado.length(), Math.max(a.length(), b.length()));

        System.out.printf("%" + max + "s%n", a);
        System.out.printf("%" + max + "s%n", b);
        System.out.printf("%" + max + "s%n", resultado);
    }
}
