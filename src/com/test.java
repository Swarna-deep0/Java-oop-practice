package com;

public class test implements Runnable{
    com.bank sbi = new com.bank() ;
    @Override
    public void run() {
        sbi.deposit(500);
    }
}
