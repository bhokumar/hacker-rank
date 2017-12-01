package org.bhoopendra.learning.design.pattern.iterator;

public interface ChannelCollection {
    void addChannel(Channel channel);
    void removeChannel(Channel channel);
    ChannelIterator iterator(ChannelTypeEnum channelTypeEnum);
}
