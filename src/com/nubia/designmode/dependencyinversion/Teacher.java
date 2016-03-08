package com.nubia.designmode.dependencyinversion;

public class Teacher implements People {

    public String read(IReader reader) {
        // TODO Auto-generated method stub
        return reader.content();
    }
    
}
