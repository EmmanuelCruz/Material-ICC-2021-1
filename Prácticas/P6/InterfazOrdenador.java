/**
 * Interfaz que define los algoritmos de ordenamiento
 * selectionSort e insertionSort.
 * @author Emmanuel Cruz Hernandez.
 * @version 1.0 Abril 2020.
 */
public interface InterfazOrdenador{
	
    /**
     * Permite ordenar un arreglo de enteros
     * con selectionSort.
     * @param numeros el arreglo de números a ordenar.
     */
    public int[] selectionSort(int[] numeros);

    /**
     * Permite ordenar un arreglo de enteros
     * con insertionSort.
     * @param numeros el arreglo de números a ordenar.
     */
    public int[] insertionSort(int[] numeros);
}
