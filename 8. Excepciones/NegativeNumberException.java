/**
* Excepcion para entradas negativas.
* @author Emmanuel Cruz Hernández.
* @version 1.0 Enero 2021.
* @since Laboratorio ICC 2021-1.
*/
public class NegativeNumberException extends Exception{

	/**
	* Crea una nueva NegativeNumerException.
	* @param message el mensaje.
	*/
	public NegativeNumberException(String message){
		super(message);
	}

	/**
	* Crea una nueva NegativeNumberException.
	*/
	public NegativeNumberException(){
		super("No se puede evaluar con negativos");
	}
}