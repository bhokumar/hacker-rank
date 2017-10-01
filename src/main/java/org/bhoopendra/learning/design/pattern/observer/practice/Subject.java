package org.bhoopendra.learning.design.pattern.observer.practice;

import java.util.List;

public interface Subject {
    void register(Observer observer);
    void unRegister(Observer observer);
    void notifyUpdate(List<Company> companies);
}
