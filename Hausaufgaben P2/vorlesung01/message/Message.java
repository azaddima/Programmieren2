package message;

public class Message {

	private String sender;
	private String addressee;
	private String message;
	
	public Message(String sender, String addressee, String message) {
		this.addressee = addressee;
		this.message = message;
		this.sender = sender;
	}
	
	public String getAddressee() {
		return addressee;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getSender() {
		return sender;
	}
	
	@Override
	public String toString() {
		return "Message from " + sender + " to " +  addressee + ":\n" + message + "\n";
	}
}
