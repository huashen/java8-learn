package com.lhs.learn.strean;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by longhuasshen on 17/1/29.
 */
public class App {

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
        List<String> threeHighCaloricDishNames = menu.stream()
                                                     .filter((s) -> s.getCalories() > 300)//接受Lambda,从流中排除某些元素。选择出热量超过300卡路里的菜肴
                                                     .map(Dish::getName)//接受Lambda,从流中提取某些信息。提取某道菜的菜名
                                                     .limit(3)//截断流，使其元素不超过给定数量
                                                     .collect(Collectors.toList());//将流转换为其它形式
System.out.println(threeHighCaloricDishNames);

        //筛选出两道荤菜
        List<Dish> twoMeanDish = menu.stream()
                                     .filter((s) -> s.getType() == Type.MEAT)
                                     .limit(2)
                                     .collect(Collectors.toList());
System.out.println(twoMeanDish);
    }

}
