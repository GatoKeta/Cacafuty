package ejercicio1;
import java.util.Scanner;

public class Temperatura2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double temperatura = 0;
        System.out.print("Por favor, introduzca una temperatura: ");
        temperatura = leer.nextDouble();
        if (temperatura < -11 || temperatura > 40) {
            System.out.println("Por favor, introduzca un número válido.");
        } else {
            System.out.println("El deporte propuesto es " + deporte(temperatura));
        }
    }

    public static String deporte(double temperatura) {
        if (temperatura >= -10 && temperatura <= 0) {
            return "Esquí";
        } else if (temperatura >= 1 && temperatura <= 10) {
            return "Atletismo";
        } else if (temperatura >= 11 && temperatura <= 20) {
            return "Fútbol";
        } else if (temperatura >= 21 && temperatura <= 30) {
            return "Balonmano";
        } else {
            return "Bádminton";
        }
    }
}
