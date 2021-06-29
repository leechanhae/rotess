package pk13;

public class AnimalExample {
	public static void main(String[] args) {

		//������ ��ü�� ���� Cat�� Dog�޼��� ȣ��
		System.out.println("---������ ��ü ����---");
		Dog dog=new Dog();
		System.out.println(dog.kind);
		System.out.print("�� �Ҹ� : ");
		dog.sound();
		Cat cat=new Cat();
		System.out.println(cat.kind);
		System.out.print("����� �Ҹ� : ");
		cat.sound();
		
		System.out.println("---�ڵ�����ȯ(upcasting)---");
		
		Animal dog1=new Dog();
		dog1.sound();
		Animal cat2=new Cat();
		cat2.sound();
		
		//���� ��� �����°� ����� �ٸ���
		Animal animal=null;
		
		animal=new Dog();
		animal.sound();
		
		animal=new Cat();
		animal.sound();
		
		System.out.println("---�޼��� ���---");
		animalSound(new Cat());
		animalSound(new Dog());
	}//main
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
