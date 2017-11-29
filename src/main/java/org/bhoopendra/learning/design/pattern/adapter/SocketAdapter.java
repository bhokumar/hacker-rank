package org.bhoopendra.learning.design.pattern.adapter;

public interface SocketAdapter {
    Volt get120Volt();
    Volt get12Volt();
    Volt get3Volt();
}
