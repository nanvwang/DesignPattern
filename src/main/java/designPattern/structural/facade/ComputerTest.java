package designPattern.structural.facade;

import org.junit.Test;

public class ComputerTest{

    @Test
    public void test(){
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
