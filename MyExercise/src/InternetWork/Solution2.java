package InternetWork;

public class Solution2 {

	public int MaxProfit(int[] nums) {
		int sum = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				for (int j = i; j < nums.length; j++) {
					if (nums[j] < nums[j - 1]) {
						sum = sum + nums[j - 1] - nums[i - 1];
						i = j;
						break;
					} else if (j == nums.length - 1 && nums[j] > nums[j - 1]) {
						sum = sum + nums[j] - nums[i - 1];
						i = j;
						break;
					} else if (j == nums.length - 1 && nums[j] < nums[j - 1]) {
						sum = sum + nums[j - 1] - nums[i - 1];
						i = j;
						break;
					}
				}
			}
		}
		return sum;
	}

	public static void main(String arg[]) {
		Solution2 solu2 = new Solution2();
		int sum = solu2.MaxProfit(new int[] { 1, 3, 4, 7, 6, 10, 12, 14, 17, 20, 10, 9, 12, 13, 14 });
		System.out.println(sum);
	}
}
