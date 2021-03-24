package com.test.jdk;

@FunctionalInterface
public interface IAddable<T> {
	public T add(T t1, T t2);
}
