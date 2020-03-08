package com.svenjava.interview.no1.palindrome;

public class PalindromeChecker {
	int startPosition = 0;;
	int resultLength = 0;
	
	public String longestPalindrome(String s) {
		int strLength = s.length();
		if(strLength < 2) {
			return s;
		}
		for(int start = 0; start < strLength-1 ; start++) {
			expandRange(s, start, start);
			expandRange(s, start, start+1);
		}
		
		return s.substring(startPosition, startPosition+resultLength);
	}
	
	private void expandRange(String s, int start, int end) {
		while(start >= 0 && end <= s.length()-1 && s.charAt(start) ==  s.charAt(end)) {
			start--;
			end++;
		}
		if(resultLength < end-start -1) {
			startPosition = start+1;
			resultLength = end - start -1;
		}
	}
	
	

}
