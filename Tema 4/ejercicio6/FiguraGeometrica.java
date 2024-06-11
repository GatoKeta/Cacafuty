package ejercicio6;


/**
 * La clase abstracta FiguraGeometrica representa una figura geométrica genérica.
 * Las subclases deben usar el método calcularArea() para ajustar
 * el cálculo del área a su tipo especifico de figura.
 * 
 * @author Sergio Alonso Pérez
 * @version 1.0
 */
public abstract class FiguraGeometrica {
    
    /**
     * Calcula el área de la figura geométrica.
     *
     * @return el área de la figura geométrica
     */
    public abstract double calcularArea();
}
