package pk14_2;

import java.util.Scanner;

public class SchedulerTest {

	// Scheduler Ŭ������ �������� �Ͽ� RoundRobin, LeasJob, PriorityAllocation

	public static void main(String[] args) {

		boolean run = true;
		Scheduler rr = new RoundRobin();
		Scheduler lj = new LeasJob();
		Scheduler pr = new PriorityAllocation();
		Scanner scan = new Scanner(System.in);		
		
		while (run) {
			System.out.println("R || r �Ѹ� ���ʷ� �Ҵ�");
			System.out.println("L || l ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
			System.out.println("P || p ���� skill ���� ���� �������� �Ҵ�");
			System.out.println("S || s ����");
			System.out.print("��ȭ ��� �Ҵ� ����� �����ϼ��� : ");	
			
			//System.in.read(); //�ֿܼ� �Է¹ޱ� ��� �Է°��� �ƽ�Ű�ڵ尪
			//int ch=Ststem.in.read(); //�ƽ�Ű�ڵ尪
			
			String str=scan.nextLine();
			int ch=str.charAt(0);
			Scheduler Scheduler=null;
			
			if (ch=='R'||ch=='r') {
				System.out.println("��� ��ȭ�� ������� ��⿭���� �޾ƿɴϴ�.");
				rr.getNextCall();
				rr.sendCallToAgent();
			} else if (ch=='L'||ch=='l') {
				System.out.println("��� ��ȭ�� ������� ��⿭���� �޾ƿɴϴ�.");
				lj.getNextCall();
				lj.sendCallToAgent();
			} else if (ch=='P'||ch=='p') {
				System.out.println("��� ��ȭ�� ������� ��⿭���� �޾ƿɴϴ�.");
				pr.getNextCall();
				pr.sendCallToAgent();
			} else if (ch=='s'||ch=='S') {				 
				System.out.println("����");
				run = false;
			}else {
				System.out.println("���������ʴ� ���");
				continue;
			}
		}
	}

}
