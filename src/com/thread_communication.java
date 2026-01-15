package com;
class shop {
    public boolean foodready = false;

    public synchronized void consume() throws InterruptedException {
        if (!foodready){
            System.out.println("customer is waiting for food ");
            wait();
        }
        System.out.println("customer is eating food ");
    }

    public synchronized void cook() throws InterruptedException {
        System.out.println("food is being cooked...");
        foodready = true;
        Thread.sleep(1000);
        System.out.println("Food is ready ");
        notify();
    }
}

class producer implements Runnable{
    shop sh;
    public producer(shop sh){
        this.sh = sh;
    }
    @Override
    public void run() {
        try {
            sh.cook();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class consumer implements Runnable{
    shop sh;
    public consumer(shop sh){
        this.sh = sh;
    }
    @Override
    public void run() {
        try {
            sh.consume();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class thread_communication {
    public static void main(String[] args) throws InterruptedException {
        shop hotel = new shop();
        producer p = new producer(hotel);
        consumer c = new consumer(hotel);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t2.start();
        Thread.sleep(100);
        t1.start();
    }
}
