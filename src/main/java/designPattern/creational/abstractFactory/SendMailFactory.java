package designPattern.creational.abstractFactory;

import designPattern.creational.MailSender;
import designPattern.creational.Sender;

public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
