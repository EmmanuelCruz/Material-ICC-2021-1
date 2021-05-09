import java.util.Random;

/**
* Representación de un Perro.
* @author Emmanuel Cruz H.
* @version 1.0 Diciembre 2020.
* @since Laboratorio ICC 2021-1.
*/
public class Perro extends Mascota{

	/** Sonido. */
	public String sonido;

	/** Color. */
	public String color;

	/** Tamanio del perro. */
	public double tamanio = 0.5;

	/**
	* Crea un nuevo Perro.
	* @param sonido el sonido del perro.
	* @param color el color del perro.
	* @param nombre el nombre de la mascota.
	* @param edad la edad de la mascota.
	* @param duenio el duenio de la mascota.
	* @param plumas el verificador para saber si la mascota
	* tiene plumas.
	*/
	public Perro(String sonido, String color, String nombre, 
		int edad, String duenio, boolean plumas, String nacionalidad){

		super(nombre, edad, duenio, plumas, nacionalidad);
		this.sonido = sonido;
		this.color = color;
	}

	/**
	* Crea un nuevo Perro.
	*/
	public Perro(){

	}

	/**
	* Puede atrapar la pelota.
	* @return true si atrapa la pelota, false en otro caso.
	*/
	public boolean atrapaPelota(){
		Random rn = new Random();
		boolean resultado = rn.nextBoolean();
		return resultado;
	}

	/**
	* Persigue su cola.
	*/
	public void persigueCola(){
		System.out.println("Estoy persiguiendo mi cola!");
	}

	@Override
	public String daEspecie(){
		return "Soy un Perro";
	}

	public static void main(String[] args) {
		Perro doggy = new Perro("Wou Wou", "Cafe", "Doggy", 1, "Carl", false, "Mexicano");

		System.out.println(doggy.atrapaPelota());

		doggy.corre();

		System.out.println(doggy.daEspecie());
	}
}