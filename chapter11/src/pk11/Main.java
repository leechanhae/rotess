package pk11;

public class Main {

	public static void main(String[] args) {

		ChildExam c1=new ChildExam();
		
		System.out.println(c1.getCar());//�ڽ�
		System.out.println(c1.getMoney()+"��");//�θ�
		
		//childexam�� �� parentexam
		//������ ��ü�� �������� Ŭ������ �ν��Ͻ�(�� �� Ŭ������ ���� ��ü)
		if(c1 instanceof ParentExam) {
			System.out.println("c1�� parentexam�� �ڽ� Ŭ���� �Դϴ�.");
		}
		
		System.out.println("1.===================================");
		
		ChildExam ch=new ChildExam();
		ParentExam p1=new ParentExam();
		
		p1=ch; //�ڽ��� �θ𿡰� ���� ���� �ڵ� ����ȯ �������̵� �� ���¿��� �θ�Ŭ������ �ż��带 ���
		ch=(ChildExam)p1; //�ٿ�ĳ������ ����ȯ�� �������
		
		//�ڽ��� �θ��� �޼���� �ڱ� �ڽ��� �޼ҵ带 �� ����� �� �ִ�.
		System.out.println(ch.getMoney());
		System.out.println(ch.getCar());
		System.out.println(ch.getStr());
		System.out.println("2.-----------------------------------");
		
		//�ݸ�
		p1=ch; //�θ� �ڽ��� �����ص�(�ڵ� ����ȯ)
		//�θ�� �θ𲨸� ��밡��
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		System.out.println("3.-----------------------------------");
		//�̷��� ���� ���� ��������
		System.out.println(((ChildExam)p1).getCar());
	}

}
