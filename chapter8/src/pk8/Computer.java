package pk8;

public class Computer {

	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) { //... 배열선언 []랑 같음
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
}
