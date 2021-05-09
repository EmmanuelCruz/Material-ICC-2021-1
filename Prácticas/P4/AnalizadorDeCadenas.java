/**
 * Interfaz que define los metodos de
 * un analizador de cadenas.
 * @author Emmanuel Cruz Hernandez.
 * @version 2.0 Noviembre 2020. (Antigua versión: 1.0 Marzo de 2020).
 */
public interface AnalizadorDeCadenas{

    /**
    * Cuenta la cantidad de veces que aparece un caracter en una cadena.
    * @param cadena la cadena donde buscar las apariciones del caracter.
    * @param c el caracter a contabilizar apariciones.
    * @return la cantidad de veces que aparece el caracter c en la cadena.
    */
    public int cuentaCaracter(String cadena, char c);

    /**
    * Permite saber si dos cadenas son lexicográficamente iguales.
    * @param cadena1 la primer cadena a comparar.
    * @param cadena2 la segunda cadena a comparar.
    * @return true si las cadenas son lexicográficamente iguales. false en otro caso.
    */
    public boolean sonIguales(String cadena1, String cadena2);

    /**
    * Da la subcadena de una cadena.
    * @param cadena la cadena de la cual obtener subcadena.
    * @param inicio la posición de inicio de la subcadena.
    * @param fin la última posición de la subcadena.
    * @return la subcadena de inicio a fin. O "Índice inválido" en caso 
    * de pasar índices fuera de rango.
    */
    public String daSubcadena(String cadena, int inicio, int fin);

}