package com.looper.work0331.work03;

public class ProxyWork implements Work{

    RealWork realWork = new RealWork();

    @Override
    public void doWork() {
        realWork.doWork();
    }
}
