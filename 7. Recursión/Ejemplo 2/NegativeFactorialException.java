/**
* Excepcion para entradas negativas en factorial.
* @author Emmanuel Cruz Hernández.
* @version 1.0 Enero 2021.
* @since Laboratorio ICC 2021-1.
*/
public class NegativeFactorialException extends Exception{

	/**
	* Crea una nueva NegativeFactorialException.
	* @param message el mensaje.
	*/
	public NegativeFactorialException(String message){
		super(message);
	}

	/**
	* Crea una nueva NegativeFactorialException.
	*/
	public NegativeFactorialException(){
		super("No se puede calcular factorial de un numero negativo");
	}
}