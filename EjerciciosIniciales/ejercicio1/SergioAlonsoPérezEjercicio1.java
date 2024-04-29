package ejercicio1;


import java.util.Scanner;

/* 
 * Clase para realizar la Actividad 1 de los ejercicios de Repaso de estructuras de control.
 * 
 * ACTIVIDAD 1
 * Haz un programa que proponga el deporte que debes practicar en función de la temperatura que haga, siguiendo las siguientes directrices:
 * 
 * Entre -10 y 0 grados (incluidos): Esquí.
 * Entre 0 y 10 grados (incluido): Atletismo.
 * Entre 10 y 20 grados (incluido): Fútbol.
 * Entre 20 y 30 grados (incluido): Balonmano.
 * Más de 30 grados (hasta 40): Bádminton.
 * 
 * @author Sergio Alonso Perez
 * @version 1.0
 */

public class SergioAlonsoPérezEjercicio1 {
	
	/*
	 *tenemos un metodo main donde se va ejecutar un bucle do while para preguntar
	 *al usuario los grados que va a hacer, para asignar la temperatura a un deporte en especifico 
	 *y poder imprimir ese deporte
	 *
	 * @param args
	 * */
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int temperatura=0;
		
		do {
				System.out.print("Introduce una temperatura (en grados) para asignar un deporte (desde -10 hasta 40): ");
				temperatura = leer.nextInt();

		} while (temperatura < -10 || temperatura > 40);
		
		System.out.println("La temperatura de " + temperatura + " grados esta asignada a "+ deportes(temperatura));
	}

	
	/*
	 * Método para realizar la asignacion del deporte segun la temperatura dada
	 * 
	 * @param comprobamos la temperatura ingresada por el usuario y le asignamos un deporte
	 * @return devuelve el deporte según el valor de la temperatura.

	 * */
	private static String deportes(int temperatura) {
		if(temperatura <=-10 || temperatura <=0) {
			return "Esquí";
		} else if (temperatura <=0 || temperatura <=10) {
			return "Atletismo";
		} else if (temperatura <=10 || temperatura <=20) {
			return "Fútbol";
		} else if (temperatura <=20 || temperatura <=30) {
			return "Balonmano";
		} else if (temperatura <=30 || temperatura <=40) {
			return "Bádminton";
		}
		return null;
	}
}