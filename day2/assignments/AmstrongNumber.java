package day2.assignments;

public class AmstrongNumber {

	public static void main(String[] args) {
		int c,r,o=156, t=0;
		c=o;
		
		System.out.println(c);
while(o>0) {
	r=o%10;
	t=(t)+(r*r*r);
o=o/10;	


}
if(c==t) {
	System.out.println("Amstrong Number");
}
else {
	System.out.println("Not an Amstrong Number");
}
	}

}
