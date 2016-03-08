package com.nubia.designmode.dependencyinversion;
public class Book implements IReader {
    @Override
    public String content() {
        return " read book";
    }
}
