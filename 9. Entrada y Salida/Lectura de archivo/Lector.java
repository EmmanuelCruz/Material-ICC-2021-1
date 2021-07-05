import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

/**
* Manejador que permite la lectura de archivos.
* @author Emmanuel Cruz Hernández.
* @version 2.0 Julio 2021.
* @since Ejemplo de lectura de archivos ED.
*/
public class Lector{

	/**
	* Permite la lectura de un archivo.
	* @param nombre el nombre del archivo a leer.
	*/
	public void lee(String nombre){
		try{
			Reader reader = new FileReader(nombre);
			BufferedReader lector = new BufferedReader(reader);

			/*
			* Impresión de encabezados.
			* Cada invocación al método readLine, te regresa una línea del archivo o null si
			* no hay líneas por leer.
			*/
			System.out.println(lector.readLine() + " " + lector.readLine() +
				" " + lector.readLine());

			// Impresión del resto de las líneas del archivo.
			String linea = null;
			while((linea = lector.readLine()) != null){

				/*
				* El método split separa en cadenas basadas en el parámetro.
				* En este caso, esta separando en subcadenas cuando se encuentra una coma.
				*/
				String[] objeto = linea.split(",");

				System.out.println(objeto[0] + " " + objeto[1]);
			}
			
		} catch(FileNotFoundException fnfe){
			System.out.println("No se encontró el archivo");
		} catch(Exception e){
			System.out.println("Ocurrió un error en la lectura");
		}	
	}

	public static void main(String[] args) {
		Lector m = new Lector();

		// Invocación al método lector de archivos.
		m.lee("Archivo.txt");
	}
}