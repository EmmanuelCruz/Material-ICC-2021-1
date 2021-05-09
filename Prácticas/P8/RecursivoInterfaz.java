/**
* Define las operaciones a implementar en la practica 8.
* Temas: Recursion y Excepciones.
* @author Emmanuel Cruz Hernandez.
* @version 1.0 Enero 2021.
* @since Practica 8 del curso de ICC, semestre 2021-1.
*/
public interface RecursivoInterfaz{

	/**
	* Permite saber si un numero es palindromo.
	* @param n el entero a verificar.
	* @return true si n es palindromo, false en otro caso.
	* @throws NegativeNumberException si x es estrictamente negativo.
	*/
	public boolean isPalindrome(int x) throws NegativeNumberException;

	/**
	* Verifica si un estudiante puede ser recompensado de acuerdo con su
	* registro de asistencia.
	* @param s la cadena con el registro de asistencia de un alumno.
	* @return true si el estudiante puede ser recompensado, false en otro caso.
	* @throws InvalidCharException si alguno de los caracteres de s es distinto de
	* 'A', 'R' o 'P'.
	*/
	public boolean checkRecord(String s) throws InvalidCharException;

	/**
	* Suma todos los digitos de un numero hasta tener solo un digito.
	* @param num el numero a sumar digitos.
	* @return la suma resultante de un solo digito.
	* @throws InvalidRangeException si num esta fuera del rango [0, 99].
	*/
	public int addDigits(int num) throws InvalidRangeException;

	/**
	* Regresa la longitud de la ultima palabra contenida en una cadena.
	* @param phrase la cadena de palabras.
	* @return la longitud de la ultima palabra de la cadena.
	* @throws EmptyPhraseException si la cadena que pasa como parametro es la
	* cadena vacia.
	*/
	public int lengthOfLastWord(String phrase) throws EmptyPhraseException;

}