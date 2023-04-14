package aplicacion.controlador;

import java.util.ArrayList;
import java.util.List;

import aplicacion.entidades.Usuario;
import aplicacion.servicios.ImplTratamientoFicheros;
import aplicacion.servicios.InterfazTramientoFicheros;

/**
 * Clase principal por la cual entra la ejecución en nuestra aplicación y tendrá el procedimiento a seguir de la misma. 
 * @author nico
 *
 */
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Usuario>listaUser = new ArrayList<Usuario>();
		
		InterfazTramientoFicheros gestionFichero = new ImplTratamientoFicheros();
		gestionFichero.lecturaFichero("C:\\Users\\niko_\\Desktop\\ejercicio.txt",listaUser);
		
		//Se recorre la lista para mostrar los datos de los usuarios
		for(Usuario u : listaUser) {
			System.out.println(u.toString());
		}
		
	}

}
