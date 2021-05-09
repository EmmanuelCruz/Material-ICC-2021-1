/**
* Interfaz que define operaciones sobre cadenas.
* @author Emmanuel Cruz Hernández.
* @version 1.0 Octubre 2020.
* @since Laboratorio ICC 2021-1.
*/
public interface Analizador{
	
	/**
	* Imprime cada uno de los caracteres de una cadena.
	* @param cadena la cadena a imprimir caracteres.
	*/
	public void muestraCaracteres(String cadena);

	/**
	* Convierte una cadena en letras mayúsculas.
	* @param cadena la cadena a convertir en mayúsculas.
	* @return la cadena en mayúsculas.
	*/
	public String convierteMayusculas(String cadena);

	/**
	* Concatena dos cadenas.
	* @param cadena1 la primera cadena a concatenar.
	* @param cadena2 la segunda cadena a concatenar.
	* @return cadena1 y cadena2 concatenados.
	*/
	public String concatena(String cadena1, String cadena2);

	/**
	* Intercala los caracteres de dos cadenas.
	* @param cadena1 la primera cadena a intercalar caracteres.
	* @param cadena2 la segunda cadena a intercalar caracteres.
	* @return una cadena resultante de intercalar cadena1 y cadena2.
	*/
	public String intercala(String cadena1, String cadena2);


}