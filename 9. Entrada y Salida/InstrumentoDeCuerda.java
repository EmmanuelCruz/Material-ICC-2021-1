/**
* Representación de un instrumento de cuerda.
* @author Emmanuel Cruz Hernández.
* @version 1.0 Enero 2021-1.
* @since Laboratorio de ICC 2021-1.
*/
public class InstrumentoDeCuerda{
	
	/** Nombre del instrumento. */
	public String nombre;

	/** Cantidad de cuerdas. */
	public int cuerdas;

	/** Nombre del duenio. */
	public String duenio;

	/**
	* Crea un nuevo instrumento de cuerda.
	* @param nombre el nombre del instrumento.
	* @param cuerdas la cantidad de cuerdas.
	* @param duenio el nombre del duenio.
	*/
	public InstrumentoDeCuerda(String nombre, int cuerdas, String duenio){
		this.nombre = nombre;
		this.cuerdas = cuerdas;
		this.duenio = duenio;
	}

	public String daRepresentacion(){
		return nombre+","+cuerdas+","+duenio;
	}

	@Override
	public String toString(){
		return "Nombre: "+nombre+"\nNo. Cuerdas: "+cuerdas+"\nDuenio: "+duenio;
	}
}