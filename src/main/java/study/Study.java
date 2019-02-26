package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Study {

    private static final List<Integer> NUMBERS = Arrays.asList(new Integer[]{1, 12, 3, 3, 4, 6, 2});

    /**
     * main関数
     */
    public static void main(String[] args) {

        System.out.println("Java8の結果");
        onlyEvenAndSortByJava8().forEach(System.out::println);

        System.out.println("Java7の結果");
        onlyEvenAndSortByJava7().forEach(System.out::println);
    }

    /**
     * 演習用のメソッド(java8)
     */
    public static List<Integer> onlyEvenAndSortByJava8() {

        //与えた整数から、偶数だけを抜き出し、昇順に並び替え、標準出力
        return NUMBERS.stream()
                    .filter(each -> each % 2 == 0)
                    .sorted().collect(Collectors.toList());
    }


    /**
     * 演習用のメソッド(java7)
     */
    public static List<Integer> onlyEvenAndSortByJava7() {

        List<Integer> even = new ArrayList<Integer>();
        for (Integer num : NUMBERS) {
            if (num % 2 == 0) {
                even.add(num);
            }
        }
        Collections.sort(even);

        return even;
    }
}
