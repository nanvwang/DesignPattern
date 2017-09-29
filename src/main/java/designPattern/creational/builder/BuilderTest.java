package designPattern.creational.builder;

import org.junit.Test;


public class BuilderTest {

	@Test
    public void test(){
        Builder builder = new Builder();
        builder.produceMailSender(5);
        System.out.println("建造的对象："+builder.getSenders().size());
        builder.produceSmsSender(7);
        System.out.println("建造的对象："+builder.getSenders().size());
    }
}
