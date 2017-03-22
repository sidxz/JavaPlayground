package me.sidx.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicNumber {
	
	public static List<Integer> plusOne(List<Integer> A) {
		int n = A.size() - 1;
		
		// Add one to the last element | 9 9 9 will be 9 9 10
		A.set(n, A.get(n)+1);
		
		/* Now see if the ith position is 10
		 * then make ith position 0 
		 *  and increment i-1 position by 1
		 * 9 9 10 =>  9 10 0 in the first pass
		 * Second Pass 9 10 0 => 10 0 0 
		 */
		for(int i = n; i > 0 && A.get(i) == 10 ; --i) {
			A.set(i, 0);
			A.set( i-1, A.get(i-1)+1);
		}
		
		/* See if the first digit is 10,
		 * Then we need to make it 0 and add one more digit,
		 * for example initial 999 should be 1000.
		 * After the loop, 999 has transformed to 10 0 0. 
		 * Here we change 10 0 0 to 1 0 0 0
 		 */
		if(10 == A.get(0)) {
			A.set(0, 0);
			A.add(0, 1);
		}
		
		return A;
	}
	
	public static void testInput(List<Integer> A) {
		System.out.println("Transforming " + A + " => " + plusOne(A));
	}

	public static void main(String[] args) {

		/*
		 *  /!\ GENERIC NOTE List<Integer> A = Arrays.asList(9,9,9);
		 *  Arrays.asList(1,2,3,4) creates a "list view" on an array whose size can't change.
		 *  That way we can use and access an array through the List interface.
		 *  If you want a list in which you can add values but still use the convenient Arrays.asList(..), simply do:
		 *  List<Integer> sam = new ArrayList<>(Arrays.asList(1,2,3,4));
		 */
		List<Integer> A = new ArrayList<Integer>(Arrays.asList(2,7,5));
		testInput(A);
		A.clear();
		
		A = new ArrayList<Integer>(Arrays.asList(2,9,9));
		testInput(A);
		A.clear();
		
		A = new ArrayList<Integer>(Arrays.asList(9,9,9));
		testInput(A);
		A.clear();
		
	}

}
