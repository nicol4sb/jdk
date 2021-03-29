package com.jdk.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class TestMethodRefsAndOptionals {

	@Test
	public static void testMethodReferences() {
		// Referring static method
		IAddable<String> addable = TestMethodRefsAndOptionals::addSomeStrings;
		// Calling interface method
		assertEquals(addable.add("AAA", "BBB"), "AAABB");
	}

	private static String addSomeStrings(String string1, String string2) {
		return string1 + string2;
	}

	@Test
	public void whenCreatesEmptyOptional_thenCorrect() {
		Optional<String> empty = Optional.empty();
		assertFalse(empty.isPresent());
	}

	@Test
	public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
		String name = null;
		assertThrows(NullPointerException.class, () -> Optional.of(name));
	}

}
