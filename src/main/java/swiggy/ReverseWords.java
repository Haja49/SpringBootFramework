package swiggy;

import org.junit.Test;

public class ReverseWords {

	@Test
	public void test1() {
		String str = "today is a beautiful day";
		String reverseWords = reverseWordsUsingSwap(str);
		System.out.println(reverseWords);
	}


	public String reverseWords(String str){
		StringBuilder strBuilder = new StringBuilder();
		String[] split = str.split(" ");
		for (int i = split.length-1; i >= 0 ; i--)
			strBuilder.append(split[i]).append(" ");
		return strBuilder.toString().trim();
	}

	public String reverseWordsUsingTwoPointer(String str){
		String[] split = str.split(" ");
		int left = 0 , right = split.length-1;
		String temp = "";
		while(left < right) {
			temp = split[left];
			split[left++] = split[right];
			split[right--] = temp;
		}

		return String.join(" ", split);
	}

	
	
	public String reverseWordsUsingSwap(String str){
		int start = 0;
		char[] s = str.toCharArray();
		for (int end = 0; end < s.length; end++){
			
			if (s[end] == ' '){
				reverse(s, start, end-1);
				start = end + 1;
			}
		}

		reverse(s, start, s.length - 1);
		reverse(s, 0, s.length - 1);
		return new String(s);
	}
	
	public void reverse(char str[], int start, int end){
		char temp;
		while (start < end){
			temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
	}


}
