/**
* Ejemplifica las formas de terminar con un controlador de flujo.
* @author Emmanuel Cruz H.
* @version 1.0 2020.
*/
public class Controlador{
	
	/**
	* Ejemplo de romper un controlador con return.
	*/
	public static void ejemploReturn(){
		for(int i = 0; i<15; i++){
			System.out.println("Comienzo de iteración: "+i);
			if(i == 5){
				System.out.println("Caso continue");
				continue;
			}
			System.out.println("Final de iteración: "+i);
		}

		System.out.println("Más código");

	}

	public static void main(String[] args) {
		ejemploReturn();
	}
}