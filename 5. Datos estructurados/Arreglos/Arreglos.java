/**
* Clase que implementa operaciones sobre arreglos.
* @author Emmanuel Cruz H.
* @verison 1.0 Diciembre 2020.
* @since Laboratorio ICC 2021-1.
*/
public class Arreglos{
	
	/**
	* Sumar todos los enteros contenidos en un arreglo.
	* @param contenedor el arreglo de enteros.
	* @return la suma de los elementos del arreglo.
	*/
	public static int sumaNumeros(int[] contenedor){
		int total = 0;
		/*for(int elemento : contenedor){
			total += elemento;
		}*/
		for(int i = 0; i<contenedor.length; i++)
			total += contenedor[i];
		return total;
	}

	/**
	* Verifica si las entradas de un arreglo son 
	* iguales a las entradas de un segundo arreglo.
	* @param arr1 el primero arreglo.
	* @param arr2 el segundo arreglo.
	* @return true en caso de ser iguales, false en otro caso.
	*/
	public static boolean sonIguales(String[] arr1, String[] arr2){
		if(arr1.length != arr2.length)
			return false;

		int i = 0;
		while(i < arr1.length){
			if(!arr1[i].equals(arr2[i]))
				return false;
			i++;
		}

		return true;
	}

	/**
	* Permite crear una frase.
	* @param palabras las palabras de una frase.
	* @return la frase formada por las palabras.
	*/
	public static String creaFrase(String[] palabras){
		String frase = "";
		for(String palabra : palabras)
			frase += palabra+" ";
		return frase;
	}

	/**
	* Verifica si un elemento está en un arreglo.
	* @param contenedor el arreglo que contiene elementos.
	* @param buscado el elemento a buscar apariciones.
	* @return la cantidad de veces que aparece un elemento.
	*/
	public static int cuentaElemento(double[] contenedor, double buscado){
		int cantidad = 0;
		for(int i = 0; i<contenedor.length; i++){
			if(contenedor[i] == buscado)
				cantidad++;
		}
		return cantidad;
	}

	/**
	* Da la suma de todos los elementos contenidos.
	* @param matriz el arreglo bidimensional a sumar elementos.
	* @return la suma de todos los elementos del arreglo.
	*/
	public static int sumaNumeros(int[][] matriz){
		int contador = 0;

		// VERSION 1

		/*for(int i = 0; i<matriz.length; i++){
			for(int j = 0; j<matriz[i].length ; j++){
				contador += matriz[i][j];
			}
		}*/

		// VERSION 2

		/*for(int[] renglon : matriz){
			for(int elemento : renglon)
				contador += elemento;
		}*/

		// VERSION 3

		for(int[] renglon : matriz)
			contador += sumaNumeros(renglon);

		return contador;
	}

	/**
	* Suma entrada a entrada los elmentos de una matriz.
	* @param matriz1 la primera matriz a sumar.
	* @param matriz2 la segunda matriz a sumar.
	* @return una matriz con la suma entrada a entrada de los parámetros.
	*/
	public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2){
		if(matriz1.length != matriz2.length)
			return null;

		int[][] resultado = new int[matriz1.length][];

		for(int i = 0 ; i<matriz1.length ; i++){
			if(matriz1[i].length != matriz2[i].length)
				return null;

			int[] renglonSuma = new int[matriz1[i].length];

			for(int j = 0; j<matriz1[i].length; j++)
				renglonSuma[j] = matriz1[i][j] + matriz2[i][j];

			resultado[i] = renglonSuma;
		}

		return resultado;
	}

	/**
	* Permite mostrar el contenido de un arreglo bidimensional de enteros.
	* @param matriz la matriz a mostrar elementos.
	*/
	public static void muestra(int[][] matriz){
		for(int[] renglon : matriz){
			System.out.print("[");
			for(int elemento : renglon)
				System.out.print(elemento+" ");
			System.out.print("]\n");
		}
	}

	public static void main(String[] args) {
		int[] numeros = {4, 5, 2, 1};

		//System.out.println(sumaNumeros(numeros));

		String[] frase1 = {"Hola", "amigos", "por", "ICC"};
		String[] frase2 = {"Hola", "amigos", "de", "ICC"};

		//System.out.println(sonIguales(frase1, frase2));

		//System.out.println(creaFrase(frase2));

		//double[] contenedor = {1.33, 4.7, 2.9, 3.3, 3.3, 6.4, 6.4, 6.4};

		//System.out.println(cuentaElemento(contenedor, 10.5));

		int[][] arreglo = {{1, 2, 4}, {3, 3, 3}, {1, 2, 1}};
		int[][] arreglo2 = {{1, 2, 4}, {3, 2, 1}, {1, 2, 1}};

		//System.out.println(sumaNumeros(arreglo));

		muestra(sumaMatrices(arreglo,arreglo2));
	}
}