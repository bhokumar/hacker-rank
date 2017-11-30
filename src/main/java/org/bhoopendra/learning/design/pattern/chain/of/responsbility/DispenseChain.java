package org.bhoopendra.learning.design.pattern.chain.of.responsbility;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
