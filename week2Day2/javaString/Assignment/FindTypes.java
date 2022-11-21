package week2Day2.javaString.Assignment;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char c[]=t.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(Character.isLetter(c[i]))
			{
				letter++;
			}
			else if(Character.isDigit(c[i]))
				num++;
			else if(Character.isSpaceChar(c[i]))
				space++;
			else
				specialChar++;
		}
		System.out.println("letter A-Z: " + letter);
		System.out.println("space: " + space);
		System.out.println("number 1-9: " + num);
		System.out.println("specialCharcter - $: " + specialChar);
	}

}
