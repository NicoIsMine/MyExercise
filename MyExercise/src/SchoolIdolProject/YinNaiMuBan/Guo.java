package SchoolIdolProject.YinNaiMuBan;

import java.util.Scanner;

public class Guo extends μs implements SecondGrade {

	Scanner sca = new Scanner(System.in);
	private String name = "HuinaiGuo";
	private int num = 1;
	private String color = "orange";
	private int grade = 2;
	private int age = 16;
	private String bloodtype = "O";

	@Override
	public void adv() {
		System.out.println("她的优点：无论什么时候都充满活力，元气满满，无论什么困难都能以乐观的精神面对。");
	}

	@Override
	public void dis() {
		System.out.println("她的缺点：典型的笨手笨脚的性格。平时做事从不经过大脑思考，所以经常犯错误，" + "不过一旦认真起来就会十分投入，做事向来言出必行。十分喜欢吃零食，典型的吃货属性。"
				+ "因为嘴馋的原因，所以经常会有关于体重的烦恼。为人随性，房间经常乱糟糟的。偶尔也会展现出天然黑的一面。");
	}

	@Override
	public void hobby() {
		System.out.println("他的兴趣爱好：游泳、收集贴纸。");
	}

	@Override
	public void familyMember() {
		System.out.print("请输入你想知道的果果的家庭成员:");
		String s = sca.next();
		if (s.equals("妹妹")) {
			System.out.println("高坂雪穗");
		} else if (s.equals("爸爸")) {
			System.out.println("果爸");
		} else if (s.equals("妈妈")) {
			System.out.println("果妈");
		} else {
			System.out.println("暂无你需要的家庭成员信息，抱歉！");
		}

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodtype() {
		return bloodtype;
	}

	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Guo [sca=" + sca + ", name=" + name + ", num=" + num + ", color=" + color + ", grade=" + grade
				+ ", age=" + age + ", bloodtype=" + bloodtype + "]";
	}

}
