package pk14_2;

import java.util.Scanner;

public class SchedulerTest {

	// Scheduler 클래스를 기준으로 하여 RoundRobin, LeasJob, PriorityAllocation

	public static void main(String[] args) {

		boolean run = true;
		Scheduler rr = new RoundRobin();
		Scheduler lj = new LeasJob();
		Scheduler pr = new PriorityAllocation();
		Scanner scan = new Scanner(System.in);		
		
		while (run) {
			System.out.println("R || r 한명씩 차례로 할당");
			System.out.println("L || l 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P || p 업무 skill 값이 높은 상담원에게 할당");
			System.out.println("S || s 종료");
			System.out.print("전화 상담 할당 방식을 선택하세요 : ");	
			
			//System.in.read(); //콘솔에 입력받기 모든 입력값을 아스키코드값
			//int ch=Ststem.in.read(); //아스키코드값
			
			String str=scan.nextLine();
			int ch=str.charAt(0);
			Scheduler Scheduler=null;
			
			if (ch=='R'||ch=='r') {
				System.out.println("상담 전화를 순서대로 대기열에서 받아옵니다.");
				rr.getNextCall();
				rr.sendCallToAgent();
			} else if (ch=='L'||ch=='l') {
				System.out.println("상담 전화를 순서대로 대기열에서 받아옵니다.");
				lj.getNextCall();
				lj.sendCallToAgent();
			} else if (ch=='P'||ch=='p') {
				System.out.println("상담 전화를 순서대로 대기열에서 받아옵니다.");
				pr.getNextCall();
				pr.sendCallToAgent();
			} else if (ch=='s'||ch=='S') {				 
				System.out.println("종료");
				run = false;
			}else {
				System.out.println("지원되지않는 기능");
				continue;
			}
		}
	}

}
