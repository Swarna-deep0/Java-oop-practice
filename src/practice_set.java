package PACKAGE_NAME;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;

class task extends Thread{
    private StringBuffer sb;
    public task(StringBuffer sb) {
        this.sb = sb;
    }
    public void run(){
        for (int i = 0;i<1000;i++){
            sb.append("a");
        }
    }
}

public class practice_set {
    public static void main(String[] args) throws InterruptedException {

        //to find second largest value from array
        List<Integer> l1 = Arrays.asList(23, 90, 45, 45, 78, 12);
        Integer num = l1.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println(num);

        // String

        String str1 = "Hello";
        String st2 = str1.concat("lava");
        System.out.println(st2);

        //stringbuilder :

        StringBuffer sb = new StringBuffer();
        task t1 = new task(sb);
        task t2 = new task(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final length : " + sb.length());


        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        StringBuffer sd = new StringBuffer(A);
        System.out.println(sd.append("hello"));

        //reversing a sentence not words :

        String s1 = sc.nextLine();
        StringBuffer s2 = new StringBuffer();

        String[] arr = s1.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            s2.append(arr[i]);
            if (i != 0) s2.append(" ");
        }
        System.out.println(s2.toString());

        //reversing with stream api

        String result = Arrays.stream(s1.split(" "))
                .reduce("", (a, b) -> b + " " + a)
                .trim(); // remove extra space at the end
        System.out.println(result);

  //getting orginal word :

        System.out.print("Enter your object : ");
        String m1 = sc.nextLine();
        StringBuffer n1 = new StringBuffer();
        char[]ch = m1.toCharArray();

        for (int i =0;i<=ch.length-1;i++){
            if (Character.isLetter(ch[i]) || ch[i]== ' '){
                n1.append(ch[i]);
            }
        }
        System.out.println(n1.toString());

        // Stream iteration
        Long in = Stream.iterate(0, n -> n+1)
              .limit(101)
          .skip(1)
                .map(x->x/10).distinct()
              .count();
        System.out.println(in);

        //no duplicates words in line :
        System.out.print("enter your line : ");
        String ori = sc.nextLine();
        String Result = Arrays.stream(ori.split(" "))
                .distinct()
                .collect(Collectors.joining(" "));
        System.out.println(Result);

        // swaing two varriable without third variable :

        int a=10;
        int b=20;
        a= a + b; //30
        b = a-b; //10
        a = a-b;  //20

        System.out.println("a = " + a+ " b =" + b);

        //No. having two interative zero are cancel

        Scanner d = new Scanner(System.in);
        try {
            System.out.println("Enter you no. ");
            String s = d.nextLine();
            char[] arr1 = s.toCharArray();
            StringBuffer bu = new StringBuffer();
            for (int i = 0; i < arr1.length; i++) {
                if (i == arr1.length - 1 || !(arr1[i] == '0' && arr1[i + 1] == '0')) {
                    bu.append(arr1[i]);
                }
            }
            System.out.println(bu);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        // taking 10 input in an array and find the highest integer with its index

        Scanner xx = new Scanner(System.in);
        int[] all = new int[10];
            System.out.println("enter your digit's : ");
            for(int i = 0;i<10;i++){
                all[i]=xx.nextInt();
            }
        int max= all[0];
        int max_index=0;
            for (int i=1;i<all.length;i++){
                if(all[i]> max){
                    max =  all[i];
                    max_index = i;
                }
            }
        System.out.println("max value : " + max);
        System.out.println("max_index : " + max_index);
    }
}

