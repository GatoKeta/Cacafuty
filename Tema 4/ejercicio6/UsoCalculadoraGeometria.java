package ejercicio6;
/**
 * La clase UsoCalculadoraGeometria que se usa para calcular el área de un círculo y un cuadrado utilizando la clase Circulo y la clase Cuadrado.
 * 
 * @author Sergio Alonso Pérez
 * @version 2.0
 */
public class UsoCalculadoraGeometria {
    
    /**
     * El método principal que se ejecuta al iniciar el programa.
     *
     * @param args
     */
    public static void main(String[] args) {
        // Definir los valores para el radio y el lado
        double radio = 5;
        double lado = 10;

        // Crear una instancia de Circulo con el radio dado
        Circulo circulo = new Circulo(radio);
        
        // Crear una instancia de Cuadrado con el lado dado
        Cuadrado cuadrado = new Cuadrado(lado);

        // Imprimir el área del círculo y del cuadrado
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }
}
