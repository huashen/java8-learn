package com.lhs.learn.strean;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by longhuasshen on 17/1/30.
 *
 * 查找和匹配
 */
public class AppFindAndMatch {


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
        Optional<Dish> dish = menu.stream()
                                  .filter(Dish::isVegetarian)
                                  .findAny();
        if (dish.isPresent()){
System.out.println(dish.get().toString());
        }
    }
}
