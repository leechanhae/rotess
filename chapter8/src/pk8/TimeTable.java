package pk8;

import java.util.Scanner;

public class TimeTable {

	public void showTable(int num) {
		System.out.println(num+"´Ü");
		int size=0;
		for(int i=1;i<10;i++) {
			System.out.print(num+"*"+i+" = "+(num*i)+" ");
			size++;
			if(size==3) {
				System.out.println();
				size=0;
			}
		}
	}
	public static void main(String[] args) {
		TimeTable tt=new TimeTable();
		int a=0;
		System.out.print("¸î´Ü? : ");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		tt.showTable(a);
	}
}
