package for2_primitiveArray;

public class FindMaximum {
	public static void main(String[] args) {
		int[] nums = new int [4];
		nums[0] =46;
		nums[1]= 50;
		nums[2]=15;
		nums[3]=68;
		
		int max = nums[0];
		for(int i=0; i<=nums.length-1; i++) {
			if(nums[i] >= max) {
				max= nums[i];
			}
		}
		System.out.println(max);
	}

}
