package org.bhoopendra.learning.design.pattern.observer;

public interface Subject {
	void register(Observer observer);

	void unregister(Observer observer);

	void notifyObserver();
}
