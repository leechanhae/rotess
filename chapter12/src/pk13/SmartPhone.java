package pk13;

public class SmartPhone extends Phone {


	//생성자
	public SmartPhone(String owner) { //생성자안에 생성자호출
		super(owner); //super(owner) = Phone(owner)
	}
	//상속을 했을때 부모에 기본생성자가 없을때 자식 생성자에 디폴트 값이 들어와야하는데
	//구현 되지 않으면 에러가 뜸 -->추상으로 보기 때문
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
