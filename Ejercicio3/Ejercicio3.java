package Ejercicio3;

import java.util.Iterator;
import java.util.Scanner;

/*Haz un programa que calcule el factorial de un número dado por el
usuario.*/
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		long resultado=1;
		int numero=0;
		
		System.out.println("Dame un numero para hacer el factorial: ");
		numero=leer.nextInt();
		
		for (int i = 2; i <= numero; i++) {
			resultado*=i;
		}
		
		System.out.println("El factorial de un numero es: "+resultado);

	}

}
