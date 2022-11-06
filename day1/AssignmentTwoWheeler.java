package week1.day1;

public class AssignmentTwoWheeler {
int noOfWheels = 2;
short noOfMirrors = 2;
long chassisNumber = 28642848224442L;
boolean isPunctured = false;
String bikeName = "Yamaha";
double runningKM = 2929.92d;

public static void main(String[] args) {
	AssignmentTwoWheeler bike = new AssignmentTwoWheeler();
	System.out.println(bike.noOfWheels);
	System.out.println(bike.noOfMirrors);
	System.out.println(bike.chassisNumber);
	System.out.println(bike.isPunctured);
	System.out.println(bike.bikeName);
	System.out.println(bike.runningKM);
}
}
