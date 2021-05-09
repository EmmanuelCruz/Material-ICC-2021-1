/**
* Representación de un Chihuahua.
* @author Emmanuel Cruz H.
* @vserion 1.0 diciembre 2020.
* @since Laboratorio ICC 2021-1.
*/
public class Chihuahua extends Perro{
	
	/** Tamanio. */
	public double tamanio = 4.2;

	/**
	* Crea un nuevo Chihuahua.
	* @param tamanio el tamanio del Chihuahua.
	* @param sonido el sonido del perro.
	* @param color el color del perro.
	* @param nombre el nombre de la mascota.
	* @param edad la edad de la mascota.
	* @param duenio el duenio de la mascota.
	* @param plumas el verificador para saber si la mascota
	*/
	public Chihuahua(double tamanio, String sonido, String color, String nombre, 
		int edad, String duenio, boolean plumas, String nacionalidad){

		super(sonido, color, nombre, edad, duenio, plumas, nacionalidad);

	}

	/**
	* Permite saber si esta nervioso.
	* @return true si esta nervios, false en otro caso.
	*/
	public boolean estaNervioso(){
		return true;
	}

	@Override
	public String daEspecie(){
		return "Soy un Perro Chihuahua";
	}

	public void muestraTam(){
		System.out.println(tamanio);
		System.out.println(super.tamanio);
	}

	public static void main(String[] args) {
		Chihuahua doggy = new Chihuahua(0.50, "Wou Wou", "Cafe", 
			"Doggy", 1, "Carl", false, "Mexicano");

		//doggy.muestraTam();

		Perro dogg = new Perro("Wou Wou", "Cafe", "Doggy", 1, "Carl", false, "Mexicano");
		Mascota m1 = new Mascota("Princesa", 1, "Emmanuel", false, "Mexicano");

		Gato michi = new Gato(10, "Michi", 3, "Zuriel", false, "Frances");

		System.out.println(michi instanceof Mascota);

		/*

		System.out.println(doggy.estaNervioso());

		System.out.println(doggy.atrapaPelota());

		Mascota m = (Mascota) doggy;

		System.out.println(doggy.daEspecie());
		System.out.println(m.daEspecie());

		Gato michi = new Gato(10, "Michi", 3, "Zuriel", false, "Frances");

		System.out.println(michi.daEspecie());*/

	}
}