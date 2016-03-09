package com.designmode.staticproxy;

import com.log.LogHandler;

/**
 * 2016年3月1日
 * 
 * @author <a href = "wang.gaoliang@zte.com.cn">王高亮</a> 追求者类：通过代理给追求的对象送花和布偶
 */
public class Pursuit implements GiveGift {
    SchoolGirl girl;
    public Pursuit(SchoolGirl girl) {
        this.girl = girl;
    }
    @Override
    public void sendFlower() {
        LogHandler.createUnSynInstance(Pursuit.class).info("Pursuit送给" + girl.getName() + "的花");
        //System.out.println("Pursuit送给" + girl.getName() + "的花");
    }
    @Override
    public void giveDolls() {
        LogHandler.createUnSynInstance(Pursuit.class).info("Pursuit送给" + girl.getName() + "的布偶");
       // System.out.println("Pursuit送给" + girl.getName() + "的布偶");
    }
}
