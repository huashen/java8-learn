package com.lhs.learn;

/**
 * Formula
 *
 * @author longhuashen
 * @since 16/10/12
 */
public interface Formula {

    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
