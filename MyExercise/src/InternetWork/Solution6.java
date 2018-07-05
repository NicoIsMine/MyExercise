package InternetWork;

public class Solution6 {

	 public int[] intersect(int[] nums1, int[] nums2) {
		 int n = 0;
	        if(nums1.length>=nums2.length){
	        	for (int i = 0; i < nums2.length; i++) {
					for (int j = 0; j < nums1.length; j++) {
						if(nums2[i] == nums1[j]){
							nums2[n] = nums2[i];
							
							n++;
						}
					}
				}
	        }
	        return nums1;
	    }
}
