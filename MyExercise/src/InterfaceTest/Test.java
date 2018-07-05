package InterfaceTest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		Student stu = new Student("hjz", 22);
		stu.career();
		boolean b = stu.isundergraduate();
		int i = stu.add(5, 6);
		double d = stu.multiply(5, 5.1);
		System.out.println("5+6=" + i);
		System.out.println("5*5.1=" + d);
		System.out.println("Is it a undergraduate:" + b);
	}

}
