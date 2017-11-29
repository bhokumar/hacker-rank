package org.bhoopendra.learning.design.pattern.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter{
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = getVolt();
        return convertToVolt(volt,10);
    }

    @Override
    public Volt get3Volt() {
        return null;
    }

    public Volt convertToVolt(final Volt volt, final int i){
        return new Volt(volt.getVolt()/i);
    }
}
