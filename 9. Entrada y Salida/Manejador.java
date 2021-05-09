import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
* Manejador que permite la lectura de archivos.
* @author Emmanuel Cruz Hernández.
* @version 1.0 Enero 2021.
* @since Laboratorio de ICC 2021-1.
*/
public class Manejador{

	/**
	* Permite la lectura de un archivo.
	* @param nombre el nombre del archivo a leer.
	*/
	public void lee(String nombre){
		try{
			Reader reader = new FileReader(nombre);
			BufferedReader lector = new BufferedReader(reader);
			String linea = null;
			while((linea = lector.readLine()) != null){

				String[] objeto = linea.split(",");
				int cantidad = Integer.valueOf(objeto[1]);

				InstrumentoDeCuerda nuevo = 
				new InstrumentoDeCuerda(objeto[0], cantidad, objeto[2]);

				System.out.println(nuevo);
			}
			
		} catch(FileNotFoundException fnfe){
			System.out.println("No se encontró el archivo");
		} catch(Exception e){
			System.out.println("Ocurrió un error en la lectura");
		}	
	}

	/**
	* Permite escribir un archivo de texto.
	* @param nombre el nombre con el cual guardar el archivo.
	*/
	public void escribe(String nombre){

		InstrumentoDeCuerda i1 = new InstrumentoDeCuerda("Guitarra", 6, "Emmanuel");
		InstrumentoDeCuerda i2 = new InstrumentoDeCuerda("Ukelele", 4, "Israel");
		InstrumentoDeCuerda i3 = new InstrumentoDeCuerda("Violin", 4, "Zuri");
		
		try{
			Writer writer = new FileWriter(nombre);
			BufferedWriter buffer = new BufferedWriter(writer);

			writer.write(i1.daRepresentacion()+"\n");
			writer.write(i2.daRepresentacion()+"\n");
			writer.write(i3.daRepresentacion());

			writer.close();

		} catch(Exception e){
			System.out.println("Ocurrió un error en la escritura.");
		}
	}

	public static void main(String[] args) {
		Manejador m = new Manejador();

		

		m.escribe("ArchivoNuevo.txt");

		m.lee("ArchivoNuevo.txt");
	}
}