package pk18_1;

public class Plastic extends Material {

	@Override
	public String toString() {
		return "재료는 플라스틱입니다.";
	}

	@Override
	public void doPrinting() {
System.out.println("플라스틱으로 만듭니다.");
	}

}
