/**
* Representacion de un auto deportivo.
* @author Emmanuel Cruz Hernández.
* @version 1.0  Enero 2021.
* @since Laboratorio ICC 2021-1.
*/
public class AutoDeportivo extends Auto{

	/** Convertible. */
	public boolean convertible;

	/** Cantidad de puertas. */
	public final int cantidad = 2;

	/**
	* Crea un nuevo auto deportivo.
	* @param color el color del auto.
	* @param marca la marca del auto deportivo.
	* @param maxima la velocidad maxima.
	*/
	public AutoDeportivo(String color, String marca, int maxima, boolean convertible){
		super(color, marca, maxima);

		this.convertible = convertible;
	}

	@Override
	public String daTipo(){
		return "Auto Deportivo";
	}

	@Override
	public String daMotor(){
		return "Motor de auto deportivo XD";
	}
}