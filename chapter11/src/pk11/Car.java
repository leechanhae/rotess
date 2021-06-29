package pk11;

public class Car {

	public int speed;
	
	public void speedUp() {
		speed+=1;
	}
	
	final void stop() {
		System.out.println("ÀÚµ¿Â÷°¡ ¸ØÃä´Ï´Ù.");
		speed=0;
	}
}
