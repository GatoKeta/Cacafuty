package ejercicio6;

/**
 * La clase Circulo representa un círculo bidimensional.
 * Extiende la clase FiguraGeometrica y e implementa el método calcularArea() para calcular el área del círculo.
 * 
 * @author Sergio Alonso Pérez
 * @version 1.0
 */
public class Circulo extends FiguraGeometrica {
    private double radio;

    /**
     * Crea un círculo con el radio especificado.
     *
     * @param radio el radio del círculo
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * Calcula el área del círculo.
     *
     * @return el área del círculo
     */
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

}
