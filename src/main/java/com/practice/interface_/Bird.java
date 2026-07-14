package com.practice.interface_;

@FunctionalInterface
public interface Bird<T, R> {
    T canFlay(R val);

}
