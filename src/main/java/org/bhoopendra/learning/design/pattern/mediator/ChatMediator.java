package org.bhoopendra.learning.design.pattern.mediator;

public interface ChatMediator {
    void sendMessage(String msg,User user);
    void addUser(User user);
}

