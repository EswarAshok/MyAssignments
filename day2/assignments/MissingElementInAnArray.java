package day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,7,6,8};
		Arrays.sort(a);//1,2,3,4,6,7,8
		for(int i=1; i<=a.length;i++) {
			if(a[i-1]!=i) {
				System.out.println("The Missing element is: "+i);
				break;
			}
		}
	}

}
