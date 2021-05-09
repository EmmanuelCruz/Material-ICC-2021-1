import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
* Ejemplos de métodos recursivos.
* @author Emmanuel Cruz Hernández.
* @version 1.0 Enero 2021.
* @since Laboratorio ICC 2021-1.
*/
public class Recursivo{

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

	public static long factorial(int n) throws NegativeFactorialException{
		if(n < 0)
			throw new NegativeFactorialException();

		if(n == 1 || n == 0)
			return 1;
		return n * factorial(n-1);
	}

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

	public static int suma2(int[] numeros){
		return sumAux(numeros, 0);
	}

	private static int sumAux(int[] numeros, int contador){
		if(numeros.length == contador)
			return 0;

		return numeros[contador]+sumAux(numeros, contador+1);
	}

	public static void menu(){

		String red = "\033[31m"; 
		String green = "\033[32m"; 
		String yellow = "\033[33m"; 
		String blue = "\033[34m"; 
		String cyan = "\033[36m"; 
		String white = "\u001B[0m";

		System.out.print(green+"\n[0] Encuentra Caracter"+
			"\n[1] factorial"+
			"\n[2] Salir"+
			"\nIngresa una opcion: "+blue);

		int op = 0;
		
		try{
			op = sc.nextInt();
			sc.nextLine();
		} catch(InputMismatchException ime){
			System.out.println(red+"\nNo ingresaste un numero");
			sc.nextLine();
			menu();
			return;
		}

		switch(op){
			case 0:
				System.out.print(yellow+"\nIngresa una cadena: ");
				String entrada = sc.nextLine();
				System.out.print("\nIngresa una caracter: ");
				String c = sc.nextLine();

				try{
					System.out.println("\nLa posicion es: " + 
					encuentraCaracter(entrada, c.charAt(0)));
				}catch(StringIndexOutOfBoundsException sioobe){
					System.out.println(red+"\nNo ingresaste un caracter válido");
				}
				
				break;

			case 1:

				System.out.print(cyan+"\nIngresa un numero: ");
				int num = 0;
				try{
					num = sc.nextInt();

					System.out.println("\nEl factorial es: "+ factorial(num));
				} catch(InputMismatchException ime){
					System.out.println(red+"\nNo ingresaste un numero");

					sc.nextLine();
				} catch(NegativeFactorialException nfe){
					System.out.println(red+"\n"+nfe.getMessage());
				} finally{
					System.out.println("\nUsaste el método factorial...");
				}

				break;

			case 2:
				System.out.println(blue+"\nSaliendo ...");
				return;

			default:
				System.out.println(red+"\nEsa opcion no esta :(");

		}

		menu();
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

		menu();
	}

}
