package ejercicio2;
import java.util.Scanner;
/*
 * 
 * 
 * EJERCICIO 2: Haz un programa que asocie un número (entre 1 y 7) a su correspondiente día de la semana.
 * @author Sergio Alonso Perez
 * @version 1.0
 */
public class SergioAlonsoPérezEjercicio2 {
	/**
	 * 
	 * Método main que pide al usuario un numero entre 1 y 7 para poder hacer el ejercicio
	 * 
	 * @param args*/
    public static void main(String[] args) {
    	
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Dime un número entre 1 y 7: ");
        int numero = leer.nextInt();
        while (numero > 7 || numero < 1) {
            System.out.println("Número no válido, introduce otro número: ");
            numero = leer.nextInt();
        }

        String dia = semana(numero);
        System.out.println("El día correspondiente al número " + numero + " es: " + dia);
    }
    
    /*
	 * Método para asignar un dia de la semana a cada numero desde 1 hasta 7
	 * 
	 * @param asignamos un dia de la semana a cada numero desde el 1 al 7
	 * @return devuelve el dia de la semana correspondiente al numero introducido por teclado.
	 * */
    public static String semana(int numero) {
        switch (numero) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Día no válido";
        }
    }
}
