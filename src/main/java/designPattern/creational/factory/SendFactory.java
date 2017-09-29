package designPattern.creational.factory;

import designPattern.creational.MailSender;
import designPattern.creational.Sender;
import designPattern.creational.SmsSender;

/**
 * 使一个类的实例化延迟到其子类。
 */
public class SendFactory {

	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}
		System.out.println("类型错误！");
		return null;
	}
}
