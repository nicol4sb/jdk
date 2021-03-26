package com.jdk.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestLambdas {

	IAddable<String> stringAdder = (String s1, String s2) -> s1+s2;

	@Test
	public void testAddable() {
		assertEquals(stringAdder.add("A", "B"),"AB");
	}
	
}
