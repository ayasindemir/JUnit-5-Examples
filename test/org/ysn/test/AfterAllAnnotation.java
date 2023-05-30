package org.ysn.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class AfterAllAnnotation {

	@AfterAll
	static void runAfterAllTestMethods() {
		System.out.println("Running once after all test methods");
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
