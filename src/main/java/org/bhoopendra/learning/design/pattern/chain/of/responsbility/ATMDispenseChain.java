package org.bhoopendra.learning.design.pattern.chain.of.responsbility;

import java.util.Scanner;

public class ATMDispenseChain {
    private DispenseChain dispenseChain;

    public ATMDispenseChain() {
        this.dispenseChain = new Dollar50Dispenser();

        DispenseChain dispenseChain2 = new Dollar20Dispenser();
        DispenseChain dispenseChain3 = new Dollar10Dispenser();

        dispenseChain.setNextChain(dispenseChain2);
        dispenseChain2.setNextChain(dispenseChain3);
    }

    public static void main(String[] args){
        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();
        while (true){
            int amount = 0;
            System.out.println("Enter the amount to Dipense !");
            Scanner scanner = new Scanner(System.in);
            amount = scanner.nextInt();
            if (amount%10!=0){
                System.out.println("Amount should be in multiple of 10");
                return;
            }
            atmDispenseChain.dispenseChain.dispense(new Currency(amount));
        }
    }

}
