package ejercicio6;
/**
 * La clase CalculadoraGeometria proporciona métodos estáticos para calcular el área de diferentes figuras geométricas.
 * 
 * @author Sergio Alonso Pérez
 * @version 2.0
 */
public class CalculadoraGeometria {

    /**
     * Calcula el área de un círculo dado su radio.
     *
     * @param radio el radio del círculo
     * @return el área del círculo
     */
    public static double aCirculo(double radio) {
        double resultado = Math.PI * radio * radio;
        return resultado;
    }

    /**
     * Calcula el área de un cuadrado dado su lado.
     *
     * @param lado el lado del cuadrado
     * @return el área del cuadrado
     */
    public static double aCuadrado(double lado) {
        return lado * lado;
    }
}
