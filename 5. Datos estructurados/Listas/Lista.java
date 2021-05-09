/**
* Implementación de una lista.
* @author Emmanuel Cruz H.
* @version 1.0 2020.
* @version Laboratorio ICC 2021-1.
*/
public class Lista implements ListaInterfaz{
	
	/** Cabeza de la lista. */
	private Nodo cabeza;

	@Override
	public void agregaPrimero(Object elementoNuevo){
		Nodo nuevo = new Nodo(elementoNuevo);

		nuevo.setSiguiente(cabeza);
		cabeza = nuevo;
	}

	@Override
	public void eliminaPrimero(){
		if(cabeza == null){
			System.out.println("La lista es vacía");
			return;
		}

		cabeza = cabeza.getSiguiente();
	}

	@Override
	public int longitud(){
		int cantidad = 0;
		Nodo iterador = cabeza;

		while(iterador != null){
			cantidad++;
			iterador = iterador.getSiguiente();
		}

		return cantidad;
	}

	@Override
	public void muestra(){
		Nodo iterador = cabeza;
		for(int i = 0; i < longitud(); i++){
			System.out.println(iterador.getElemento()+"\n");
			iterador = iterador.getSiguiente();
		}
	}

	@Override
	public ListaInterfaz reversa(){
		Lista reversa = new Lista();
		
		Nodo iterador = cabeza;

		for(int i = 0; i<longitud(); i++){
			reversa.agregaPrimero(iterador.getElemento());
			iterador = iterador.getSiguiente();
		}

		return reversa;
	}

	@Override
	public ListaInterfaz recorta(int n){
		if(n<0 || n>longitud()){
			return new Lista();
		}

		Lista recortada = new Lista();

		Nodo iterador = cabeza;
		int contador = 0;
		while(contador < n){
			contador++;
			recortada.agregaPrimero(iterador.getElemento());
			iterador = iterador.getSiguiente();
		}

		return recortada.reversa();
	}

	@Override
	public ListaInterfaz mitad(ListaInterfaz otra){

		Lista otraAux = (Lista) otra;


		return recorta(longitud()/2);
	}

	@Override
	public Object elementoMitad(){
		Nodo iterador = cabeza;

		for(int i = 0; i<longitud()/2 ; i++){
			iterador = iterador.getSiguiente();
		}

		return iterador.getElemento();
	}

	@Override
	public boolean intercambia(int i, int j){
		if(i<0 || i>longitud() || j<0 || j>longitud())
			return false;

		Nodo iteradorI = cabeza;
		for(int c = 0; c<i; c++){
			iteradorI = iteradorI.getSiguiente();
		}

		Nodo iteradorJ = cabeza;
		int contadorJ = 0;
		while(contadorJ!=j){
			iteradorJ = iteradorJ.getSiguiente();
			contadorJ++;
		}

		Object elementoI = iteradorI.getElemento();
		iteradorI.setElemento(iteradorJ.getElemento());
		iteradorJ.setElemento(elementoI);
		return true;
	}

	public static void main(String[] args) {
		Lista lista = new Lista();

		
		lista.agregaPrimero(1);
		lista.agregaPrimero(3);
		lista.agregaPrimero(6);
		lista.agregaPrimero(12);
		lista.agregaPrimero(56);
		lista.agregaPrimero(34);
		lista.agregaPrimero(0);

		/*
		lista.agregaPrimero("Hola1");
		lista.agregaPrimero("Hola2");
		lista.agregaPrimero("Hola3");
		lista.agregaPrimero("Hola4");
		*/
		/*
		Mascota m1 = new Mascota("Princesa", 1, "Emmanuel", false, "Mexicano");
		Mascota m2 = new Mascota("Klaus", 8, "Zuriel", false, "EU");
		Mascota m3 = new Mascota("Scooby", false);

		lista.agregaPrimero(m1);
		lista.agregaPrimero(m2);
		lista.agregaPrimero(m3);
		*/
		

		//lista.eliminaPrimero();

		//System.out.println(lista.longitud());

		lista.muestra();

		/*
		Lista reversa = lista.reversa();

		System.out.println("La revsersa de la lista es: ");

		reversa.muestra();
		*/
		/*
		System.out.println("La lista recortada es: ");

		lista.recorta(4).muestra();
		*/
		/*
		ListaInterfaz mitad = lista.mitad();

		System.out.println("La lista a la mitad es: ");

		mitad.muestra();
		*/

		//System.out.println("El elemento a la mitad de la lista es: "+lista.elementoMitad());

		lista.intercambia(1, 4);

		System.out.println("**********************");

		lista.muestra();

	}
}