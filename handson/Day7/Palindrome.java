package Day7;

public class Palindrome {
 
		
		
		
		
		public boolean checkPalindrome(String str) { 
		
		int left = 0; int right = str.length() - 1; 
		while (left < right) { 
			if (str.charAt(left) != str.charAt(right)) { return false; 
			} left++; right--; } 
		return true; 
			} 
		
	

}


