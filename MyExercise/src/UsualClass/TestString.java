package UsualClass;

public class TestString {

	public static void main(String[] args) {
		char [] c={'a','b','c','e'};
		String s=new String(c);
		System.out.println(s);
		System.out.println(c[2]);
		
		System.out.println("**************************");
		char [] c1={'1','w','9','q','r'};
		String s1=new String(c1,1,3);//截取c1中的一段
		System.out.println(s1);
		
		System.out.println("**************************");
		String s2="aopce";
		boolean b=s2.startsWith("ao");
		boolean b1=s2.startsWith("ac");
		System.out.println(b);
		System.out.println(b1);
		
		System.out.println("**************************");
		String s3="pamjacas";
		int i=s3.compareToIgnoreCase("zcsa");
		int i1=s3.compareToIgnoreCase("acsa");
		int i2=s3.compareTo("zcsc");
		int i3=s3.compareTo("acev");
		int i4=s3.compareTo("pamjacas");
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		
		System.out.println("***************************");
		String s4="student";
		boolean b2=s4.contains("ude");
		System.out.println(b2);
		String s5=s4.substring(3, 6);//2到5-1的位置
		System.out.println(s5);
	}
}
