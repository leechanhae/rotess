package pk14;

public class InterMain implements Inter_Menu3 {

	@Override
	public String jajang() {
		// TODO Auto-generated method stub
		return "�ϳ� ������ �ƴ� ¥���";
	}

	@Override
	public String jjanbbong() {
		// TODO Auto-generated method stub
		return "«���̳�? ����̳�";
	}

	@Override
	public String tangsuyook() {
		// TODO Auto-generated method stub
		return "���� ������";
	}

	@Override
	public String bokkeumbap() {
		// TODO Auto-generated method stub
		return "���� ������";
	}
	
	public static void main(String[] args) {

		InterMain im=new InterMain();
		
		System.out.println("�츮�� �޴���");
		Inter_Menu1 im1=im;
		Inter_Menu2 im2=im;
		Inter_Menu3 im3=im;
		
		System.out.println(im1.jajang());
		System.out.println(im1.jjanbbong());
		System.out.println(im2.tangsuyook());
		System.out.println(im3.bokkeumbap());
		
	}

}
