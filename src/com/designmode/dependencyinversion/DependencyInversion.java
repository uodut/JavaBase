package com.designmode.dependencyinversion;

import org.apache.log4j.Logger;

public class DependencyInversion {
    public static void main(String[] args) {
        People people = new Teacher();
        //System.out.println(people.read(new Book()));
        Logger.getLogger(DependencyInversion.class).info(people.read(new Book()));
    }
}
