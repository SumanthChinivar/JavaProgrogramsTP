package OOPs;

public abstract class AbstractWhatsapp {
	abstract void send();
}

class WhatsappImplementation extends AbstractWhatsapp {
	void send() {
		System.out.println("Message sent");
	}
}