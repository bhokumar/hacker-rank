package org.bhoopendra.learning.design.pattern.state;

public class TVRemoteBasic {
    private String state = "";

    public void setState(String state) {
        this.state = state;
    }

    public void doAction(){
        if (state.equalsIgnoreCase("ON")){
            System.out.println("TV is turned ON!");
        }else if (state.equalsIgnoreCase("OFF")){
            System.out.println("TV is turned OFF");
        }
    }

    public static void main(String[] args) {
        TVRemoteBasic tvRemoteBasic = new TVRemoteBasic();

        tvRemoteBasic.setState("ON");
        tvRemoteBasic.doAction();

        tvRemoteBasic.setState("OFF");
        tvRemoteBasic.doAction();
    }
}
