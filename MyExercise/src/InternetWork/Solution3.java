package InternetWork;

public class Solution3 {

	public void rotate(int[] nums, int k) {

		int count = k%nums.length;
		for (int i = 0; i < count; i++) {
			int tem;
			tem = nums[nums.length - 1];
			for (int j = nums.length - 2; j >= 0; j--) {
				nums[j + 1] = nums[j];
			}
			nums[0] = tem;
		}
		for (int i : nums) {
			System.out.println(i);
		}

	}
	
	public static void main(String[] args) {
		Solution3 solu = new Solution3();
		solu.rotate(new int[] {1,2,3,4,5}, 11);
		
	}
}
