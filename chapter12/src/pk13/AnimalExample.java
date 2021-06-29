package pk13;

public class AnimalExample {
	public static void main(String[] args) {

		//각각의 객체를 만들어서 Cat과 Dog메서드 호출
		System.out.println("---각각의 객체 생성---");
		Dog dog=new Dog();
		System.out.println(dog.kind);
		System.out.print("개 소리 : ");
		dog.sound();
		Cat cat=new Cat();
		System.out.println(cat.kind);
		System.out.print("고양이 소리 : ");
		cat.sound();
		
		System.out.println("---자동형변환(upcasting)---");
		
		Animal dog1=new Dog();
		dog1.sound();
		Animal cat2=new Cat();
		cat2.sound();
		
		//같은 결과 나오는거 방법만 다른거
		Animal animal=null;
		
		animal=new Dog();
		animal.sound();
		
		animal=new Cat();
		animal.sound();
		
		System.out.println("---메서드 사용---");
		animalSound(new Cat());
		animalSound(new Dog());
	}//main
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
