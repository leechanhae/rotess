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

		Book bk = new Book(200, "모모");
		System.out.println(bk); //객체의 주소값 반환
		System.out.println(bk.toString()); //heap메모리 데이터 문자열 처리
		
		String str=new String("TEST");
		System.out.println(str);
		
	}

}
