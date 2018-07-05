package InternetWork;

class Solution {
	public int removeDuplicates(int[] nums) {
		int n = 1;
		for (int i = 1; i < nums.length ; i++) {
			if(nums[i]!=nums[i-1]){
				nums[n] = nums[i];
				n++;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(nums[i]);
		}
		return n;
	}

	public static void main(String arg[]) {
		Solution solu = new Solution();
		solu.removeDuplicates( new int[] { 1, 1, 2, 2, 2, 4, 4, 5, 6, 6, 6});
	}
}
