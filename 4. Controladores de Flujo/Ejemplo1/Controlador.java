/**
* Ejemplo de controladores de flujo.
* @author Emmanuel Cruz Hernández.
* @version 1.0 Octubre 2020.
* @since Laboratorio de ICC 2021-1.
*/
public class Controlador{
	
	/**
	* Imprime una secuencia de números.
	* @param n la longitud de la secuencia.
	*/
	public static void ejemploWhile(int n){
		int contador = 0;

		while(contador < n){
			System.out.println(contador);
			contador++;
		}
	}

	/**
	* Imprime una secuencia de números.
	* @param n la longitud de la secuencia.
	*/
	public static void ejemploDoWhile(int n){
		int contador = 0;

		do{
			System.out.println(contador);
			contador++;
		} while(contador < n);
	}

	/**
	* Imprime una secuencia de números.
	* @param n la longitud de la secuencia.
	*/
	public static void ejemploFor(int n){
		for(int contador = 0; contador<n ; contador++){
			System.out.println(contador);
		}
	}

	/**
	* Aumenta n años a una edad.
	* @param n la cantidad de años a aumentar.
	* @param edad la edad inicial.
	* @return edad + n
	*/
	public static int aumentaEdad(int n, int edad){
		for(int i = 0; i<n; i++){
			System.out.println("Tengo "+edad+" años");
			edad++;
		}
		
		return edad;
	}

	/**
	* Ejemplo de if.
	* @param n el valor de la condición.
	*/
	public static void ejemploIf(int n, int m){
		if(n>m){
			System.out.println("Si se cumple");
		} else{
			System.out.println("No se cumple");
		}

	}

	/**
	* Ejemplo de switch
	* @param mes el mes a recibir.
	* @param el nombre del mes correspondiente a la entrada.
	*/
	public static String convierteMes(int mes){
		String resultado = "";
		
		switch(mes){
			case 1:
				resultado="Enero";
				break;
			case 2:
				resultado="Febrero";
				break;
			case 3:
				resultado="Marzo";
				break;
			case 4:
				resultado="Abril";
				break;
			case 5:
				resultado="Mayo";
				break;
			case 6:
				resultado="Junio";
				break;
			case 7:
				resultado="Julio";
				break;
			case 8:
				resultado="Agosto";
				break;
			case 9:
				resultado="Septiembre";
				break;
			case 10:
				resultado="Octubre";
				break;
			case 11:
				resultado="Noviembre";
				break;
			case 12:
				resultado="Diciembre";
				break;
			default:
				resultado="MES INVÁLIDO";
		}

		return resultado;
	}

	/**
	* Ejeplo de operador ternario.
	* @param b el booleano a comparar.
	* @return 1 si b es verdado y 0 si b es falso.
	*/
	public static Mascota ejemploOpTernario(String cadena){

		Mascota m1 = new Mascota("Princesa", 1, "Emmanuel", false, "Mexicano");
		Mascota m2 = new Mascota("Klaus", 1, "Zuriel", false, "EU");

		return (cadena=="Hola") ? m1 : m2;
	}

	public static void main(String[] args) {
		//ejemploWhile(0);

		//ejemploDoWhile(10);

		//ejemploFor(0);

		//System.out.println(aumentaEdad(50, 3));

		//ejemploIf(10, 73);

		//System.out.println(convierteMes(50));

		//System.out.println(ejemploOpTernario("Holaews"));

	}
}