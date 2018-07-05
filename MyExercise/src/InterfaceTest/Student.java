package InterfaceTest;

public class Student extends Person implements Calculate {

	private String name;
	private int age;

	static {
		System.out.println("Student can calculate!");
	}

	@Override
	public void career() {
		System.out.println("I'm a student!");
	}

	public boolean isundergraduate() {
		if (this.age >= 18 && this.age <= 23) {
			return true;
		} else {
			return false;
		}
	}

	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}

	public int subtract(int i, int j) {
		// TODO Auto-generated method stub
		return i - j;
	}

	public double multiply(double i, double j) {
		// TODO Auto-generated method stub
		return i * j;
	}

	public double divide(double i, double j) {
		// TODO Auto-generated method stub
		return i / j;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
