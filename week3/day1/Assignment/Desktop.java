package week3.day1.Assignment;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("17cm is the size of Desktop");
	}
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();
	}
}
