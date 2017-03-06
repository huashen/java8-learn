package com.lhs.learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/**
 * Main
 *
 * @author longhuashen
 * @since 16/9/25
 */
public class Main {

    public static void main(String[] args) {
        Map map = new HashMap<>();

        int portNum = 1337;

        Runnable r = () -> System.out.println(portNum);

        SupFunction<Integer, Integer, Integer, Color> s = Color::new;
        Color color = s.apply(10, 12, 14);
System.out.println(color);
    }

    private static final Map dataCache = new HashMap<>();

    public void deleteFromCache(Set<String> key) {
        dataCache.entrySet().removeIf(o -> dataCache.containsKey(key));
    }


}
