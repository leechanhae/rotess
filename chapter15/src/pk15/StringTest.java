package pk15;

public class StringTest {

	public static void main(String[] args) {

		String str="";
		String str1="Hi everyone!";
		String str2=" Have a nice day!";
		
		System.out.println(System.identityHashCode(str1));
		//str=str1+str2;
		str1=str1.concat(str2);
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		
		System.out.println("str1 ���ڼ� : "+str1.length());
		System.out.println("str2 ���ڼ� : "+str2.length());
		
		System.out.println("str1 d������ġ : "+str1.indexOf('d'));
		System.out.println("str2 d������ġ : "+str2.indexOf('d'));
		
		System.out.println("str1 �ҹ��� : "+str1.toLowerCase());
		System.out.println("str2 �ҹ��� : "+str2.toLowerCase());
		
		System.out.println("str1 �빮�� : "+str1.toUpperCase());
		System.out.println("str2 �빮�� : "+str2.toUpperCase());
		
	}

}
