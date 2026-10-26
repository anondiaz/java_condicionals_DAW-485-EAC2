import java.util.Scanner;

public class InputUtils {

    /*
    Revisar que queda pendiente, según el enunciado:
        - Quedan los marcados como TODO por hacer
        - Los TOREV los revisamos
    */

    // Fent la variable estàtica, assegurem que només es fa servir un Scanner
    // i que, a més, tothom fa servir el mateix.
    private static Scanner scan = new Scanner(System.in);

    // Definim quins són els codis d'error
    public static final int ERROR_INT = Integer.MIN_VALUE;
    public static final double ERROR_REAL = Double.MAX_VALUE;

    // La lectura d'un String mai pot donar un error
    // TOREV
    public static String readLine() {
        return scan.nextLine();
    }
    
    // TOREV
    // Revisa si el llegit és un nombre enter
    public static int readInt() {
        int resultat;
        if (scan.hasNextInt())
            resultat = scan.nextInt();
        else {
            // Ignorar el valor de l'entrada
            scan.next();
            resultat = ERROR_INT;
        }
        // Per llegir el <cr>
        scan.nextLine();
        return resultat;
    }

   
    // implementeu els mètodes que us proposem 
    // TODO
    public static int readInt(int valor_mínim, int valor_màxim) {
        int resultat = readInt();
        if (resultat != ERROR_INT && resultat >= valor_mínim && resultat <= valor_màxim) {
            return resultat;
        } else {
            return ERROR_INT;
        }
    }
    // TODO
    public static double readReal() {
        double resultat;
        if (scan.hasNextDouble())
            resultat = scan.nextDouble();
        else {
            // Ignorar el valor de l'entrada
            scan.next();
            resultat = ERROR_REAL;
        }
        // Per llegir el <cr>
        scan.nextLine();
        return resultat;
    }
    // TODO
    public static double readReal(double valor_mínim, double valor_màxim) {
        double resultat = readReal();
        if (resultat != ERROR_REAL && resultat >= valor_mínim && resultat <= valor_màxim) {
            return resultat;
        } else {
            return ERROR_REAL;
        }
    }

    // TOREV
    // Cal definir un mètode per tancar l'Scanner
    public static void close() {
        scan.close();
    }
}
