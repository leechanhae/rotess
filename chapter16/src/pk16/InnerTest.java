package pk16;

import pk16.OutClass.InStaticClass;

class OutClass {

	// �ܺ� Ŭ���� �������
	private int num = 0;
	private static int sNum = 20;
	private InClass inClass; // ����

	// �����ڸ� ���ؼ� ���� Ŭ������ ��ü�� �����Ѵ�
	public OutClass() {
		inClass = new InClass(); // ���� Ŭ������ ��ü ����
	}

	class InClass {
		int inNum = 100;

		void inTest() {
			System.out.println("OutClass num : " + num + "�ܺ�Ŭ���� �ν��Ͻ� ����");
			System.out.println("OutClass sNum : " + sNum + "�ܺ�Ŭ���� ���� ����");
			System.out.println("InClass innum : " + inNum + "����Ŭ������ �ν��Ͻ� ����");
		}
	}

	// private ��������� ������
	public void usinClass() {
		inClass.inTest();
	}

	// ���� ����(static)Ŭ����
	static class InStaticClass {
		int inNum = 100;
		static int sinNum = 200;
		//num=500; //��ü�� �־�� ��밡�� 

		void inTest() {
			//num=500;
			inNum = 101;
			sinNum = 201;
			sNum=300;
			System.out.println("InStaticClass inNum : " + inNum + "���� �ν��Ͻ� ����");
			System.out.println("InStaticClass sinNum : " + sinNum + "���� static ����");
			System.out.println("InClass sNum : " + sNum + "�ܺ�Ŭ���� static ����");
		}
		
		static void sTest() {
			sinNum=200; //InstaticClass
			sNum=300; //�ܺ�
			//inNum=100; �����ֱⰡ Ʋ��
			System.out.println("InStaticClass sinNum : " + sinNum + "���� �ν��Ͻ� ����");
			System.out.println("OutClass sNum : " + sNum + "���� static ����");
			
		}
	}

}

public class InnerTest {

	public static void main(String[] args) {

		System.out.println("private ���� ���� ���ٽ� ȣ��");
		OutClass outclass1 = new OutClass();
		outclass1.usinClass();
		System.out.println();

		System.out.println("�ܺ�Ŭ���� ���� ������ ����Ŭ���� ȣ��");
		OutClass out = new OutClass();
		OutClass.InClass in = out.new InClass();
		in.inTest();
		System.out.println();
		
		//�ܺ�Ŭ������ �������� �ʰ� �ٷ� ���� ���� Ŭ���� ����
		OutClass.InStaticClass ic=new OutClass.InStaticClass();
		System.out.println("���� ����Ŭ������ �Ϲ� �޼ҵ�");
		ic.inTest();
		System.out.println("���� ����Ŭ������ static �޼ҵ�");
		InStaticClass.sTest();
	}

}
