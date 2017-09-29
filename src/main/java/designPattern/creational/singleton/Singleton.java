package designPattern.creational.singleton;

/**
 * 在一个JVM中，该对象只有一个实例。懒汉模式
 */
public class Singleton {
	private static Singleton instance;
	/* 构造方法私有化，不被外面调用 */
	private Singleton(){}
	public static synchronized Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}

/**
 * 饿汉模式
 */
class Singleton2{
	private static Singleton2 instance = new Singleton2();
    private Singleton2(){}
    public static Singleton2 getInstance(){
        return instance;
    }
}
