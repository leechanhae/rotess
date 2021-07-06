package pk17;

public class StringBuilderTest {

	public static void main(String[] args) {

		String javastr=new String("Java");
		//贸澜 积己等 皋葛府狼 林家
		System.out.println("javastr狼 贸澜 积己等 皋葛府狼 林家 : "+System.identityHashCode(javastr));
		
		StringBuilder buffer=new StringBuilder(javastr); //StringBuilder 积己
		
		//buffer皋葛府 林家
		System.out.println("楷魂 傈 buffer 皋葛府 林家 : "+System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append("android ");
		buffer.append("programming is fun!!");
		//buffer 皋葛府 林家
		System.out.println("楷魂 饶 buffer 皋葛府 林家 : "+System.identityHashCode(buffer));
		
		javastr=buffer.toString();
		System.out.println("货肺 父甸绢柳 javastr 皋葛府 林家 : "+System.identityHashCode(javastr));
		
	}

}
