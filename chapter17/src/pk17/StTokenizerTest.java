package pk17;

import java.util.StringTokenizer;

public class StTokenizerTest {

	public static void main(String[] args) {

		String str="Have a Nice Day";
		
		//StringTokenizer(�ڸ��� ���� String, �ڸ��� ���� ���ڿ�, �ڸ��� ���� ǥ�� ����)
		StringTokenizer obj=new StringTokenizer(str," ",false);
		
		//StringTokenizer.hasMoreTokens() : ���� Token ���� Ȯ��
		while(obj.hasMoreTokens()) {
			String t=obj.nextToken();
			System.out.println(t);
		}
	}

}
