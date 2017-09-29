package designPattern.creational.abstractFactory;

import designPattern.creational.Sender;

/**
 * 增加新功能时，创建一个新的工厂类，对扩展开放。
 */
public interface Provider {

	public Sender produce();
}
