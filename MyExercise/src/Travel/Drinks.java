package Travel;

public class Drinks {
	Drinks() {

	}

	int juice = 5;
	int mineral = 3;
	int milk = 6;

	public int alldrinks(int i, int j, int k) {
		int sum = i * juice + j * mineral + k * milk;
		return sum;
	}
}
