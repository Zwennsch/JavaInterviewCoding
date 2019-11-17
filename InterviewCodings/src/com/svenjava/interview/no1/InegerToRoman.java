package com.svenjava.interview.no1;
/**
 * A class to convert a given Integer value into the Roman representation 
 * The Roman value should be a String.
 * @author Sven Schroeder
 *
 */
public class InegerToRoman {
	static int number = 2890;
	static int rest;
	static int[] romans = {1000, 500, 100, 50, 10, 5, 1};
	/*
	 * 1284 / 1000 =
	 * 1*1000 + 284 -> M = 1
	 * 284 / 500 =
	 * 0*500 + 283 -> D = 0
	 * 284 / 100 =
	 * 2*100 + 83 -> C = 2
	 * 84 / 50 =
	 * 1*50 + 34 -> L = 1
	 * 34 / 10 = 
	 * 3*10 + 4 -> X = 3 
	 * 4 / 5 = 
	 * 0*4 + 4 -> V = 0
	 * 4 / 1 =
	 * 4*1 + 0 -> 4 > 3! ->  4 = 1*5 -1 -> IV
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String roman = generateRoman(number);
		System.out.println(roman);

	}

	private static String generateRoman(int number2) {
		StringBuilder rom = new StringBuilder();
		for (int i = 0; i < romans.length; i++) {
			int n = number2 / romans[i];
			rest = number2%romans[i];
			if(n < 4) {
				for(int j = 0; j < n; j++) {
					rom.append(RomanNunbers.values()[i]);
				}
			}else {
				rom.append(RomanNunbers.values()[i].toString() + RomanNunbers.values()[i-1]);
			}
			number2 = rest;
		}
		return rom.toString();
	}
	
	enum RomanNunbers {
		M,
		D,
		C,
		L,
		X,
		V,
		I
	}

}
