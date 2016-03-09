package com.designmode.staticproxy;

import org.apache.log4j.Logger;

/**
 * 2016��3��1��
 * 
 * @author <a href = "wang.gaoliang@zte.com.cn">������</a> ׷�����ࣺͨ�������׷��Ķ����ͻ��Ͳ�ż
 */
public class Pursuit implements GiveGift {
    SchoolGirl girl;
    public Pursuit(SchoolGirl girl) {
        this.girl = girl;
    }
    @Override
    public void sendFlower() {
        Logger.getLogger(Pursuit.class).info("Pursuit�͸�" + girl.getName() + "�Ļ�");
        //System.out.println("Pursuit�͸�" + girl.getName() + "�Ļ�");
    }
    @Override
    public void giveDolls() {
        Logger.getLogger(Pursuit.class).info("Pursuit�͸�" + girl.getName() + "�Ĳ�ż");
       // System.out.println("Pursuit�͸�" + girl.getName() + "�Ĳ�ż");
    }
}
