package pk8;

import java.util.Random;

public class Start {

	private int random = new Random().nextInt(50) + 1;
	private int count;
	private String result = "FAIL";

	public String check(int n) {
		count++;

		if (n > random) {
			System.out.println("down");
		} else if (n < random) {
			System.out.println("up");
		} else {
			System.out.println(count + "회 만에 정답");
			result = "SUCCESS";
		}

		return result;
	}
}
