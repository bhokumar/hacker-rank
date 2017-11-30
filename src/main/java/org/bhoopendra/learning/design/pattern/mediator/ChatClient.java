package org.bhoopendra.learning.design.pattern.mediator;

public class ChatClient {
    public static void main(String[] args){
        ChatMediator chatMediator = new ChatMediatorImpl();
        User user1 = new UserImpl(chatMediator,"Pankaj");
        User user2 = new UserImpl(chatMediator,"Lisa");
        User user3 = new UserImpl(chatMediator,"Saurabh");
        User user4 = new UserImpl(chatMediator,"David");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.send("Hi All");
    }
}
