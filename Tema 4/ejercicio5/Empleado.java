package ejercicio5;
/**
 * La clase Empleado representa a un empleado en una empresa.
 * Contiene información como nombre, apellido, edad, salario, departamento, etc.
 * 
 * @author Sergio Alonso Pérez
 * @version 1.0
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    private String departamento;
    private int id;
    private String direccion;
    private String telefono;
    private String email;
    
    /**
     * Constructor para la clase Empleado.
     * 
     * @param nombre El nombre del empleado.
     * @param apellido El apellido del empleado.
     * @param edad La edad del empleado.
     * @param salario El salario del empleado.
     * @param departamento El departamento al que pertenece el empleado.
     * @param id El ID del empleado.
     * @param direccion La dirección del empleado.
     * @param telefono El número de teléfono del empleado.
     * @param email El correo electrónico del empleado.
     */
    public Empleado(String nombre, String apellido, int edad, double salario, String departamento, int id,
            String direccion, String telefono, String email) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * Obtiene el nombre del empleado.
     * 
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * 
     * @param nombre El nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
