package SchoolIdolProject.YinNaiMuBan;

import java.util.Scanner;

public class μs {

	static {
		System.out.println("欢迎来到音乃木坂学院！We are μ's！");
	}
	Scanner sca = new Scanner(System.in);
	protected int num;
	protected String name;
	protected int grade;
	protected int age;
	protected String bloodtype;
	protected String teamname = "μs";
	protected int member = 9;
	protected String memberName[] = { "Guo", "Niao", "Hai", "Yang", "Lin", "Ji", "Ni", "Xi", "Li" };

	public void adv() {

	}

	public void dis() {

	}

	public void familyMember() {

	}

	public void hobby() {

	}

	public void findMemberbynum() {
		System.out.print("请输入你想知道的成员的编号（1—9）：");
		int i = sca.nextInt();
		switch (i) {
		case 1:
			System.out.println("惠乃果");
			break;
		case 2:
			System.out.println("南小鸟");
			break;
		case 3:
			System.out.println("园田海未");
			break;
		case 4:
			System.out.println("小泉花阳");
			break;
		case 5:
			System.out.println("星空凛");
			break;
		case 6:
			System.out.println("西木野真姬");
			break;
		case 7:
			System.out.println("矢泽妮可");
			break;
		case 8:
			System.out.println("东条希");
			break;
		case 9:
			System.out.println("绚濑绘里");
			break;
		default:
			System.out.println("NotFind");
			break;
		}

	}

	public void findNumByName() {
		System.out.print("请输入成员姓名：");
		String s = sca.next();
		switch (s) {
		case "惠乃果":
			System.out.println("她的团队编号是1.");
			break;
		case "南小鸟":
			System.out.println("她的团队编号是2");
			break;
		case "园田海未":
			System.out.println("她的团队编号是3");
			break;
		case "小泉花阳":
			System.out.println("她的团队编号是4");
			break;
		case "星空凛":
			System.out.println("她的团队编号是5");
			break;
		case "西木野真姬":
			System.out.println("她的团队编号是6");
			break;
		case "矢泽妮可":
			System.out.println("她的团队编号是7");
			break;
		case "东条希":
			System.out.println("她的团队编号是8");
			break;
		case "绚濑绘里":
			System.out.println("她的团队编号是9");
			break;
		default:
			System.out.println("NotFind");
			break;
		}

	}

	public String findMember(AllMember al) {
		switch (al) {
		case HuinaiGuo:
			return "惠乃果";
		case NanXiaoniao:
			return "南小鸟";
		case YuantianHaiwei:
			return "园田海未";
		case XiaoquanHuayang:
			return "小泉花阳";
		case XingkongLin:
			return "星空凛";
		case XimuyeZhenji:
			return "西木野真姬";
		case ShizeNike:
			return "矢泽妮可";
		case DongtiaoXi:
			return "东条希";
		case XunlaiHuili:
			return "绚濑绘里";
		default:
			return "NotFind";

		}
	}

}
