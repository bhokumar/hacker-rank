package org.bhoopendra.learning.design.pattern.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = socket.getVolt();
        return convertToVolt(volt,10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = socket.getVolt();
        return convertToVolt(volt,40);
    }

    private Volt convertToVolt(final Volt volt, final int i){
        return new Volt(volt.getVolt()/i);
    }
}
