package OOPs;

public class WhatsappV1 {
	String username;

	public WhatsappV1(String username) {
		this.username = username;
	}
}

class WhatsappV2 extends WhatsappV1
{
	String phone;
	public WhatsappV2(String username,String phone) {
		super(username);
		this.phone=phone;
	}
}
