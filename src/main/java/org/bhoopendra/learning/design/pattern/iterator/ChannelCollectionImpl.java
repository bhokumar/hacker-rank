package org.bhoopendra.learning.design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection{
    private List<Channel> channelList = new ArrayList<>();

    @Override
    public void addChannel(Channel channel) {
        channelList.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        channelList.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum channelTypeEnum) {
        return new ChannelIteratorImpl(channelTypeEnum,channelList);
    }

    private class ChannelIteratorImpl implements ChannelIterator{
        private ChannelTypeEnum channelType;
        private List<Channel> channelList;
        private int position = 0;

        public ChannelIteratorImpl(ChannelTypeEnum channelType, List<Channel> channelList) {
            this.channelType = channelType;
            this.channelList = channelList;
        }

        @Override
        public boolean hasNext() {
            while (position<channelList.size()){
                Channel channel = channelList.get(position);
                if (channel.getChannelTypeEnum().equals(channelType) || channelType.equals(ChannelTypeEnum.ALL)){
                    return true;
                }else {
                    position++;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            return channelList.get(position++);
        }
    }
}
