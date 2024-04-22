package Ejercicio3;
/*  Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce un número:");
        int numero = scanner.nextInt();
        System.out.print("La sucesión de Ulam para " + numero + " es: ");
        while (numero != 1) {
            System.out.print(numero + ", ");
            if (numero % 2 == 0) {
                numero = numero / 2;
            } else {
                numero = numero * 3 + 1;
            }
        }
        System.out.println("1");
    }
}*/
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Por favor, introduce un número:");
	        int numero = scanner.nextInt();
	        System.out.print("La sucesión de Ulam para " + numero + " es: ");
	        while (numero != 1) {
	            System.out.print(numero + ", ");
	            if (numero % 2 == 0) {
	                numero = numero / 2;
	            } else {
	                numero = numero * 3 + 1;
	            }
	        }
	        System.out.println("1");
	    }
	}