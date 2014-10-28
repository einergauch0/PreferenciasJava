package com.uniquindio.fundamentos.store;

import java.util.prefs.Preferences;

/**
 * Esta clase tiene la funcion de darle persitencia a tipos de datos primitivos
 * y String
 * @author Einer Zapata
 * @version 1.0 - 05/10/2014
 */
public class Preferencias {

	/**
	 * Variable estatica que guardara las preferencias
	 */
	private Preferences preferences ;
	
	/**
	 * El método constructor de la clase es privado para obligar a llamar al
	 * método getInstance
	 */
	public Preferencias() {
		preferences = Preferences
				.userNodeForPackage(com.uniquindio.fundamentos.store.Preferencias.class);
	}

		/**
	 * Guarda un dato de tipo String 
	 * @param llave 
	 * llave que servirá para obtener el dato almacenado
	 * @param dato 
	 * dato que se desea guardar
	 */
	public void salvarCadena(String llave, String dato) {
		preferences.put(llave, dato);
	}

	/**
	 * Guarda un dato de tipo int 
	 * @param llave 
	 * llave que servirá para obtener el dato almacenado
	 * @param dato 
	 * dato que se desea guardar
	 */
	public void salvarEntero(String llave, int dato) {
		preferences.putInt(llave, dato);
	}

	/**
	 * Guarda un dato de tipo boolean 
	 * @param llave 
	 * llave que servirá para obtener el dato almacenado
	 * @param estado 
	 * estado que se desea guardar
	 */
	public void salvarEstado(String llave, boolean estado) {
		preferences.putBoolean(llave, estado);
	}

	/**
	 * Guarda un dato de tipo boolean 
	 * @param llave 
	 * llave que servirá para obtener el dato almacenado
	 * @param estado 
	 * estado que se desea guardar
	 */
	public void borrarDato(String llave) {
		preferences.remove(llave);
	}

	/**
	 * Retorna una cadena segun la llave especificada
	 * @param llave
	 * llave que indica que cadena se debe retornar
	 * @param cadenaPoDefecto
	 * esta cadena retornara si la llave especificada no puede ser obtenida
	 * @return dato almacenado con la llave especificada
	 */
	public String obtenerCadena(String llave, String cadenaPoDefecto) {
		return preferences.get(llave, cadenaPoDefecto);
	}

	/**
	 * Retorna un numero entero según la llave especificada
	 * @param llave
	 * llave que indica que numero se debe retornar
	 * @param enteroPoDefecto
	 * este entero retornara si la llave especificada no puede ser obtenida
	 * @return dato almacenado con la llave especificada
	 */
	public int obtenerEntero(String llave, int enteroPoDefecto) {
		return preferences.getInt(llave, enteroPoDefecto);
	}
	
	/**
	 * Retorna un estado boolean según la llave especificada
	 * @param llave
	 * llave que indica que estado se debe retornar
	 * @param estadoPoDefecto
	 * este boolean retornara si la llave especificada no puede ser obtenida
	 * @return dato almacenado con la llave especificada
	 */
	public boolean obtenerEstado(String llave, boolean estadoPoDefecto) {
		return preferences.getBoolean(llave, estadoPoDefecto);
	}
	
}
