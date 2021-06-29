package pk11;

import java.util.ArrayList;

public class AnimalTest2 {
	ArrayList<Animal> ani = new ArrayList<Animal>();

	public static void main(String[] args) {
		AnimalTest2 aa = new AnimalTest2();
		//�ڵ�����ȯ(��ĳ����)
		aa.addAnimal();
		System.out.println("---�ٿ�ĳ����---");
		aa.testcasting();
	}

	public void addAnimal() {

		ani.add(new Human()); //Animal������ ����ȯ�� �ؼ� �߰�
		ani.add(new Tiger());
		ani.add(new Eagle());

		for (Animal a : ani) {//�迭�� ��ҵ��� ������ moveȣ��
			a.move();//�������̵��� �޼ҵ常 ȣ��
			//�θ�Ÿ���̹Ƿ� �ڽ��� �޼���� �Ⱥ���
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
				System.out.println("��ü �ƴ�");
			}
		}
	}
}
