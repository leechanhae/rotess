package pk14;

public class BookShelfMain{

	
	
	public static void main(String[] args) {
		Queue shelfQueue=new BookShelf();
		
		shelfQueue.enQueue("�¹���1");
		shelfQueue.enQueue("�¹���2");
		shelfQueue.enQueue("�¹���3");
				
		System.out.println(shelfQueue.getSize()+"���� å�� �԰��");
		System.out.println("----------------------------------");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println("��� �� ���� å "+shelfQueue.getSize()+"��");
	}

}
