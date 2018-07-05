package Lesson3;

public class ProcessControl {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		while (i < 10) {
			if (i == 8)
				break;
			i++;
			if (i % 3 == 0)
				continue;
			System.out.print(i + "\t");

		}
	}
}
