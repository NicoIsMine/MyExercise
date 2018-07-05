package Travel;

public class Rent {
	Rent() {

	}

	int perday = 220;

	public int allrent(int days) {
		int sum = days * perday;
		return sum;
	}
}
