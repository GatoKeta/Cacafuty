package ejercicio5;

/**
 * GestorEmpleados es una clase que proporciona métodos para la gestión de empleados.
 * 
 * @author Sergio Alonso Pérez
 * @version 2.0
 */
public class GestorEmpleados {

    /**
     * Recoge la información de un empleado, calcula su salario anual, bonificación y
     * muestra los detalles del empleado por consola.
     * 
     * @param empleado El objeto Empleado cuya información se va a procesar.
     */
    public void procesarEmpleado(Empleado empleado) { 
        double salarioAnual = empleado.getSalario() * 12;  
        double bonificacion = empleado.getSalario() * 0.1;
        
        // Llamada al método imprimirDetallesEmpleado
        imprimirDetallesEmpleado(empleado, salarioAnual, bonificacion);
        
        double salarioTotal = salarioAnual + bonificacion;
        System.out.println("Salario Total Anual: " + salarioTotal);
    }

    /**
     * Imprime los detalles de un empleado, incluyendo su nombre, salario anual, bonificación
     * y departamento.
     * 
     * @param empleado El objeto Empleado del cual se imprimirán los detalles.
     * @param salario El salario anual del empleado.
     * @param bonificacion La bonificación del empleado.
     */
    public void imprimirDetallesEmpleado(Empleado empleado, double salario, double bonificacion) {
        System.out.println("Nombre: " + empleado.getNombre() + " " + empleado.getApellido());
        System.out.println("Salario Anual: " + salario);
        System.out.println("Bonificación: " + bonificacion);
        System.out.println("Departamento: " + empleado.getDepartamento());
    }

    /**
     * Calcula el incremento salarial para un empleado basado en su salario actual y los años de
     * experiencia.
     * 
     * @param salario El salario actual del empleado.
     * @param anos Los años de experiencia del empleado.
     * @return El nuevo salario después de aplicar el incremento.
     */
    public double calcularIncrementoSalario(double salario, int anos) {
        double incremento = salario * 0.05 * anos;  
        return salario + incremento;
    }

    /**
     * Calcula la cantidad de días de vacaciones para un empleado basado en sus años de servicio.
     * 
     * @param anos Los años de servicio del empleado.
     * @return La cantidad de días de vacaciones correspondientes.
     */
    public int calcularVacaciones(int anos) {
        int base = 20;
        if (anos > 10) {
            return base + 5;  
        }
        return base;
    }
}

