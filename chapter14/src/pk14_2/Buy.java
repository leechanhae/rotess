package pk14_2;

public interface Buy {

	void buy();
	
	default void order() {
		System.out.println("���� �ֹ�");
	}
	
	
}
