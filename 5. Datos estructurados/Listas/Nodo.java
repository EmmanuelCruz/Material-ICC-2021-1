/**
* Nodo de una lista.
* @author Emmanuel Cruz H.
* @version 1.0 2020.
* @since Laboratorio ICC 2021-1.
*/
public class Nodo{
	
	/** Elemento a almacenar en el nodo. */
	private Object elemento;

	/** Nodo siguiente. */
	private Nodo siguiente;

	/**
	* Crea un nuevo nodo.
	* @param elemento el elemento a almacenar en el nodo.
	*/
	public Nodo(Object elemento){
		this.elemento = elemento;
	}

	/**
	* Accede al valor almacenado en un nodo.
	* @return el valr almacenado.
	*/
	public Object getElemento(){
		return elemento;
	}

	/**
	* Accede al nodo siguiente de un nodo.
	* @return el nodo siguente.
	*/
	public Nodo getSiguiente(){
		return siguiente;
	}

	/**
	* Modifica el valor del nodo siguiente.
	* @param nuevoSiguiente el nodo nuevo a asignar al siguiente.
	*/
	public void setSiguiente(Nodo nuevoSiguiente){
		siguiente = nuevoSiguiente;
	}

	/**
	* Modifica el valor del elemento almacenado.
	* @param nuevo el nuevo elemento a almacenar en el nodo.
	*/
	public void setElemento(Object nuevo){
		elemento = nuevo;
	}
}