import java.util.Scanner;

//Q1.Printing maths table
public class methods_practiceset {
    static void mul(){
        System.out.print("Multiplication table of : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d",a,i,a*i);
            System.out.println();
        }
    }
//    Q2. * pattern
    static void pattern(){
        System.out.print("how many pattern ! to print : ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for (int i=0;i<b;i++){ // row controller
            for(int j=0;j<i+1;j++){ //column controller ( in inner loop j is reset to 0 after completion)
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    Q3. print * in reverse order
    static void reverse_pattern(){
        System.out.print("how many pattern ! to print : ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i=c;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//      Q4. sum of n natural numbers
    static int sumrec(int i){
        if (i==1) {
            return 1;
        }
        else {
            return i + sumrec(i - 1);
        }
    }
    //Q5.Printing fibonacci sequence
    static int fib(int n){
        if (n==1 || n==2 || n==0){
            return n-1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        //problem 1
//        mul();

        //problem 2
//        pattern();

        //problem 3
//        reverse_pattern();

        //problem 4
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sumrec(sc.nextInt()));

        //Problem 5 : 0,1,1,2,3,5,8,13,21,34
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your term : ");
        int result =fib(sc.nextInt());
        System.out.println(result);
    }
}
