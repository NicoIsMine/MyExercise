package Lesson3;

public class StingBufferT {

	public static void main(String[] args) {
		try {
			int f=1;
			StringBuffer a = new StringBuffer("A");
			StringBuffer b = new StringBuffer("B");
			mereg(a, b,f);
			System.out.println(a + "," + b);
			System.out.println("out"+f);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		

	}

	public static void mereg(StringBuffer x, StringBuffer y,int a) {
//		x.append(y).append(x);
		System.out.println("11111"+(x.append(y).append(x).append(x).append(y)));
		a=2;
		y = x;
		System.out.println("2222"+y);
		System.out.println("in"+a);
	}

}
