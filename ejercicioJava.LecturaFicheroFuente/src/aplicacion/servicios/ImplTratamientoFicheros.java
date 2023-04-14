package aplicacion.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Clase que implementa la interfaz para la gestión del tratamiento de fichero y define el funcionamiento de dicho métodos.
 * @author nico
 *
 */
public class ImplTratamientoFicheros implements InterfazTramientoFicheros{

	@Override
	public void lecturaFichero(String rutaFichero) {
		
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {

			// Apertura del fichero y creacion de BufferedReader para poder	
			// hacer una lectura comoda (disponer del metodo readLine()).
	
			archivo = new File (rutaFichero);	
			fr = new FileReader (archivo);	
			br = new BufferedReader(fr);
	
			// Lectura del fichero
	
			String linea = "";
			
			while(linea!=null) {	
				linea=br.readLine();
				System.out.println(linea);
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
	}

	
}
