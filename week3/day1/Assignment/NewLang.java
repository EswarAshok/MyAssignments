package week3.day1.Assignment;

public class NewLang extends MultipleLanguage	implements Language, TestTool {

	

	
	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}
	public static void main(String[] args) {
		NewLang L= new NewLang();
		L.Java();
		L.Selenium();
		L.python();
		L.ruby();
	}

}
