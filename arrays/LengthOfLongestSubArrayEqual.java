package me.sidx.arrays;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/* Input takes an array of integers and finds the length 
 * of the longest sub array whose entries are equal. */

public class LengthOfLongestSubArrayEqual {
	
	public static int findLongestSubArr(List<Integer> A) {
		int counter = 1;
		int sizeOfLSA = 1;
		
		for(int i = 1; i < A.size(); i++) {
			if (A.get(i) == A.get(i-1)) {
				counter++;
				if (counter > sizeOfLSA) {
					sizeOfLSA = counter;
				}
			
			}
			else {
				counter = 1;
			}		
	}
		return sizeOfLSA;
	}

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>(Arrays.asList(3,3,1,5,5,5,5,6,7,8,8));
		System.out.println(findLongestSubArr(A));
		
	}

}
