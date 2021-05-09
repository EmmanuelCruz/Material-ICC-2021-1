/**
* Clase que represente una mascota.
* @author Emmanuel Cruz Hernández.
* @version 1.0 Octubre 2020.
* @since Laboratorio de ICC 2021-1.
*/
public class Mascota{
	
	/** Nombre de la Mascota. */
	public String nombre;

	/** Años de la mascota. */
	public int edad;

	/** Duenio de la mascota. */
	public String duenio;

	/** Verificador para saber si tiene plumas. */
	public boolean tienePlumas;

	/** Nacionalidad. */
	public static String nacionalidad;

	// METODO CONSTRUCTOR

	/**
	* Crea una nueva mascota.
	* @param nombre el nombre de la mascota.
	* @param edad la edad de la mascota.
	* @param duenio el duenio de la mascota.
	* @param plumas el verificador para saber si la mascota
	* tiene plumas.
	*/
	public Mascota(String nombre, int edad, String duenio, boolean plumas, String nacionalidad){
		this.nombre = nombre;
		this.edad = edad;
		this.duenio = duenio;
		tienePlumas = plumas;
		this.nacionalidad =nacionalidad;
	}

	/**
	* Crea una nueva mascota.
	* @param nombre de la mascota.
	* @param plumas el identificador para saber si la mascota
	* tiene plumas.
	*/
	public Mascota(String nombre, boolean plumas){
		this.nombre = nombre;
		this.tienePlumas = plumas;
		this.edad = 0;
		this.duenio = "Desconocido";
	}

	/**
	* Crea una nueva mascota.
	*/
	public Mascota(){
		this.nombre = "Sin nombre";
	}

	// MÉTODOS DE ACCESO

	/**
	* Regresa el nombre de una mascota.
	* @return el nombre de la mascota.
	*/
	public String getNombre(){
		return nombre;
	}

	/**
	* Regresa el nombre del duenio.
	* @return el nombre del duenio.
	*/
	public String getDuenio(){
		return this.duenio;
	}

	// MÉTODOS MUTANTES

	/**
	* Modifca el nombre de la mascota.
	* @param nombre el nuevo nombre de la mascota.
	*/
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	/**
	* Modifica el nombre del duenio.
	* @param nuevoDuenio el nuevo duenio de la mascota.
	*/
	public void setDuenio(String nuevoDuenio){
		duenio = nuevoDuenio;
	}

	// MÉTODOS DE IMPLEMENTACIÓN

	/**
	* Permite correr a una mascota.
	*/
	public void corre(){
		System.out.println("Yuju!! Estoy corriendo!!");
	}

	/**
	* Permite hablar a la mascota.
	* @param sonido el sonido que hace la mascota al hablar.
	*/
	public static void habla(String sonido){
		System.out.println(sonido+" "+sonido+" "+sonido);
	}

	/**
	* Agrega edad.
	* @return la edad de la mascota más un año.
	*/
	public int sumaAnio(){
		return edad + 1;
	}

	@Override
	public String toString(){
		return "Nombre: "+nombre+"\nDueño: "+duenio;
	}

	@Override
	public boolean equals(Object o){
		Mascota aux = (Mascota) o;
		return getNombre().equals(aux.getNombre()) && edad == aux.edad;
	}

	public static void main(String[] args) {
		Mascota m1 = new Mascota("Princesa", 1, "Emmanuel", false, "Mexicano");
		Mascota m2 = new Mascota("Princesa", 8, "Zuriel", false, "EU");

		System.out.println(m1.equals(m2));

		m1.sumaAnio();
		
		Mascota m3 = new Mascota("Scooby", false);

		m1.nacionalidad = "Japones";

		m1.setNombre("Gatuno");

		//m3.habla("Wao");

		//System.out.println(m1.getNombre());
		System.out.println(m2);

	}


}