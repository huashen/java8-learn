package com.lhs.learn.group;

import com.lhs.learn.strean.Dish;
import com.lhs.learn.strean.Type;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by longhuashen on 17/4/16.
 */
public class GroupOne {

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
        Map<Type, List<Dish>> collect = menu.stream().collect(Collectors.groupingBy(Dish::getType));
System.out.println(collect);
    }
}
