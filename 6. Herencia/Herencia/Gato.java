 import java.util.Random;

 /**
 * Representacion de un michi.
 * @author Codenow
 * @version 1.0, 2020
 * @since Java
 */
public class Gato extends Mascota{

    /** Nivel de Ego. */
    public int ego;
	
    /**
    * Crea un nuevo Gato.
    * @param ego el nivel de ego del gato.
    * @param nombre el nombre de la mascota.
    * @param edad la edad de la mascota.
    * @param duenio el duenio de la mascota.
    * @param plumas el verificador para saber si la mascota
    * tiene plumas.
    */
    public Gato(int ego, String nombre, int edad, String duenio, 
        boolean plumas, String nacionalidad){

        super(nombre, edad, duenio, plumas, nacionalidad);
        this.ego = ego;
    }

    /**
    * Permite ronrronear a un gato.
    * @return true si esta ronrroneando, false en otro caso.
    */
    public boolean estaRonrroneando(){
        Random rn = new Random();
        boolean resultado = rn.nextBoolean();
        return resultado;
    }

    public static void main(String[] args) {
        Gato michi = new Gato(10, "Michi", 3, "Zuriel", false, "Frances");

        /*System.out.println(michi.estaRonrroneando());

        michi.corre();*/

        Mascota m1 = new Mascota("Princesa", 1, "Emmanuel", false, "Mexicano");

        System.out.println(m1 instanceof Gato);

    }
}