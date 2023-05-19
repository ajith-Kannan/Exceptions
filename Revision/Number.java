package Revision;

import java.util.List;
import java.util.ArrayList;

public class Number {
	
	
	public void findOddNum(List<Integer>nums) {
		for(Integer num : nums)
		if(num%2!=0) {
			System.out.println(num);
			}
		
		
		
	}
	
	public List<Integer> findPostive(List<Integer> nums1) {
		List <Integer> ns = new ArrayList<>();
		
		for(Integer n : nums1) {
			if(n>0) {
				 ns.add(n);
		
			}
		}
		return ns;
		
		

	
	}
	
	

}
