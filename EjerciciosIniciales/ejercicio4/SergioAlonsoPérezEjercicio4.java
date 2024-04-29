package ejercicio4;

import java.util.Iterator;
import java.util.Scanner;

/*
 * ACTIVIDAD 3
 * Haz un programa que calcule el factorial de un número dado por el usuario.
 * 
 * @author Víctor González Villapalo
 * @version 1.0
 */


public class SergioAlonsoPérezEjercicio4 {

	/*
	 * el metodo main tiene un do while que se ejecutara siempre que el usuario no introduzca un numero mayor a 0
	 * 
	 * @param args
	 * */
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int numero=0;
		do {
			System.out.print("Escribe un número para calcular su factorial (Debe ser mayor a 0): ");
			numero = leer.nextInt();
			}while(numero <=0);
		
		System.out.println("El factorial de " + numero + " es " + factorial(numero));

	}

	/*
	 * 
	 * 
	 * el metodo factorial, donde se ejecutara la operacion para sacar el factorial de el numero escrito por el usuario
	 * 
	 * @param recoge el número escrito por el usuario 
	 * @return devuelve el resultado de la operación del factorial
	 * */
	private static int factorial(int numero) {
		int resultado=1;
		for (int i = numero; i > 0; i--) {
			resultado = resultado * i;

		}
		return resultado;
	}

}