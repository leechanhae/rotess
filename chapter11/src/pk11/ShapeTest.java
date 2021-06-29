package pk11;

import java.util.ArrayList;

class Shape {
	void draw() {
		System.out.println("draw Shape");
	}
}

class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Circle");
	}
	
	void circle() {
		System.out.println("원 모양 입니다.");
	}
	
}

class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}
	
	void rectangle() {
		System.out.println("사각형 모양 입니다.");
	}
}

class Triangle extends Shape{
	
	@Override
	void draw() {
		System.out.println("draw Triangle");
	}
	
	void triangle() {
		System.out.println("삼각형 모양 입니다.");
	}
}

public class ShapeTest {
	//Shape를 기준으로 Shape 클래스와 Shape를 상속받은 모든 클래스
	//위에 만든 모양들이 선언이 되어있음 
	ArrayList<Shape> sList=new ArrayList<Shape>();
	//<> 제네릭 타입 : 클래스명넣기
	public static void main(String[] args) {
		ShapeTest sTest=new ShapeTest();
		System.out.println("---업캐스팅---");
		sTest.addShape();
		System.out.println("---다운 캐스팅---");
		sTest.testCasting();
		
	}
	
	public void addShape() {
		
		sList.add(new Circle()); //Circle s=new Circle()
		sList.add(new Rectangle());//Rectangle s=new Rectangle();
		sList.add(new Triangle());//Triangle s=new Triangle();
		
		//업캐스팅
		//오버라이딩해서 부모꺼 안읽음
		for(Shape s:sList) {
			s.draw();
		}
	}
	
	public void testCasting() {
		
		for(int i=0;i<sList.size();i++) {
			Shape s=sList.get(i); //일단 Shape타입으로 가져옴
			
			if(s instanceof Circle) {
				Circle c=(Circle) s; //다운캐스팅 Circle로 형변환
				c.circle();
			}else if(s instanceof Rectangle) {
				Rectangle r=(Rectangle) s;
				r.rectangle();
			}else if(s instanceof Triangle) {
				Triangle t=(Triangle) s;
				t.triangle();
			}else {
				System.out.println("모양이 아닙니다.");
			}
		}
	}

}
