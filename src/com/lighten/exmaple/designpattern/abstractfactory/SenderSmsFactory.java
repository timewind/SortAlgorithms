package com.lighten.exmaple.designpattern.abstractfactory;

public class SenderSmsFactory implements Provider{
    @Override
    public Sender producer() {
        return new SmsSender();
    }
}
