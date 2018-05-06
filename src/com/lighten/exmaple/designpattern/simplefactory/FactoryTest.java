package com.lighten.exmaple.designpattern.simplefactory;

public class FactoryTest {

    public static void main(String[] args) {
        SendFactory sendFactory=new SendFactory();

        Sender sender = sendFactory.producerMail();
        /**
         * 静态工厂模式
         Sender sender = SendFactory.produceMail();
         */

        sender.send();
    }


}
