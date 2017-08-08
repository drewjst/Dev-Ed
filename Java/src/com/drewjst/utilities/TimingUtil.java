package com.drewjst.utilities;

public class TimingUtil {

    private long start;
    private long end;

    public void startTime() {
        start = System.currentTimeMillis();
    }

    public void endTime() {
        end = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return end - start;
    }
}
