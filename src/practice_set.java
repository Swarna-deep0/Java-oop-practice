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

        //
        Scanner sc = new Scanner(System.in);
//        String A=sc.next();
//        StringBuffer sd = new StringBuffer(A);
////        String app = sd.append("hello").toString();
//        System.out.println(sd.append("hello"));

        //reversing a sentence not words :
        String s1 = sc.nextLine();
        StringBuffer s2 = new StringBuffer();

        String[] arr = s1.split(" ");
        for (int i = arr.length - 1; i>= 0; i--) {
            s2.append(arr[i]);
            if (i != 0) s2.append(" ");
        }
        System.out.println(s2.toString());
    }
}