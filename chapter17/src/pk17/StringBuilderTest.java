package pk17;

public class StringBuilderTest {

	public static void main(String[] args) {

		String javastr=new String("Java");
		//ó�� ������ �޸��� �ּ�
		System.out.println("javastr�� ó�� ������ �޸��� �ּ� : "+System.identityHashCode(javastr));
		
		StringBuilder buffer=new StringBuilder(javastr); //StringBuilder ����
		
		//buffer�޸� �ּ�
		System.out.println("���� �� buffer �޸� �ּ� : "+System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append("android ");
		buffer.append("programming is fun!!");
		//buffer �޸� �ּ�
		System.out.println("���� �� buffer �޸� �ּ� : "+System.identityHashCode(buffer));
		
		javastr=buffer.toString();
		System.out.println("���� ������� javastr �޸� �ּ� : "+System.identityHashCode(javastr));
		
	}

}
