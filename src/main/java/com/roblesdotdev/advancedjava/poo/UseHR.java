package com.roblesdotdev.advancedjava.poo;

public class UseHR {
    public static void main(String[] args) {

        HR hr = new HR();

        hr.hire(new Salaried("John"));
        hr.hire(new Salaried("Mary"));
        hr.hire(new Hourly("Diana"));
        hr.printAll();
        hr.payAll();
    }
}
