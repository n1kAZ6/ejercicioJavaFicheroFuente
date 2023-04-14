package aplicacion.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import aplicacion.entidades.Usuario;

/**
 * Clase que implementa la interfaz para la gestión del tratamiento de fichero y define el funcionamiento de dicho métodos.
 * @author nico
 *
 */
public class ImplTratamientoFicheros implements InterfazTramientoFicheros{

	@Override
	public List<Usuario> lecturaFichero(String rutaFichero, List<Usuario>listaUser) {
		
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {

			// Apertura del fichero y creacion de BufferedReader para poder	
			// hacer una lectura comoda (disponer del metodo readLine()).
	
			archivo = new File (rutaFichero);	
			fr = new FileReader (archivo);	
			br = new BufferedReader(fr);
	
			// Lectura del ficheros
	
			String linea = "";
			String[]vCampos;
			while((linea=br.readLine())!=null) {	
				vCampos=linea.split(";");
				crearUsuario(vCampos[0],vCampos[1],Integer.parseInt(vCampos[2]),listaUser);
			}
		} catch(Exception e){
			e.printStackTrace();
		}finally{

			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
	
			try {
				if( null != fr )		
					fr.close();
			} catch (Exception e2) {	
				e2.printStackTrace();	
			}
		}
		return listaUser;
	}

	/**
	 * Método que crea objetos tipo usuario con los campos que recibe por parámetro y los guarda en la lista
	 * @param campoNombre
	 * @param campoApellido
	 * @param edad
	 * @param listaUser
	 * @return
	 */
	private List<Usuario> crearUsuario(String campoNombre, String campoApellido, int edad, List<Usuario> listaUser) {
		
		listaUser.add(new Usuario(campoNombre,campoApellido,edad));

		return listaUser;
	}



	
}
