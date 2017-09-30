package designPattern.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TankPool{

    private List<Tank> pool;
    
    private int poolSize = 100;
    
    {
        this.pool = new ArrayList<Tank>(this.poolSize);
        for(int i=0;i<this.poolSize;i++){
            this.pool.add(new Tank(100, 10, 5));
        }
    }
    
    //摧毁
    public synchronized void destroy(Tank tank){
        this.pool.add(tank);
    }
    
    //生产
    public synchronized Tank produce(){
        if(this.pool.isEmpty()){
            return null;
        }
        return this.pool.remove(this.pool.size()-1);
    }
    
    public synchronized int getCapacity(){
        return this.pool.size();
    }
}
