package week1.day1;

public class MessageSample {
	public void callMsg() {
		System.out.println("Hey you got a Message");
	}
public void MsgPopup() {
	System.out.println("Missed Call");
	
}
public static void main(String[] args) {
	MessageSample msg1 = new MessageSample();
	msg1.callMsg();
	msg1.MsgPopup();
}
}
