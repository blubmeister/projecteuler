package problems;

import util.Timer;

public class Problem4 {

	public static void main(String[] args) {
		final int N = 999;

		Timer.start();
		int largestPalindrome = 0;
		for (int i = N; i > N / 10; i--) {
			if (i * N < largestPalindrome) {
				break;
			}
			for (int j = i; j > N / 10; j--) {
				int value = i * j;
				if (value < largestPalindrome) {
					break;
				}
				if (isPalindrome(value)) {
					largestPalindrome = value;
				}
			}
		}
		Timer.time();
		System.out.println(largestPalindrome);
	}

	static int reverse(int num) {
		int result = 0;
		while (num > 0) {
			result *= 10;
			result += num % 10;
			num /= 10;
		}
		return result;
	}

	static boolean isPalindrome(int num) {

		// char[] digits = Integer.toString(num).toCharArray();
		// for (int i = 0; i < digits.length; i++) {
		// if (digits[i] != digits[digits.length - i - 1]) {
		// return false;
		// }
		// }
		return (num) == reverse(num);
	}
	
	static int numDigits(int x)
	{
	    if (x >= 10000) {
	        if (x >= 10000000) {
	            if (x >= 100000000) {
	                if (x >= 1000000000)
	                    return 10;
	                return 9;
	            }
	            return 8;
	        }
	        if (x >= 100000) {
	            if (x >= 1000000)
	                return 7;
	            return 6;
	        }
	        return 5;
	    }
	    if (x >= 100) {
	        if (x >= 1000)
	            return 4;
	        return 3;
	    }
	    if (x >= 10)
	        return 2;
	    return 1;
	}
}
