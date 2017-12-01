package org.bhoopendra.learning.design.pattern.interpreter;

public class InterpreterClient {
    private InterpreterContext interpreterContext;

    public InterpreterClient(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }

    public String interpret(String content){
        Expression expression = null;
        if (content.contains("Hexadecimal")){
            expression = new IntToHexExpression(Integer.parseInt(content.substring(content.indexOf(" "))));
        }else if(content.contains("Binary")){
            expression = new IntToBinaryExpression(Integer.parseInt(content.substring(content.indexOf(" "))));
        }else {
            return content;
        }
        return expression.interpret(interpreterContext);
    }

    public static void main(String[] args) {
        String s1 = "28 Binary";
        String s2 = "28 Hexadecimal";

        InterpreterClient interpreterClient = new InterpreterClient(new InterpreterContext());
        System.out.println(s1+"= "+interpreterClient.interpret(s1));
        System.out.println(s2+"= "+interpreterClient.interpret(s2));
    }
}
