package InternetWork.Stu;

public class Cylinder extends Circle {
	double hight;
	double radius;

	Cylinder(double r, double h) {
		this.hight = h;
		this.radius = r;
	}

	double getVolume() {
		return 3.14 * this.radius * this.radius * hight;
	}

	void showVolume() {
		System.out.println("圆柱体的体积为：" + getVolume());
	}
}
