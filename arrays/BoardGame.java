package me.sidx.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BoardGame {
	public static void boardGame(List<Integer> indices) {
		
		int canScanUpto = indices.get(0);
		int maxValue = indices.get(0);
		int posOfMaxValue = 0;
		int pos = 0;
		
		for (int i = 1; i < indices.size(); i++) {
		
			/* Always Record the position of max value and 
			 *  the max value
			 */
			if (indices.get(i) >= maxValue ) {
				maxValue = indices.get(i);
				posOfMaxValue = i;
			}
			
			/*
			 * when the scanning range is over,
			 * update your position
			 */
			
			if (i >= canScanUpto) {
				System.out.println("Move from "+pos+" to "+ posOfMaxValue);
				pos = posOfMaxValue;
				canScanUpto = posOfMaxValue + maxValue;
				maxValue = 0;
			}
			
			if (canScanUpto > indices.size()-1) {
				System.out.println("Move from "+pos+" to end");
				break;
			}
			
			
		}

}
	
	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>(Arrays.asList(3,3,1,0,2,0,1));
		//List<Integer> A = new ArrayList<Integer>(Arrays.asList(3,3,1,0,2,0,2,1));
		//List<Integer> A = new ArrayList<Integer>(Arrays.asList(3,3,4,0,2,0,1,5,6));
		boardGame(A);
	}
}
