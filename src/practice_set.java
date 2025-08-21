package PACKAGE_NAME;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class practice_set {
    public static void main(String[] args) {

        //to find second largest value from array
        List<Integer> l1 = Arrays.asList(23, 90, 45, 45, 78, 12);
        Integer num = l1.stream()
                .distinct()
                .sorted((a,b)->b-a)
                .skip(1)
                .findFirst()
                .orElse(-1);
        
        System.out.println(num);

        // String

    }
}