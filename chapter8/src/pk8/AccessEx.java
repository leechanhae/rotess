package pk8;

//���������� �ǽ�
public class AccessEx {

	//�������
	private int aa; //����ȭ(���� Ŭ���������� ��� ����)
	public int bb; //����
	int cc; //��Ű���� ������ ��� ����
	
	//�޼ҵ�
	public void SetA(int a) {
		aa=a; //���� �̸��� �ٸ� ��쿡�� this ���ص���
		//private���� public �޼ҵ带 ���ؼ� �ܺο��� ��� ����
	}
	
	public void SetB(int b) {
		bb=b;
	}
	public void SetC(int c) {
		cc=c;
	}
	
	public void Disp() {
		System.out.println("aa�� : "+aa+"\nbb�� : "+bb+"\ncc�� : "+cc);
	}

	public static void main(String[] args) {
		AccessEx ex=new AccessEx();
		
		ex.SetA(10); //�޼���� ������ �ʱ�ȭ
		ex.SetB(20);		
		ex.SetC(30);
		
		//ex.aa=10; //������� ��������
		//ex.bb=20;
		//ex.cc=30;
		ex.Disp();
	}
}
