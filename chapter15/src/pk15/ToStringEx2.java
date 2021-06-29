package pk15;

class BK {

	String title;
	String author;

	public BK(String title,String author) {
		this.author = author;
		this.title = title;
	}

	@Override
	public String toString() {
		return author + "," + title;
	}
}

	public class ToStringEx2 {
		public static void main(String[] args) {

			BK book = new BK("JAVA","soldesk");
			System.out.println(book.toString());

		}
	}


