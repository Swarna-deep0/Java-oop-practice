package com;

public class test implements Runnable{
    com.bank sbi = new com.bank() ;
    @Override
    public void run() {
        try {
            sbi.deposit(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
