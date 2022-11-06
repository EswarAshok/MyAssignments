package week1.day1;

public class AssignmentMobile {
String mobileBrandName = "Motorola";
char  mobileLogo = 'M';
short noOfMobilePiece = 10;
int modelNumber = 878782;
long mobileImeiNumber = 89898999999L;
float mobilePrice = 29999.00f;
boolean isDamaged = true;

public static void main(String[] args) {
	AssignmentMobile mobile = new AssignmentMobile();
	System.out.println(mobile.mobileBrandName);
	System.out.println(mobile.mobileLogo);
	System.out.println(mobile.noOfMobilePiece);
	System.out.println(mobile.modelNumber);
	System.out.println(mobile.mobileImeiNumber);
	System.out.println(mobile.mobilePrice);
	System.out.println(mobile.isDamaged);
}

}
