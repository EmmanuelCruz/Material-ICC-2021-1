import java.util.Scanner;

/**
* Tener un generador de RFC.
* @author Emmanuel Cruz H.
* @version 1.0 Noviembre 2020.
* @since Laboratorio ICC 2021-1.
*/
public class GeneradorRFC{
	
	/**
	* Genera un RFC.
	* @param nombre el nombre de la persona.
	* @param apellidoPaterno el primer apellido de la persona.
	* @param apellidoMaterno el segundo apellido de la persona.
	* @param anio el anio de nacimiento de la persona.
	* @parma mes el mes de nacimiento de la persona.
	* @param dia el dia de nacimiento de la persona.
	* @return el RFC generador.
	*/
	public static String generaRFC(String nombre, String apellidoPaterno,
		String apellidoMaterno, int anio, int mes, int dia){

		String elem1 = ""+apellidoPaterno.charAt(0);
		String elem2 = ""+encuentraVocal(apellidoPaterno);
		String elem3 = ""+apellidoMaterno.charAt(0);
		String elem4 = ""+nombre.charAt(0);
		String elem5 = (""+anio).substring(2);
		String elem6 = (mes<10) ? ("0"+mes) : (""+mes);
		String elem7 = (dia<10) ? ("0"+dia) : (""+dia);

		return (elem1 + elem2 + elem3 + elem4 + elem5 + elem6 + elem7).toUpperCase();
	}

	/**
	* Regresa la primera vocal de una palabra.
	* @param palabra la cadena donde buscar la primera vocal.
	* @return regresa la primera vocal encontrada.
	*/
	private static char encuentraVocal(String palabra){
		palabra = palabra.toUpperCase();

		for(int i = 0; i<palabra.length(); i++){
			char actual = palabra.charAt(i);
			if(actual == 'A' || actual == 'E' || actual == 'I' ||
				actual == 'O' || actual == 'U'){
				return actual;
			}
		}
		return '0';
	}

	public static void main(String[] args) {
		String red = "\033[31m"; 
		String green = "\033[32m"; 
		String yellow = "\033[33m"; 
		String blue = "\033[34m"; 
		String cyan = "\033[36m"; 
		String white = "\u001B[0m";
		Scanner sc = new Scanner(System.in);

		System.out.print(green+"Ingresa tu apellido paterno: ");
		String paterno = sc.nextLine();

		System.out.print(yellow+"Ingresa tu apellido materno: ");
		String materno = sc.nextLine();

		System.out.print(blue+"Ingresa tu primer nombre: ");
		String nombre = sc.nextLine();

		System.out.print(cyan+"Ingresa tu anio de nacimiento: ");
		int anio = sc.nextInt();

		if(anio>2001 || anio<1990){
			System.out.println(red+"Año es invalido :(");
			return;
		}

		System.out.print(green+"Ingresa tu mes de nacimiento: ");
		int mes = sc.nextInt();

		if(mes>12 || mes<1){
			System.out.println(red+"Mes es invalido :(");
			return;
		}

		System.out.print(blue+"Ingresa tu dia de nacimiento: ");
		int dia = sc.nextInt();

		if(dia>31 || dia<1){
			System.out.println(red+"Día es invalido :(");
			return;
		}

		System.out.println(cyan+"Tu RFC es: "
			+generaRFC(nombre, paterno, materno, anio, mes, dia));
	}
}