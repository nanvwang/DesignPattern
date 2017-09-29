package designPattern.creational.factory;

import designPattern.creational.MailSender;
import designPattern.creational.Sender;
import designPattern.creational.SmsSender;

/**
 * 静态工厂模式。
 */
public class SendFactory3 {

	public static Sender produceMail(){
		return new MailSender();
	}

	public static Sender produceSms(){
		return new SmsSender();
	}
}
