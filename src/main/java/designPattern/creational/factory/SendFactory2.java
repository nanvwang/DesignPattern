package designPattern.creational.factory;

import designPattern.creational.MailSender;
import designPattern.creational.Sender;
import designPattern.creational.SmsSender;

/**
 * 多个工厂模式。
 */
public class SendFactory2 {

	public Sender produceMail(){
		return new MailSender();
	}

	public Sender produceSms(){
		return new SmsSender();
	}
}
