package com.svenjava.interview.no1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	static int[] res;

	public static void main(String[] args) {
		
		int[] arr = {2,7,11,15};
		
		int value = 9;
		
		res  = new int[2];
		
		res = findSumFromArray(arr, value);
		System.out.println(res[0]+ " "+ res[1]);

	}

	private static int[] findSumFromArray(int[] arr, int value) {
		
		Arrays.sort(arr);
		int maxIndex = findMaximumPossibleIndex(arr, value);
		System.out.println(maxIndex);
		for(int i = maxIndex; i> 0; i--) {
			for(int j = 0; j< maxIndex; j++) {
				if(arr[i] + arr[j] == value) {
					res[0] = arr[i];
					res[1] = arr[j];
					return res;
				}else if(arr[i] + arr[j] > value) {
					break;
				}
			}
		}
		return res;
		
		
		
		
		
	}
//	professional solution; returns the indicies;
	public static int[] getTwoSumProf(int[] numbers, int target) {
		int[] res = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < numbers.length; i++) {
			int delta = target - numbers[i];
			if(map.containsKey(delta)) {
				return new int[] {i, map.get(delta)};
			}
			map.put(numbers[i], i);
		}
		return res;
	}

	private static int findMaximumPossibleIndex(int[] arr, int value) {
		int res = 0;
		for (int i = arr.length-1; i > 0; i--) {
			if(arr[i] <= value) {
				res = i;
				return res;
			}
		}
		return 0;
	}

}
