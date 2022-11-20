package week3.day1.Assignment;

public class Students {
public void getStudentInfo(int id) {
System.out.println(id);
	
}
public void getStudentInfo(String name, int id) {
	System.out.println(name);
	System.out.println(id);
}
public void getStudentInfo(long phoneNumber, String emailId) {
	System.out.println(phoneNumber);
	System.out.println(emailId);
}
public static void main(String[] args) {
	Students s= new Students();
	s.getStudentInfo(1212);
	s.getStudentInfo("Eswar", 1212);
	s.getStudentInfo(8989898989L, "eswar@gmail.com");
}
}
