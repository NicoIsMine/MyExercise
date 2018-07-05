package InternetWork;

public class Solution4 {

	public boolean containsDuplicate(int[] nums) {
		boolean m = true;
		for (int i = 0; i < nums.length; i++) {
			if (m == false) {
				break;
			}
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == nums[i]) {
					m = false;
					break;
				}
			}
		}
		return m;
	}
}
