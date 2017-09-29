package designPattern.creational.singleton;

import org.junit.Test;


public class SingletonTest {

	@Test
    public void test(){
        Singleton singleton = Singleton.getInstance();
        System.out.println("singleton="+singleton);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton2="+singleton2);
        
        Singleton2 singleton3 = Singleton2.getInstance();
        System.out.println("singleton3="+singleton3);
        Singleton2 singleton4 = Singleton2.getInstance();
        System.out.println("singleton4="+singleton4);
    }
}