package com.lighten.exmaple.designpattern.abstractfactory;

public class SenderMailFactory implements Provider {
    @Override
    public Sender producer() {
        return new MailSender();
    }
}
