import java.util.Scanner;
import java.util.InputMismatchException;

/**
* Ejemplo de uso de excepciones.
* @author Emmanuel Cruz Hernández.
* @version 1.0 Enero 2021.
* @since Laboratorio ICC 2021-1.
*/
public class Divisor{
	
	/**
	* Permite dividir dos números positivos.
	* @param a el dividendo.
	* @param b el divisor.
	* @return la division de a/b.
	* @throws NegativeNumberException si a o b son negativos.
	*/
	public double dividePositivo(double a, double b) throws NegativeNumberException, Exception{
		if(b == 0)
			throw new Exception("No se puede dividir entre 0");
		if(a < 0)
			throw new NegativeNumberException("a es negativo");
		if(b < 0)
			throw new NegativeNumberException("b es negativo");
		return a/b;
	}

	public static void main(String[] args) {
		String red = "\033[31m"; 
		String green = "\033[32m"; 
		String yellow = "\033[33m"; 
		String blue = "\033[34m"; 
		String cyan = "\033[36m"; 
		String white = "\u001B[0m";

		Scanner sc = new Scanner(System.in);

		// Divisor d = null; // Descomentar para NullPointerException
		Divisor d = new Divisor();

		do{
			System.out.print(blue+"\n[1] Divide positivo"+
				"\n[2] Salir"+
				"Elige una opción: ");

			int num = 0;
			try{
				num = sc.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println(red+"\nNo ingresaste un entero");
			}

			sc.nextLine();

			switch(num){
				case 1:
					try{
						System.out.print(green+"\nIngresa un dividendo: ");
						double dividendo = sc.nextDouble();

						sc.nextLine();
						
						System.out.print(green+"\nIngresa un divisor: ");
						double divisor = sc.nextDouble();

						sc.nextLine();
						
						System.out.println(yellow+"\nEl resultado es: " + 
							d.dividePositivo(dividendo, divisor));
					} catch(InputMismatchException ime){
						System.out.println(red+"\nNo ingresaste un double");
					} catch (NegativeNumberException nne) {
						System.out.println(red+"\n"+nne.getMessage());
					} catch(NullPointerException npe){
						System.out.println(red+"\nNo se creó un objeto");
					} catch(Exception e){
						System.out.println(red+"\n"+e.getMessage());
					}

					break;

				case 2:
					System.out.println(cyan+"\nSALIENDO ...");
					return;
			}
			
		} while(true);

		
	}
}