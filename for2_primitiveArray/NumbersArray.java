package for2_primitiveArray;

public class NumbersArray {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int temp = 0;
		int count=0;
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] % 2 != 0) {
				System.out.println(nums[i]);
			}

		}
		for (int i = 0; i <= nums.length - 1; i++) {
			temp = temp + nums[i];

		}
		System.err.println(temp);

		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] >= 50 && nums[i] <= 100) {
				System.out.println(nums[i]);
			}
		}

		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] % 2 == 0) {
				count=count + 1;
			}
		}
		System.out.println(temp);

		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] % 5 == 0) {
				continue;
			}
			System.out.println(nums[i]);
		}

	}

}
