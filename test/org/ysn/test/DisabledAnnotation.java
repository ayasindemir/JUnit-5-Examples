package org.ysn.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledAnnotation {

	@Test
	void test1() {
		System.out.println("test1...");
	}

	@Test
	@Disabled
	void test2() {
		System.out.println("this test method is disabled");
	}

	@Test
	void test3() {
		System.out.println("test3...");
	}

	@Test
	@Disabled("Disabled until something will be happened")
	void test4() {
		System.out.println("this test method is disabled");
	}

}
