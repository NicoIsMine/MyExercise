package Travel;

import java.util.Scanner;

public class LetsGo {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("\t" + "一起去旅游吧！");
		while (true) {
			System.out.print("亲，上车吧！（“Y“或”N“）:");
			String s = sca.nextLine();
			if (s.equals("N")) {
				System.out.println("欢迎下次的世纪旅行！");
				break;
			}
			Tax tax = new Tax();
			Drinks drinks = new Drinks();
			Rent rent = new Rent();
			System.out.print("您坐出租车行了多少里：");
			int li = sca.nextInt();
			int billoftax = tax.bill(li);
			System.out.print("您一共喝了果汁、矿泉水、牛奶各多少瓶，请用空格隔开输入：");
			int i = sca.nextInt();
			int j = sca.nextInt();
			int k = sca.nextInt();
			int billofdrinks = drinks.alldrinks(i, j, k);
			System.out.print("您租了几天的旅馆：");
			int days = sca.nextInt();
			int billofrent = rent.allrent(days);
			int total = billoftax + billofdrinks + billofrent;
			System.out.println("您本次旅游共消费：" + total);
		}
	}
}
