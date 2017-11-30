package org.bhoopendra.learning.design.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String msg, User user) {
        users.stream().filter(u->u!=user).forEach(u->u.recieve(msg));
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
