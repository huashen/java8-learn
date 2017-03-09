package com.lhs.learn.numberstream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by longhuasshen on 17/3/7.
 */
public class Range {

    public static void main(String[] args) {
        //求1-100的偶数的个数
        IntStream intStream = IntStream.rangeClosed(1, 100);
        long count = intStream.filter(n -> n % 2 == 0).count();
//System.out.println(count);

        //无限流
        Stream<Integer> limit = Stream.iterate(0, n -> n + 2).limit(10);
//limit.forEach(n -> System.out.println(n));

        //使用Lamda表达式创建一个有20个元素的斐波那契数
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10).map(t -> t[0]).forEach(n -> System.out.print(n));
    }
}
