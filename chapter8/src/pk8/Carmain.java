package pk8;

public class Carmain {
	public static void main(String[] args) {
		
		Car c=new Car();
		
		System.out.println("제작회사 : "+c.company);
		System.out.println("모델명 : "+c.model);
		System.out.println("색상 : "+c.color);
		System.out.println("최고 속도 : "+c.maxSpeed);
		System.out.println("현재 속도 : "+c.speed);
		c.speed=60;
		System.out.println("==속도변경 후 출력 ==");
		System.out.println("수정된 속도 : "+c.speed);
		

	}
}
