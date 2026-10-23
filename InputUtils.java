import java.util.Scanner;

public class InputUtils {

    /*
    Revisar que queda pendiente, según el enunciado:
        quedan los marcados como TODO por hacer
        los TOREV los revisamos
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
    readInt(valor_mínim, valor_màxim)
    // TODO
    readReal()
    // TODO
    readReal(valor_mínim, valor_màxim)

    // TOREV
    // Cal definir un mètode per tancar l'Scanner
    public static void close() {
        scan.close();
    }
}
