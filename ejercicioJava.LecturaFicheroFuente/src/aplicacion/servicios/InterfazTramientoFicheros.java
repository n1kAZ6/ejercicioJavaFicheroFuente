package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.Usuario;

/**
 * Interfaz que tiene la cabecera de los métodos que dan servicio a la gestión de ficheros
 * @author nico
 *
 */
public interface InterfazTramientoFicheros {

	/**
	 * Método que realiza la lectura del fichero de la ruta que recibe por argumento
	 * @param rutaFichero
	 * @param listaUser en la que se registran los usuarios con los valores de la lectura del fichero
	 * @return
	 */
	List<Usuario> lecturaFichero(String rutaFichero, List<Usuario>listaUser);
	
	
}
