package pk11;

import java.util.ArrayList;

public class AnimalTest2 {
	ArrayList<Animal> ani = new ArrayList<Animal>();

	public static void main(String[] args) {
		AnimalTest2 aa = new AnimalTest2();
		//자동형변환(업캐스팅)
		aa.addAnimal();
		System.out.println("---다운캐스팅---");
		aa.testcasting();
	}

	public void addAnimal() {

		ani.add(new Human()); //Animal형으로 형변환을 해서 추가
		ani.add(new Tiger());
		ani.add(new Eagle());

		for (Animal a : ani) {//배열의 요소들을 꺼내서 move호출
			a.move();//오버라이딩된 메소드만 호출
			//부모타입이므로 자식의 메서드는 안보임
		}
	}

	public void testcasting() {
		for (int i = 0; i < ani.size(); i++) {
			Animal a = ani.get(i);

			if (a instanceof Human) {
				Human h = (Human) a;
				h.readBook();
			} else if (a instanceof Eagle) {
				Eagle e = (Eagle) a;
				e.flying();
			} else if (a instanceof Tiger) {
				Tiger t = (Tiger) a;
				t.hunt();
			} else {
				System.out.println("개체 아님");
			}
		}
	}
}
