package org.ysn.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeEachAnnotation {

	@BeforeEach
	void runBeforeAllTestMethods() {
		System.out.println("Running before each test method");
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
