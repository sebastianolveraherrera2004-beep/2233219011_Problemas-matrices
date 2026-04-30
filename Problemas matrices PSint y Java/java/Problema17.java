import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema17 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String leer() throws Exception {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        System.out.print("No. de alumnos: ");
        int n = Integer.parseInt(leer());
        System.out.print("No. de materias por alumno: ");
        int x = Integer.parseInt(leer());

        String[] nombres = new String[n];
        int[][] calif = new int[n][x];
        int[] promedios = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nombre: ");
            nombres[i] = leer();
            int suma = 0;
            for (int j = 0; j < x; j++) {
                System.out.print("Calif " + (j + 1) + ": ");
                calif[i][j] = Integer.parseInt(leer());
                suma += calif[i][j];
            }
            promedios[i] = suma / x;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nombres[j].compareToIgnoreCase(nombres[j + 1]) > 0) {
                    String tn = nombres[j]; nombres[j] = nombres[j + 1]; nombres[j + 1] = tn;
                    int tp = promedios[j]; promedios[j] = promedios[j + 1]; promedios[j + 1] = tp;
                    int[] tc = calif[j]; calif[j] = calif[j + 1]; calif[j + 1] = tc;
                }
            }
        }

        int sumaGrupo = 0;
        System.out.print("Nombre");
        for (int j = 0; j < x; j++) {
            System.out.print("\tCalif " + (j + 1));
        }
        System.out.println("\tPromedio");

        for (int i = 0; i < n; i++) {
            System.out.print(nombres[i]);
            for (int j = 0; j < x; j++) {
                System.out.print("\t" + calif[i][j]);
            }
            System.out.println("\t" + promedios[i]);
            sumaGrupo += promedios[i];
        }

        System.out.println("Promedio del Gpo.= " + (sumaGrupo / n));
    }
}
