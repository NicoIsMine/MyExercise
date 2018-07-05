package InternetWork.Stu;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Circle cir = new Circle(4);
		cir.show();
		Cylinder cyl = new Cylinder(3, 4);
		System.out.println(cyl.getArea());
		cyl.showVolume();
	}
}
