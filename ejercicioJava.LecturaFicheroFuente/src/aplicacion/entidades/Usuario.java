package aplicacion.entidades;

/**
 * Clase entidad para crear objetos tipo usuario. Contiene atributos, constructores y los getter & setter.
 * @author nico
 *
 */
public class Usuario {

	//Atributos
	private String nombre;
	private String apellidos;
	private int edad;
	
	//Constructor
	public Usuario(String nombre, String apellidos,int edad) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}
	
	//Propiedades lectura escritura
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//Método para toString() para mostrar los datos del usuario
	@Override
	public String toString() {
		return "\n--- Datos del usuario --- \nNombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad;
	}
	
	
	
}
