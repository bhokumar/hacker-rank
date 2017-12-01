package org.bhoopendra.learning.design.pattern.interpreter;

public class IntToHexExpression implements Expression {
    private int i;

    public IntToHexExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getHexaDecimalFormat(i);
    }
}
