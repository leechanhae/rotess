package pk18_1;

class MyArrayG<T> {
	private Object[] array = new Object[10];
	int i;

	// 제네릭 메소드
	public void add(T obj) {
		array[i++] = obj;
	}

	// 제네릭 메소드
	public T get(int index) {
		return (T) array[index];
	}
}

public class MyArrayTest2 {

	public static void main(String[] args) {

		MyArrayG<String> myArray1=new MyArrayG<>();
		myArray1.add(new String("test"));
		String str=myArray1.get(0);
		System.out.println(str);
		
		MyArrayG<Integer> myArray2=new MyArrayG<>();
		myArray2.add(new Integer(100));
		Integer num=myArray2.get(0);
		System.out.println(num);
	}

}
