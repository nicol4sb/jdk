package com.test.jdk;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Lambdas {

	IAddable<String> stringAdder = (String s1, String s2) -> s1+s2;

	@Test
	public void testAddable() {
		assertEquals(stringAdder.add("A", "B"),"AB");
	}
	
}
