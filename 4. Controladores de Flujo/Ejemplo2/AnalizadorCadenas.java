import java.util.Scanner;

/**
 * Analizador de cadenas.
 * @author Emmanuel Cruz Hernández.
 * @version 1.0 Octubre 2020.
 * @since Laboratorio de ICC-2021.
 */
public class AnalizadorCadenas implements Analizador{

    @Override
    public void muestraCaracteres(String cadena){
	for(int i = 0; i<cadena.length(); i++){
	    System.out.println(cadena.charAt(i));
	}
    }

    @Override
    public String convierteMayusculas(String cadena){
	String resultado = "";
	for(int i = 0; i<cadena.length(); i++){
	    resultado += (""+cadena.charAt(i)).toUpperCase();
	}
	return resultado;
    }

    @Override
    public String concatena(String cadena1, String cadena2){
	String resultado = "";
	for(int i = 0; i<cadena1.length(); i++){
	    resultado += cadena1.charAt(i);
	}
	resultado += " ";
	for(int i = 0; i<cadena2.length(); i++){
	    resultado += cadena2.charAt(i);
	}
	return resultado;
    }

    @Override
    public String intercala(String cadena1, String cadena2){
	int menor = 0;
	String cadenaMayor = "";
	if(cadena1.length()>cadena2.length()){
	    menor = cadena2.length();
	    cadenaMayor = cadena1;
	} else{
	    menor = cadena1.length();
	    cadenaMayor = cadena2;
	}

	String resultado = "";
	for (int i = 0; i<menor ; i++) {
	    resultado += ""+cadena1.charAt(i)+cadena2.charAt(i);
	}

	resultado += cadenaMayor.substring(menor);

	return resultado;
    }

    public boolean contiene(String cadena, String contenida){
    	int rangoValido = cadena.length() - contenida.length();

    	for(int i = 0; i<=rangoValido; i++){
    		if(contenida.equals(cadena.substring(i, contenida.length()+i))){
    			return true;
    		}
    	}

    	return false;
    }
	
    public static void main(String[] args) {
	String ejemplo = "Cadena de ejemplo"; // Rango válido [0, longitd-1]

	String red = "\033[31m"; 
	String green = "\033[32m"; 
	String yellow = "\033[33m"; 
	String blue = "\033[34m"; 
	String cyan = "\033[36m"; 
	String white = "\u001B[0m";

	Scanner sc = new Scanner(System.in);

	AnalizadorCadenas analizador = new AnalizadorCadenas();

	int opcion = 0;

	do{
	    System.out.print(blue+"\n[1] Concaten\n"+
			     "[2] Convierte a mayusculas\n"+
			     "[3] Intercala\n"+
			     "[4] Salir del programa\n"+
			     "Elige una opcion: "+white);

	    opcion = sc.nextInt();
	    sc.nextLine();

	    switch(opcion){
	    case 1:
		System.out.print(yellow+"\nIngresa una entrada: ");
		String entrada = sc.nextLine();
		System.out.print("Ingresa otra entrada: ");
		String entrada2 = sc.nextLine();
		System.out.println("La concatenación es: "+
				   analizador.concatena(entrada, entrada2));
		break;
	    case 2:
		System.out.print(cyan+"\nIngresa una entrada: ");
		String entrada3 = sc.nextLine();
		System.out.println("La entrada en mayusculas es: "+
				   analizador.convierteMayusculas(entrada3));
		break;
	    case 3:
		System.out.print(green+"\nIngresa una entrada: ");
		String entrada4 = sc.nextLine();
		System.out.print("Ingresa otra entrada: ");
		String entrada5 = sc.nextLine();
		System.out.println("La cadena intercalada es: "+
				   analizador.intercala(entrada4, entrada5));
		break;
	    case 4:
		System.out.println(red+"Sale! Te me cuidas"+white);
		break;
	    default:
		System.out.println("Lo siento. No tengo esa opcion");
	    }
	}while(opcion!=4);


	//analizador.muestraCaracteres("Hola mundo");

	//System.out.println(analizador.concatena("Hola", "mundo"));

	//System.out.println(analizador.intercala("Hola", "Juan"));

	//System.out.println(ejemplo.charAt(4));

	//System.out.println(ejemplo.contains("den"));

	//System.out.println(ejemplo.equals("CadenA"));

	//System.out.println(ejemplo.indexOf('d'));

	//System.out.println(ejemplo.length());

	//System.out.println(ejemplo.replaceAll("ejemplo", "Laboratorio"));

	//System.out.println(ejemplo.substring(2, 4));

	//System.out.println(ejemplo.toUpperCase());

	//System.out.println(ejemplo.toLowerCase());

	//System.out.println(ejemplo);

	//System.out.println(ejemplo.trim());



    }
}
