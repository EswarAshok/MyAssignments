package week2Day2.javaString.Assignment;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		char c ='n';
		int count = 0;
		//convert strings to char
		char[] Array1 = str.toCharArray();
		int len = Array1.length;
		for(int i=0;i<len;i++)
		{
			if(c==Array1[i])
			{
				count++;
			}
		}
		System.out.println("Character " + c + " is displayed " + count +" times");
	}

}
