/**
* Representacion de un coche.
*/
public class Coche implements Runnable{

	public int meta;

	public String nombre;

	public Coche(String nombre){
		meta = 0;
		this.nombre = nombre;
	}
	
	@Override
	public void run(){
		Thread t = new Thread();
		while(meta < 300){
			System.out.println(nombre+" "+meta);

			seccionCritica();

			meta+=5;
		}

		System.out.println(nombre+" llegó a la meta");
	}

	public synchronized void seccionCritica(){
		while(meta >= 100 && meta<=200){
			System.out.println(nombre+" "+meta);
			meta+=5;
		}
	}

	public static void main(String[] args) {
		Coche c1 = new Coche("McQueen");
		Coche c2 = new Coche("Chick");
		Coche c3 = new Coche("The King");

		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);

		t1.start();
		t2.start();
		t3.start();

	}
}