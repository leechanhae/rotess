package pk11;

public class Main {

	public static void main(String[] args) {

		ChildExam c1=new ChildExam();
		
		System.out.println(c1.getCar());//자식
		System.out.println(c1.getMoney()+"원");//부모
		
		//childexam은 곧 parentexam
		//왼쪽의 객체가 오른쪽의 클래스의 인스턴스(즉 그 클래스로 만든 객체)
		if(c1 instanceof ParentExam) {
			System.out.println("c1은 parentexam의 자식 클래스 입니다.");
		}
		
		System.out.println("1.===================================");
		
		ChildExam ch=new ChildExam();
		ParentExam p1=new ParentExam();
		
		p1=ch; //자식이 부모에게 가는 것은 자동 형변환 오버라이딩 한 상태에서 부모클래스의 매서드를 사용
		ch=(ChildExam)p1; //다운캐스팅은 형변환을 써줘야함
		
		//자식은 부모의 메서드와 자기 자신의 메소드를 다 사용할 수 있다.
		System.out.println(ch.getMoney());
		System.out.println(ch.getCar());
		System.out.println(ch.getStr());
		System.out.println("2.-----------------------------------");
		
		//반면
		p1=ch; //부모에 자식을 대입해도(자동 형변환)
		//부모는 부모꺼만 사용가능
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		System.out.println("3.-----------------------------------");
		//이렇게 쓰는 경우는 많지않음
		System.out.println(((ChildExam)p1).getCar());
	}

}
