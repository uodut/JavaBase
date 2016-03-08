package com.nubia.designmode.dependencyinversion;

import com.nubia.log.LogHandler;

public class DependencyInversion {
    public static void main(String[] args) {
        People people = new Teacher();
        //System.out.println(people.read(new Book()));
        LogHandler.createUnSynInstance(DependencyInversion.class).info(people.read(new Book()));
    }
}
