package pk15;

public class ExtendsExampleMain {

	public static void main(String[] args) {

		// String
		ExtendsExample v1 = new ExtendsExample();

		// Integer
		ExtendsExample v2 = new ExtendsExample();		
		// ���ޱ�
		v1.setValue("dd");
		v2.setValue(4);
		// ��ڽ�
		String v3=(String)v1.getValue();
		int v4 = (int) v2.getValue();

		System.out.println(v3);
		System.out.println(v4+10);
		
	}

}
