package pk15;

public class EqualsTest {

	public static void main(String[] args) {

		Student studentLee = new Student(10000, "김자반");
		Student studentLee2 = studentLee;
		Student studentKim = new Student(10000, "김자반");

		System.out.println("동일한 주소의 두 인스턴스 비교");
		if (studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		}
		if (studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2의 내용은 같습니다.");
		} else {
			System.out.println("studentLee와 studentLee2의 내용은 다릅니다.");
		}

		System.out.println("다른 주소의 두 인스턴스 비교");
		if (studentLee == studentKim) {
			System.out.println("studentLee와 studentKim의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 studentKim의 주소는 다릅니다.");
		}
		if (studentLee.equals(studentKim)) {
			System.out.println("studentLee와 studentKim의 내용은 같습니다.");
		} else {
			System.out.println("studentLee와 studentKim의 내용은 다릅니다.");
		}
		
		System.out.println("같은 주소의 해쉬코드 비교");
		if(studentLee.hashCode()==studentLee2.hashCode()) {
			System.out.println("studentLee와 studentLee2의 해쉬코드는 같습니다.");
		}else {
			System.out.println("studentLee와 studentLee2의 해쉬코드는 다릅니다.");
		}
		System.out.println("다른 주소의 해쉬코드 비교");
		if(studentLee.hashCode()==studentKim.hashCode()) {
			System.out.println("studentLee와 studentKim의 해쉬코드는 같습니다.");
		}else {
			System.out.println("studentLee와 studentKim의 해쉬코드는 다릅니다.");
		}
		
		System.out.println(System.identityHashCode(studentLee));
		System.out.println(System.identityHashCode(studentLee2));
		System.out.println(System.identityHashCode(studentKim));
	}

}
