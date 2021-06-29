package pk15;

public class ArrayClone {

	public static void main(String[] args) {

		int[] arr1= {1,2,3,4,5};
		int[] arr2;
		
		arr2=arr1.clone(); //복사
		
		for(int arr:arr2) {
			System.out.print(arr+"");
		}
		System.out.println();
		
		arr2[3]=0;
		System.out.println("변경 후 arr1 배열");
		for(int arr:arr1) {
			System.out.print(arr+"");
			}
		System.out.println();
		
		System.out.println("변경 후 arr2 배열");
		for(int arr:arr2) {
			System.out.print(arr+"");
			}
		System.out.println();
	}

}
