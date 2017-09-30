package designPattern.structural.flyweight;

import org.junit.Test;

public class TankPoolTest{

    @Test
    public void test(){
        TankPool pool = new TankPool();
        System.out.println("初始库存："+pool.getCapacity());
        Tank tank = pool.produce();
        System.out.println("当前库存："+pool.getCapacity());
        pool.destroy(tank);
        System.out.println("当前库存："+pool.getCapacity());
    }
}
