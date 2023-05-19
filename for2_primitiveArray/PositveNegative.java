package for2_primitiveArray;

public class PositveNegative {
	public static void main(String[] args) {
			int [] nums = {10,20,-10,30,-20,70};
			int count1 = 0;
			int count2 = 0;
			
			for(int x : nums) {
				if(x>0 ) {
				 count1++;
				}
				else if(x<0) {
				 count2++;
				}
			}
			System.out.println(count1);
			System.out.println(count2);
			
			int max = nums[0];
			for(int i = 0; i<nums.length;i++) {
				if(nums[i]>nums[i]);
				max =nums[i];
			}
				System.out.println(max);
			
}
}