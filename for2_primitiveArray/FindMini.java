package for2_primitiveArray;

public class FindMini {
		public static void main(String[] args) {
			int[] nums = {46,50,15,68};
			
			int min = nums[0];
			for(int i=0; i<=nums.length-1; i++) {
				if(nums[i] <= min) {
					min= nums[i];
				}
			}
			System.out.println(min);
		}

	}



