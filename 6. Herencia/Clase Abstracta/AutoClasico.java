/**
* Representacion de un auto clasico.
* @author Emmanuel Cruz Hernández.
* @version 1.0  Enero 2021.
* @since Laboratorio ICC 2021-1.
*/
public class AutoClasico extends Auto{

	/** Anio de creacion. */
	public int anio;

	/**
	* Crea un nuevo auto deportivo.
	* @param color el color del auto.
	* @param marca la marca del auto deportivo.
	* @param maxima la velocidad maxima.
	*/
	public AutoClasico(String color, String marca, int maxima, int anio){
		super(color, marca, maxima);

		this.anio = anio;
	}

	@Override
	public void avanza(int distancia){
		kilometraje += distancia*2;
	}

	@Override
	public String daTipo(){
		return "Auto clasico";
	}

	@Override
	public String daMotor(){
		return "Motor de auto clasico XD XD";
	}
}