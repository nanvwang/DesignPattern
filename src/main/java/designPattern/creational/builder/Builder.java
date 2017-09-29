package designPattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

import designPattern.creational.MailSender;
import designPattern.creational.Sender;
import designPattern.creational.SmsSender;

public class Builder {
	private List<Sender> senders = new ArrayList<Sender>();
    
    public List<Sender> getSenders(){
        return senders;
    }

    public void produceMailSender(int count){
        for(int i=0;i<count;i++){
            senders.add(new MailSender());
        }
    }
    
    public void produceSmsSender(int count){
        for(int i=0;i<count;i++){
            senders.add(new SmsSender());
        }
    }
}