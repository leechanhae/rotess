package pk18_1;

public class GenMain {

	public static void main(String[] args) {

		Gen gen=new Gen();
		
		Integer[] iArr= {1,2,3,4,5};
		Double[] dArr= {1.1,2.2,3.3,4.4,5.5};
		Character[] cArr= {'a','b','c','d','e'};
		
		//int, double, char �� ���� �⺻�ڷ������ ����� ������ �Ұ����ϴ�.
		//�ݵ�� ���׸� �̿�ô� ��ü�� ó���ؾ� �Ѵ�.
		gen.printArr(iArr);
		gen.printArr(dArr);
		gen.printArr(cArr);
	}

}
