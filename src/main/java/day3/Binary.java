package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Binary {

    public static void main(String[] args) {

        resolveTask(3, 3, 1);
        resolveTask(3, 3, 2);
        resolveTask(3, 35, 99);

    }


    public static List<String> listOfBinaryNumbers(int start, int end) {


        List<Long> tmpList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            tmpList.add((long) i);
        }
        List<String> collect = tmpList.stream()
                .map(Long::toBinaryString)
                .filter(s -> !s.contains("11"))
                .collect(Collectors.toList());

        return collect;
    }

    public static void resolveTask(int d, int n, int k) {

        List<String> list = listOfBinaryNumbers(0, d);
        List<String> strings = concatZeros(list, n);

        if (strings.size() >= k) {
            System.out.println(strings.get(k));
        } else {
            System.out.println("-1");
        }


    }

    public static List<String> concatZeros(List<String> list, int n) {
        list = list.stream()
                .filter(v -> v.length() <= n)
                .map(v -> {
                    int numberOfZeros = n - v.length();
                    if (numberOfZeros > 0) {
                        for (int i = 0; i < numberOfZeros; i++) {
                            v = "0" + v;
                        }
                    }
                    return v;
                })
                .collect(Collectors.toList());
        return list;
    }


}


