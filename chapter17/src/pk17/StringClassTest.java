package pk17;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		//StringŬ������ ���� ��������
		Class strClass = Class.forName("java.lang.String");
		//StringŬ������ ������ ���
		Constructor[] cons = strClass.getConstructors();
		
		for(Constructor ct:cons) {
			System.out.println(ct);
		}
		System.out.println("-------------------------------------------");
		
		Field[] fields=strClass.getFields();
		for(Field f:fields) {
			System.out.println(f);
		}
		System.out.println("------------------------------------------");
		
		Method[] method=strClass.getMethods();
		for(Method m:method) {
			System.out.println(m);
		}
		System.out.println("-----------------------------------------");
	}

}
