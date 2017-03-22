package me.sidx.primitives;

public class CountingBits {
	
	/* 
	 * Program to count number of bits that are set to 1
	 */
	
	public static short countBits(int x) {
		short numBits = 0;
		
		while (0 != x) {
			numBits += (x & 1);
			x >>>= 1;
		}
		return numBits;
	}
	
	public static void main(String[] args) {
	
		int test = 300;		
		System.out.println("No of Bits in " + test + " is " + countBits(test));	
	}
}
