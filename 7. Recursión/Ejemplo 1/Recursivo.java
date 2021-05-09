import java.util.Arrays;
import java.util.Scanner;

/**
* Ejemplos de métodos recursivos.
* @author Emmanuel Cruz Hernández.
* @version 1.0 Enero 2021.
* @since Laboratorio ICC 2021-1.
*/
public class Recursivo{

	/** Scanner de manejo del programa. */
	private static Scanner sc = new Scanner(System.in);
	
	/**
	* Encuentra la posición de un caracter caracter 
	* en una cadena.
	* @param cadena la cadena a buscar el caracter.
	* @param c a buscar en cadena.
	* @return la posición del caracter en la cadena o -1
	* si no se encuentra contenido.
	*/
	public static int encuentraCaracter(String cadena, char c){
		// Caso base. Cuando cadena es vacia.

		if(cadena.length() == 0)
			return -1;

		// Caso base. Cuando el últmo caracter es c.

		int longitud = cadena.length()-1;

		if(cadena.charAt(longitud) == c)
			return longitud;

		// Caso recursivo

		return encuentraCaracter(cadena.substring(0, longitud), c);
	}

	/**
	* Permite saber si dos cadenas son iguales.
	* @param cadena1 la primera cadena a comparar.
	* @param cadena2 la sugunda cadena a comparar.
	* @return true si son iguales, false en otro caso.
	*/
	public static boolean esIgual(String cadena1, String cadena2){

		// Caso base. Si ambas son vacías es true

		if(cadena1.length() == 0 && cadena2.length() == 0)
			return true;

		// Case base. Si tienen distinta longitud es false.

		if(cadena1.length() != cadena2.length())
			return false;

		// Case base. Si el primer caracter es diferente es false.

		if(cadena1.charAt(0) != cadena2.charAt(0))
			return false;

		// Caso recursivo

		return esIgual(cadena1.substring(1), cadena2.substring(1));
	}

	/**
	* Encuentra caracter recursivo.
	* @param cadena la cadena a buscar el caracter.
	* @param c a buscar en cadena.
	* @param counter el contador de posiciones.
	* @return la posición del caracter en la cadena o -1
	* si no se encuentra contenido.
	*/
	private static int encuentraCaracterR(String cadena, char c, int counter){
		// Caso base. Cuando cadena es vacia.

		System.out.println(cadena);

		if(cadena.length() == 0)
			return -1;

		// Caso base. Cuando el primer caracter es c.

		if(cadena.charAt(0) == c)
			return counter;

		// Caso recursivo.

		return encuentraCaracterR(cadena.substring(1), c, counter+1);
	}

	/**
	* Calcula el factorial de un entero n.
	* @param n el numero a calcularle factorial
	* @return el factorial de n.
	*/
	public static long factorial(int n){
		if(n < 0)
			return 0;
		if(n == 1 || n == 0)
			return 1;
		return n * factorial(n-1);
	}

	/**
	* Calcula la suma de los elementos contenidos en un arreglo.
	* @param numeros el arreglo de enteros para calcular suma.
	* @return la suma de los elementos contenidos en el arreglo.
	*/
	public static int suma(int[] numeros){
		// Caso. La longitud del arreglo es 0.

		if(numeros.length == 0)
			return 0;

		// Caso. Solo 1 elemento. Este caso se podria omitir

		if(numeros.length == 1)
			return numeros[0];

		// Recursivo

		int ultimo = numeros.length -1;

		return numeros[ultimo] + suma(Arrays.copyOf(numeros, ultimo));

	}

	/**
	* Calcula la suma de los elementos contenidos en un arreglo.
	* @param numeros el arreglo de enteros para calcular suma.
	* @return la suma de los elementos contenidos en el arreglo.
	*/
	public static int suma2(int[] numeros){
		return sumAux(numeros, 0);
	}

	/**
	* Auxiliar para calcular la suma de los elementos de un arreglo
	* de forma recursiva.
	* @param numeros el arreglo de enteros a calcular suma.
	* @param contador la cantidad de invocaciones hechas al método.
	* @return la suma de los elementos contenidos en el arreglo.
	*/
	private static int sumAux(int[] numeros, int contador){
		if(numeros.length == contador)
			return 0;

		return numeros[contador]+sumAux(numeros, contador+1);
	}

	public static void main(String[] args) {
		//System.out.println(encuentraCaracter("Cadena de ejemplo", 'z'));

		//System.out.println(factorial(0));

		//System.out.println(esIgual("Hola mundo", "Hola mundo loco"));

		/*
		int[] arr = {1,2,3,4,5, 10};

		System.out.println(suma(arr));

		System.out.println(suma2(arr));
		*/

	}

}
