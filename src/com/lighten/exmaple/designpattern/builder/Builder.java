package com.lighten.exmaple.designpattern.builder;

import com.lighten.exmaple.designpattern.abstractfactory.MailSender;
import com.lighten.exmaple.designpattern.abstractfactory.Sender;
import com.lighten.exmaple.designpattern.abstractfactory.SmsSender;

import java.util.ArrayList;
import java.util.List;

public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void producerMailSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}
