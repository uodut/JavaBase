package com.nubia.dao;
public class PersonReflectSon extends PersonReflect {
    private String address;
    public int members;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getMembers() {
        return members;
    }
    public void setMembers(int members) {
        this.members = members;
    }
    public PersonReflectSon(int age, int score, String name) {
        super(age, score, name);
        // TODO Auto-generated constructor stub
    }
    public PersonReflectSon() {
        super();
    }
}
