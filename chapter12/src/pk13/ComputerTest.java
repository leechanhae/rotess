package pk13;

public class ComputerTest {
	public static void main(String[] args) {

		// Computer pc1 = new Computer(); //error �߻�Ŭ������ �ν��Ͻ�(heap,��ü,object) �� �� ����.
		Computer pc2 = new Desktop();
		// Computer pc3 = new Notebook();�߻�Ŭ������ �ν��Ͻ�(heap,��ü,object) �� �� ����.
		Computer pc4 = new Mynotebook();

		pc2.typing();
		pc4.typing();
	}

}
