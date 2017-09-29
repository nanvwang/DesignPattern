package designPattern.creational.abstractFactory;

import designPattern.creational.Sender;
import designPattern.creational.SmsSender;

public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
