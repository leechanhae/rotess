package pk17;


public class StringTest1 {

	public static void main(String[] args) {

		//��ü �ν��Ͻ� ������ heap�޸� ����
		String str1=new String("abc");
		String str2=new String("abc");
		
		System.out.println(str1==str2);//������
		System.out.println(str1.equals(str2));//����
		
		//���ڿ��� ��������� ������ ������ ������ �ּ� ���		
		String str3="abc";
		String str4="abc";
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		/*
		 InStack in1=new InStack(20); 
		InStack in2=new InStack(20);
		
		System.out.println(in1.hashCode());
		System.out.println(in2.hashCode());
		System.out.println(str1.hashCode()==str2.hashCode());
		System.out.println(in1==in2);
		*/
	}

}
