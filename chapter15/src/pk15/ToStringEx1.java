package pk15;

class Book {

	int booknumber;
	String bookTitle;

	public Book(int booknumber, String bookTitle) {

		this.booknumber = booknumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		
		return bookTitle+","+booknumber;
	}
	
}

public class ToStringEx1 {
	public static void main(String[] args) {

		Book bk = new Book(200, "���");
		System.out.println(bk); //��ü�� �ּҰ� ��ȯ
		System.out.println(bk.toString()); //heap�޸� ������ ���ڿ� ó��
		
		String str=new String("TEST");
		System.out.println(str);
		
	}

}
