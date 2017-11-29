package org.bhoopendra.learning.design.pattern.proxy;

public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void runCommand(final String cmd) throws Exception{
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
