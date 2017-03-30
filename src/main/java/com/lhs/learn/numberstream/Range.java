package com.lhs.learn.numberstream;

import java.util.stream.IntStream;

/**
 * Created by longhuasshen on 17/3/7.
 */
public class Range {

    public static void main(String[] args) {
        //求1-100的偶数的个数
        IntStream intStream = IntStream.rangeClosed(1, 100);
        long count = intStream.filter(n -> n % 2 == 0).count();
System.out.println(count);
    }
}
