package org.ysn.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagAnnotation {

	@Test
	@Tag("prod")
	void test1() {
		System.out.println("prod test1...");
	}

	@Test
	@Tag("local")
	void test2() {
		System.out.println("local test1...");
	}

	@Test
	@Tag("prod")
	@Tag("local")
	void test3() {
		System.out.println("local-prod test1...");
	}

}
