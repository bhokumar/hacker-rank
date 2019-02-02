package org.design.patterns.command;

// Receiver
public class LightHandler {
    private boolean isOn = false;

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else{
            on();
            isOn = true;
        }
    }

    public void on() {
        System.out.println("Light is Switched on!");
    }

    public  void off() {
        System.out.println("Light id switched off!");
    }
}
