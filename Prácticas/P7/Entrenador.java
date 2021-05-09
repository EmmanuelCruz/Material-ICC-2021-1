/**
* Representación de un entrenador pokemon.
* @author Emmanuel Cruz Hernández.
* @version 1.0 Enero 2021.
* @since Practica de Herencia del curso de ICC 2021-1.
*/
public abstract class Entrenador{
	
	/** Nombre del entrenador. */
	public String nombre;

	/** Pokemones del entrenador. */
	protected Pokemon[] pokemones;

	/** Cantidad de pokemones actuales. */
	private int actual;

	/**
	* Crea un nuevo entrenador.
	* @param nombre el nombre del entrenador.
	* @param cantidad la cantidad de pokemones que tendrá
	* un entrenador.
	*/
	public Entrenador(String nombre, int cantidad){
		this.nombre = nombre;
		pokemones = new Pokemon[cantidad];
		actual = 0;
	}

	/**
	* Agrega un nuevo pokemon al entrenador.
	* @param capturado el pokemon capturado por el entrenador.
	*/
	public void capturaPokemon(Pokemon capturado){
		if(actual == pokemones.length){
			System.out.println("El entrenador "+nombre+" no puede tener más pokemones");
			return;
		}

		pokemones[actual++] = capturado;
	}

	/**
	* Muestra todos los pokemones del entrenador.
	*/
	public void muestraPokemones(){
		for(int i = 0; i < actual ; i++)
			System.out.println(pokemones[i] + "\n");
	}

	/**
	* Ayuda al ataque de un pokemon dependiendo de la experiencia
	* del entrenador.
	* @return un entero dependiendo del tipo de entrenador:
	* 1 si el entrenador es novato.
	* 2 si el entrenador es intermedio.
	* 3 si el entrenador es experto.
	*/
	public abstract int ayudaAPokemon();
}