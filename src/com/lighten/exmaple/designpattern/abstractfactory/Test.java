package com.lighten.exmaple.designpattern.abstractfactory;

public class Test {
    public static void main(String[] args) {
        Provider provider=new SenderMailFactory();

        Sender sender = provider.producer();
        sender.send();
    }
}
