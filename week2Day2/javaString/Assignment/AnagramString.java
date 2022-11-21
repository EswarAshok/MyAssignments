package week2Day2.javaString.Assignment;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Stops";
	    String s2 = "posts";
	   
	    s1 = s1.toLowerCase();
	    s2 = s2.toLowerCase();

	    if(s1.length() == s2.length()) {

	      char[] charArray1 = s1.toCharArray();
	      char[] charArray2 = s2.toCharArray();
	      Arrays.sort(charArray1);
	      Arrays.sort(charArray2);
	      boolean res = Arrays.equals(charArray1, charArray2);

	      if(res) {
	        System.out.println(s1 + " and " + s2 + " are anagram.");
	      }
	      else {
	        System.out.println(s1 + " and " + s2 + " are not anagram.");
	      }
	    }
	    else {
	      System.out.println(s1 + " and " + s2 + " are not anagram1.");
	    }

	}

}
