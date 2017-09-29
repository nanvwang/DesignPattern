package designPattern.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	private String str;
    private SerializableObject obj;

    /* 浅复制 */
    public Prototype clone() throws CloneNotSupportedException{
        Prototype proto = (Prototype)super.clone();
        return proto;
    }

    /* 深复制 */
    public Prototype deepClone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */  
        ByteArrayOutputStream bout = new ByteArrayOutputStream();  
        ObjectOutputStream oout = new ObjectOutputStream(bout);  
        oout.writeObject(this);  
        /* 读出二进制流产生的新对象 */  
        ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());  
        ObjectInputStream oin = new ObjectInputStream(bin);  
        return (Prototype)oin.readObject(); 
    }
    
    public String getStr(){
        return str;
    }

    public void setStr(String str){
        this.str = str;
    }

    public SerializableObject getObj(){
        return obj;
    }

    public void setObj(SerializableObject obj){
        this.obj = obj;
    }
}