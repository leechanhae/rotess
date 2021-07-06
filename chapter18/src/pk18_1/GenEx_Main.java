package pk18_1;

public class GenEx_Main {
	public static void main(String[] args) {

		// String => 100

		// Int => 1000

		// char =>

		// double => 3.14

		GenEx<String> str = new GenEx<String>();
		str.setValue("100");
		String str1 = str.getValue();
		System.out.println(str1);

		GenEx<Integer> int1 = new GenEx<Integer>();
		int1.setValue(1000);
		Integer int2 = int1.getValue();
		System.out.println(int2);

		GenEx<Character> ch = new GenEx<Character>();
		ch.setValue('A');
		Character ch1 = ch.getValue();
		System.out.println(ch1);

		GenEx<Double> db = new GenEx<Double>();
		db.setValue(3.14);
		Double db1 = db.getValue();
		System.out.println(db1);
	}
}
