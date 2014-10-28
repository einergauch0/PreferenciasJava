import com.uniquindio.fundamentos.store.Preferencias;

/**
 * En esta clase arranca la aplicación
 * @author Einer - 05/10/2014
 */
public class Aplicacion {

	/**
	 * Método principal de la aplicación
	 * @param args
	 */
	public static void main(String[] args) {
		
		// se reserva memoria para las preferencias, preferiblemete una vez por aplicacion
		Preferencias preferencias= new Preferencias();
		
		//como obtener una cadena
		System.out.println(preferencias.obtenerCadena("nombre1", "no especificado"));
		//como obtener un entero
		System.out.println(preferencias.obtenerEntero("edad1", 0));
		//como obtener un estado
		System.out.println(preferencias.obtenerEstado("habilitado1", false));
		
		// como salvar una cadena o modificarla
		preferencias.salvarCadena("nombre1", "Juan Fernando");
		//como salvar un entro o modificarla
		preferencias.salvarEntero("edad1",22 );
		//como salvar un estado o modificarla
		preferencias.salvarEstado("habilitado1", true);
		
		//como borrar un dato
		preferencias.borrarDato("nombre1");
		
	}

}
