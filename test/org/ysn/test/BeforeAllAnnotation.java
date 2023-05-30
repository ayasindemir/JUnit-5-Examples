package org.ysn.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeAllAnnotation {

	@BeforeAll
	static void runBeforeAllTestMethods() {
		System.out.println("Running once before all test methods");
	}

	@Test
	void test1() {
		System.out.println("test1...");
	}

	@Test
	void test2() {
		System.out.println("test2...");
	}

	@Test
	void test3() {
		System.out.println("test3...");
	}

}
