package pk8;

public class TakeTrans {

	public static void main(String[] args) {

		StdInfo studentJames=new StdInfo("James", 5000);
		StdInfo studentJames2=new StdInfo("James2", 50000);
		StdInfo studentJiyoon=new StdInfo("Jiyoon",10000);
		StdInfo studentJiyoon2=new StdInfo("Jiyoon",1000000);
		
		Bus bus1142=new Bus(1142);
		Bus bus02=new Bus(2);
		
		studentJames.takeBus(bus1142);
		studentJames2.takeBus(bus02);
		
		studentJames.showInfo();
		studentJames2.showInfo();
		
		bus1142.busInfo();
		bus02.busInfo();
		
		Subway sub=new Subway("2호선");
		Subway sub7=new Subway("7호선");
		
		studentJiyoon.takeSub(sub);
		studentJiyoon2.takeSub(sub7);
		
		sub.subInfo();
		sub7.subInfo();
		
		studentJiyoon.showInfo();
		studentJiyoon2.showInfo();
		

		
		
	}	

}
