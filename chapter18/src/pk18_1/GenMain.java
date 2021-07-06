package pk18_1;

public class GenMain {

	public static void main(String[] args) {

		Gen gen=new Gen();
		
		Integer[] iArr= {1,2,3,4,5};
		Double[] dArr= {1.1,2.2,3.3,4.4,5.5};
		Character[] cArr= {'a','b','c','d','e'};
		
		//int, double, char 와 같은 기본자료형들로 만들면 대입이 불가능하다.
		//반드시 제네릭 이용시는 객체로 처리해야 한다.
		gen.printArr(iArr);
		gen.printArr(dArr);
		gen.printArr(cArr);
	}

}
