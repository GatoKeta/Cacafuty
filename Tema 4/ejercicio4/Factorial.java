package ejercicio4;
import java.util.Scanner;

/**
 * La clase Factorial calcula el factorial de un número dado.
 * 
 * @author Sergio Alonso Pérez
 * @version 2.0
 */
public class Factorial {

    /** El valor inicial del factorial. */
    private static final double FACTORIAL_INICIAL = 1;

    /**
     * Método principal que solicita al usuario un número y calcula su factorial.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        double numero;
        Scanner sc = new Scanner(System.in);

        // Solicita al usuario un número
        System.out.println("Introduzca un numero mayor o igual a cero: ");
        numero = sc.nextDouble();

        // Calcula el factorial de un número
        double factorial = calcularFactorial(numero);

        // Imprime el resultado del factorial
        System.out.println(factorial);

    }

    /**
     * Calcula el factorial de un número dado.
     * 
     * @param numero El número del cual se calculará el factorial.
     * @return El factorial del número dado.
     */
    public static double calcularFactorial(double numero) {
        // Inicializa el factorial con el valor inicial
        double factorial = FACTORIAL_INICIAL;

        // Calcula el factorial del número
        while ((numero != 0) && (numero != 1)) {
            factorial *= numero;
            numero--;
        }

        return factorial;
    }

}

