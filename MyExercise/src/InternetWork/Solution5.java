package InternetWork;

public class Solution5 {

	public int singleNumber(int[] nums) {
		int result = 0;
        for(int i = 0;i<nums.length;i++){
                    int n = 0;
            for(int j = 0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                	n = n+1;
                }
            }
            if(n == 1){
                result =  nums[i];
                break;
            }
        }
        return result;
    }
	
	
	public static void main(String[] args) {
		Solution5 solu = new Solution5();
		int i = solu.singleNumber(new int[] {1,1,5,5,7,1,9,4,9,7});
		System.out.println(i);
	}
}
