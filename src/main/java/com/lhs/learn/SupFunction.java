package com.lhs.learn;

/**
 * Created by longhuasshen on 17/1/29.
 */
@FunctionalInterface
public interface SupFunction<T, U, V, R> {

    R apply(T t, U u, V v);

}
