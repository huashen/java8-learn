package com.lhs.learn.group;

import com.lhs.learn.strean.Dish;
import com.lhs.learn.strean.Type;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by longhuashen on 17/4/16.
 */
public class GroupFour {

    private static final List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Type.MEAT),
            new Dish("beef", false, 700, Type.MEAT),
            new Dish("chicken", false, 400, Type.MEAT),
            new Dish("french fries", true, 530, Type.OTHER),
            new Dish("rice", true, 350, Type.OTHER),
            new Dish("season fruit", true, 120, Type.OTHER),
            new Dish("pizza", true, 550, Type.OTHER),
            new Dish("prawns", false, 300, Type.FISH),
            new Dish("salmon", false, 450, Type.FISH)
    );

    public static void main(String[] args) {
        //按照类型分组并统计个数
        Map<Type, Long> collect = menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
System.out.println(collect);

        //按照类型分组并找出每组中热量最高的菜肴
        Map<Type, Optional<Dish>> collect1 = menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.maxBy(Comparator.comparingInt(Dish::getCalories))));
System.out.println(collect1);
    }
}
