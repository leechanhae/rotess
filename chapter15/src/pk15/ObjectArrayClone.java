package pk15;

import java.util.ArrayList;

class MyBook implements Cloneable {
	String title;

	public MyBook(String title) {
		this.title = title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

public class ObjectArrayClone {

	public static void main(String[] args) {
		ArrayList<MyBook> bookList = new ArrayList<MyBook>();
		
		MyBook book1=new MyBook("소나기");
		MyBook book2=new MyBook("태풍");
		MyBook book3=new MyBook("신");		
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(new MyBook("삼국지"));
		
		//======================
		ArrayList<MyBook> copyList=(ArrayList)bookList.clone();
		copyList.add(new MyBook("해리포터"));//이렇게 넣어도위에랑똑같음
		System.out.println(bookList);
		System.out.println(copyList);
		
		book3.setTitle("개미");
		System.out.println(bookList);
		System.out.println(copyList);

	}

}
