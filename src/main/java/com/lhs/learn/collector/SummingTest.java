package com.lhs.learn.collector;

import com.lhs.learn.strean.Dish;
import com.lhs.learn.strean.Type;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

/**
 * Created by longhuasshen on 17/3/14.
 */
public class SummingTest {

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
        //求菜肴热量总和
        Integer collect = menu.stream().collect(summingInt(Dish::getCalories));
        System.out.println("菜肴热量总和:" + collect);
    }
}
