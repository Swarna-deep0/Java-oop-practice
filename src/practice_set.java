package PACKAGE_NAME;

import java.util.Arrays;
import java.util.List;

public class practice_set {
    public static void main(String[] args) {
        //to find second largest value from array
        List<Integer> l1 = Arrays.asList(23, 90, 45, 34, 78, 12);
        int secondlargest = l1.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println();
    }
}