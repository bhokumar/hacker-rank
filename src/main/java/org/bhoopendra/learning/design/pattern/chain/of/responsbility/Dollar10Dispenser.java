package org.bhoopendra.learning.design.pattern.chain.of.responsbility;

public class Dollar10Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount()>10){
            int notes = currency.getAmount()/10;
            int remainder = currency.getAmount()%10;
            System.out.println("Dispensing "+notes+" 10$ notes");
            if (remainder!=0){
                dispenseChain.dispense(new Currency(remainder));
            }
        }else{
            dispenseChain.dispense(currency);
        }
    }
}
