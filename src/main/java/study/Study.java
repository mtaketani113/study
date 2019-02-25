package study;

import java.util.Arrays;
import java.util.List;

public class Study {

    /**
     * main関数
     */
    public static void main(String[] args) {

        study();
    }

    /**
     * 演習用のメソッド
     */
    public static void study() {

        List<Integer> numbers = Arrays.asList(new Integer[]{1, 12, 3, 3, 4, 6, 2});

        //与えた整数から、偶数だけを抜き出し、昇順に並び替え、標準出力
        numbers.stream()
            .filter(each -> each % 2 == 0)
            .sorted()
            .forEach(s -> System.out.println(s));
    }
}
