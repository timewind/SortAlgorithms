package com.lighten.exmaple.designpattern.simplefactory;


public class SendFactory {

    public Sender producerMail(){
        return new MailSender();
    }

    public Sender producerSms(){
        return new SmsSender();
    }


    /**
     *  将方法设置为静态工厂方法模式
     *  public static Sender producerMail(){
     return new MailSender();
     }

     public static Sender producerSms(){
     return new SmsSender();
     }
     */
}
