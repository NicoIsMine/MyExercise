package InternetWork.Student;

public class Student {
	private int ID;
	private String Name;
	private int Grade;

	public void SetRecord(int ID, String Name, int Grade) {
		this.ID = ID;
		this.Name = Name;
		this.Grade = Grade;
	}

	public int getId() {
		return this.ID;
	}

	public int getGrade(int ID) {
		if (ID == this.ID) {
			return this.Grade;
		} else
			return -1;

	}

	public static void main(String[] args) {
		Student A = new Student();
		A.SetRecord(1, "lzy", 100);
		int g = A.getGrade(1);
		System.out.println(g);
	}
}
