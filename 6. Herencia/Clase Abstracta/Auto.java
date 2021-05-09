/**
* Define las operaciones de un auto.
* @author Emmanuel Cruz Hernández.
* @version 1.0 Enero 2021.
* @since Laboratorio de icc 2021-1.
*/
public abstract class Auto{
	
	/** Color. */
	public String color;

	/** Tuneado. */
	public boolean tunedo;

	/** Marca. */
	public String marca;

	/** Kilometraje. */
	public int kilometraje;

	/** Velocidad maxima. */
	public int velocidadMaxima;

	/**
	* Crear un nuevo auto.
	* @param color el color del coche.
	* @param marca la marca del auto.
	* @param maxima la velocidad maxima del auto.
	*/
	public Auto(String color, String marca, int maxima){
		this.color = color;
		this.marca = marca;
		velocidadMaxima = maxima;
	}

	/**
	* Avanzar el coche.
	* @param distancia la cantidad de kilometros a avanzar.
	*/
	public void avanza(int distancia){
		kilometraje += distancia;
	}

	/**
	* Tunea el auto.
	*/
	public void tunea(){
		System.out.println(daTipo() + " ha sido tunedo");
		tunedo = true;
	}

	/**
	* Destunea el auto.
	*/
	public void destunea(){
		tunedo = false;
	}

	/**
	* Regresa el tipo de coche.
	* @return el tipo de coche.
	*/
	public abstract String daTipo();

	/**
	* Regresa el tipo del motor.
	* @return el tipo de motor del auto.
	*/
	public abstract String daMotor();

	public static void main(String[] args) {
		Auto ad = new AutoDeportivo("Rojo", "Honda", 320, false);

		Auto ac = new AutoClasico("Blanco", "Mercedes", 180, 1960);

		ad.tunea();

		ac.tunea();

		/*System.out.println(ad.daTipo());

		System.out.println(ad.daMotor());

		System.out.println(ac.daTipo());

		System.out.println(ac.daMotor());*/


	}

}