package com.dao;

import org.apache.log4j.Logger;

public class PersonReflect {
    private int age;
    int score;
    public String name;
    public String company;
    protected int salary;
    private int[] arr = null;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public PersonReflect(int age, int score, String name) {
        this.age = age;
        this.score = score;
        this.name = name;
    }
    public void display(String order) {
        // System.out.println("Person_Reflect里面的display()方法" + order);
        order = "Person_Reflect里面的display()方法" + order;
        Logger.getLogger(PersonReflect.class).info(order);
    }
    // 私有方法
    private boolean isMarray() {
        return false;
    }
    public PersonReflect() {
    }
}
