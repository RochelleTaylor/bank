import java.util.Scanner;

public class selfpractice1 {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2, 3, 3, 1, 4, 4, 4, 5, 6, 6, 7, 7 };
		int count = 0;

		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				count++;
				while(i !=nums.length -1 && nums[i]==[i+1]) {
					i++; // taking one away from count(instead of two 1's you make it 1)
				}
			}
		}
		System.out.println(count);
		
		
		//count the number of clusters in the array
		
		
		
	}
	
}
		

