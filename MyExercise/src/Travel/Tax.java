package Travel;

public class Tax {
	Tax() {
	}

	int price = 10;
	int perli = 3;

	public int bill(int li) {
		int sum = price + perli * li;
		return sum;
	}
}
