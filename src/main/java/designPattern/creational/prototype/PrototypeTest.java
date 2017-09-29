package designPattern.creational.prototype;

import org.junit.Test;

public class PrototypeTest {

	@Test
    public void test() throws Exception{
        Prototype prototype = new Prototype();
        prototype.setStr("一个串");
        prototype.setObj(new SerializableObject());
        System.out.println("prototype="+prototype);
        System.out.println("prototype.str="+prototype.getStr());
        System.out.println("prototype.obj="+prototype.getObj());

        System.out.println("浅复制");
        Prototype prototype2 = prototype.clone();
        System.out.println("prototype2="+prototype2);
        System.out.println("prototype2.str="+prototype2.getStr());
        System.out.println("prototype2.obj="+prototype2.getObj());

        System.out.println("深复制");
        Prototype prototype3 = prototype.deepClone();
        System.out.println("prototype3="+prototype3);
        System.out.println("prototype3.str="+prototype3.getStr());
        System.out.println("prototype3.obj="+prototype3.getObj());
    }
}
