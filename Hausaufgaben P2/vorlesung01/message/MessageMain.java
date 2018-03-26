package message;


public class MessageMain {

	
	public static void main(String[] args) {
		Message msg1 = new Message("Stephi", "Kevin", "Hallo Kevin, bitte mach im Tutorium P1 Wiederholung");
		Message msg2 = new Message("Tom", "Anna", "Wie war das Training?");
		Message msg3 = new Message("Mira", "Anja", "Wann wollen wir uns zum Lernen treffen?");
		
		System.out.println(msg1.toString());
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
	}
}
