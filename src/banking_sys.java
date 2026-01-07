package com;
class bank{
   public static String name = "Swarnadeep rooj" ;
   private long acc_no;
   private double balance = 0;

   public void deposit(double x){
       if (x<=0){
           System.out.println("INVALID");
       }else balance += x;
   }
   public void withdraw(double y){
       if (y<=balance && y>0){
           balance -= y;
           System.out.print("current balance is : " + balance + "\n");
       }else System.out.println(" Insufficient balance !");
   }

    public double getBalance() {
        System.out.print("Amount you have : " + balance);
        return balance;
    }

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }
}
public class banking_sys {
    public static void main(String[] args) {
        System.out.println("The account holder name is : " + bank.name);
        bank axis = new bank();
        axis.setAcc_no(231477389);
        System.out.println(" Account no : " + axis.getAcc_no());
        axis.deposit(10000);
        axis.withdraw(10000);
        System.out.println(axis.getBalance()); 



    }
}
