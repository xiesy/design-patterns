package com.example.demo.bigtalkdesignpatterns.bridgingpatterns;

public abstract class HandsetBrand {
    HandsetSoft soft;

    /**
     * 设置手机软件
     * @param soft 手机软件类
     */
    public void setHandsetSoft(HandsetSoft soft){
        this.soft = soft;
    }

    /**
     * 运行
     */
    public abstract void run();
    
}
