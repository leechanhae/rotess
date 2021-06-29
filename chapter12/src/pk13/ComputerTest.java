package pk13;

public class ComputerTest {
	public static void main(String[] args) {

		// Computer pc1 = new Computer(); //error 추상클래스는 인스턴스(heap,객체,object) 할 수 없다.
		Computer pc2 = new Desktop();
		// Computer pc3 = new Notebook();추상클래스는 인스턴스(heap,객체,object) 할 수 없다.
		Computer pc4 = new Mynotebook();

		pc2.typing();
		pc4.typing();
	}

}
