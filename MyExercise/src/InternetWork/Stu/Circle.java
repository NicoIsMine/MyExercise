package InternetWork.Stu;

public class Circle {
	private float radius;

	Circle() {
		radius = 0;
	}

	public Circle(float r) {
		this.radius = r;
	}

	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}

	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}

	public void show() {
		System.out.println("圆的半径：" + radius + "周长：" + getPerimeter() + "面积：" + getArea());
	}

}
