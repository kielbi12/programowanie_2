package day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeksykoSort {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "ala",
                "1",
                "2",
                "3",
                "12",
                "22",
                "1000",
                "1001",
                "kot",
                "10",
                "11111"
        );

        Collections.sort(list);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
