package com.jdk.test;

@FunctionalInterface
public interface IAddable<T> {
	public T add(T t1, T t2);
}
