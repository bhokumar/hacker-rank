package org.bhoopendra.learning.design.pattern.state;

public class TVRemote {
    public static void main(String[] args) {
        TVContext tvContext = new TVContext();
        State tvStartState = new TvStartState();
        State tvStopState = new TVStopState();

        tvContext.setTvState(tvStartState);
        tvContext.doAction();

        tvContext.setTvState(tvStopState);
        tvContext.doAction();
    }
}
