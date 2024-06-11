package ejercicio6;

/**
 * La clase Cuadrado representa un cuadrado en el espacio bidimensional.
 * Extiende la clase FiguraGeometrica e implementa el método calcularArea() para calcular el área del cuadrado.
 * 
 * @author Sergio Alonso Pérez
 * @version 1.0
 */
public class Cuadrado extends FiguraGeometrica {
    private double lado;

    /**
     * Crea un cuadrado con el tamaño de lado que se especifique.
     *
     * @param lado la longitud de un lado del cuadrado
     */
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    /**
     * Calcula el área del cuadrado.
     *
     * @return el área del cuadrado
     */
    @Override
    public double calcularArea() {
        return lado * lado;
    }

}
