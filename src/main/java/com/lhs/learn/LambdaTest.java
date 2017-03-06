package com.lhs.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * LambdaTest
 *
 * @author longhuashen
 * @since 17/1/14
 */
public class LambdaTest {

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(new Apple("red", 150), new Apple("green", 130), new Apple("green", 100));

        List<Apple> redApples = apples.stream().filter((Apple a) -> "red".equals(a.getColor())).collect(Collectors.toList());
        System.out.println(redApples);
        System.out.println(filterApples(apples, (Apple a) -> "red".equals(a.getColor())));
    }

    public static <T> T filterApples(List<T> inventory, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : inventory) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return (T) result;
    }

    public static <T> void display(T t) {
        System.out.println(t.getClass());
    }
}
