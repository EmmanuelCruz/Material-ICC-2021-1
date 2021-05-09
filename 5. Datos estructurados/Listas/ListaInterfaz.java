/**
* Interfaz que define las operaciones
* de una lista de ejemplo.
* @author Emmanuel Cruz Hernández.
* @version 1.0 Noviembre 2020.
* @since Laboratorio ICC 2021-1.
*/
public interface ListaInterfaz{

	public static int ejemplo = 5;

	/**
	* Agrega en la primera posición de una lista.
	* @param elementoNuevo el nuevo elemento a agregar en la lista.
	*/
	public void agregaPrimero(Object elementoNuevo);

	/**
	* Elimina en la primera posición.
	*/
	public void eliminaPrimero();

	/**
	* Obtiene la longitud de una lista.
	* @return la cantidad de elementos en la lista.
	*/
	public int longitud();

	/**
	* Muestra los elementos de una lista. 
	*/
	public void muestra();
	
	/**
	* Regresa la reversa de una lista.
	* @return una lista con los elementos en reversa.
	*/
	public ListaInterfaz reversa();

	/**
	* Corta la lista desde el elmento en la posición 
	* 0 hasta un índice n.
	* @param n el indice de corte.
	* @return una sublista de la lista de 0 a n.
	*/
	public ListaInterfaz recorta(int n);

	/**
	* Regresa la mitad de los elementos de una lista.
	* @return la lista a la mitad.
	*/
	public ListaInterfaz mitad();

	/**
	* Regresa el elemento que se encuentra a la mitad de la lista.
	* @return el elemento a la mitad de la lista.
	*/
	public Object elementoMitad();

	/**
	* Intercambia la posición de dos elementos de la lista.
	* @param i el indice del primer elemento a intercambiar.
	* @param j el indice del segundo elemento a intercambiar.
	* @return true en caso de realizar la operación con éxito.
	* false en otro caso.
	*/
	public boolean intercambia(int i, int j);

}