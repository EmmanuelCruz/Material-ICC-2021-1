import java.util.Random;

/**
* Representacion de un Pokemon.
* @author Emmanuel Cruz Hernández.
* @version 1.0 Enero 2021.
* @since Practica de Herencia del curso de ICC 2021-1.
*/
public abstract class Pokemon{
	
	/** Nombre del Pokemon. */
	protected String nombre;

	/** Salud del Pokemon. */
	protected int salud;

	/** Intensidad de ataque. */
	protected int intensidadAtaque;

	/** Entrenador del pokemon. */
	protected Entrenador entrenador;

	/**
	* Crea un nuevo Pokemon.
	* @param nombre el nombre del pokemon.
	* @param intensidad la intensidad de ataque.
	* @param entrenador el entrenador del pokemon.
	*/
	public Pokemon(String nombre, int intensidad, Entrenador entrenador){
		this.nombre = nombre;
		intensidadAtaque = intensidad;
		this.entrenador = entrenador;
		this.salud = 100;
	}

	/**
	* Ataca a un pokemon, restando a la salud la intensidad 
	* del ataque. Cada pokemon ataca dependiendo de su tipo.
	* @param atacado el pokemon a atacar.
	* @return true si el pokemon pudo ser atacado, false en otro caso.
	* Un pokemon no puede ser atacado cuando su salud es negativa o es 0.
	*/
	public abstract boolean ataca(Pokemon atacado);

	/**
	* Permite al pokemon defenderse.
	* @return true si el pokemon se defiende con exito, false en otro caso.
	*/
	public abstract boolean defiende();

	/**
	* Permite descansar un pokemon. Esto es recuperar salud.
	* NOTA: La recuperación depende del tipo de pokemon.
	* @return true si el pokemon puede descansar, false en otro caso.
	* Un pokemon no puede aumentar salud si la salud sobrepasa de 100.
	*/
	public abstract boolean descansa();

	/**
	* Permite evolucionar un pokemon.
	* Un pokemon evoluciona dependiendo de su tipo. Cuando un pokemon
	* evoluciona aumenta la intensidad de su ataque.
	*/
	public abstract void evoluciona();

	/**
	* Genera un valor booleano aleatorio.
	* @return true si el generador aleatorio genera un valor true, false en otro caso.
	*/
	protected boolean generaAleatorio(){
		Random rn = new Random();
		return rn.nextBoolean();
	}

	/**
	* Muestra todas las caracteristicas de un pokemon.
	* Ademas de los atributos definidos en esta clase, cada tipo de pokemon
	* cuenta con diferentes atributos extra.
	* @return la representación de un pokemon.
	*/
	public abstract String toString();

}