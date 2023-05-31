package org.ysn.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class DisabledAnnotationInClass {

	@Test
	void test1() {
		System.out.println("disabled...");
	}

	@Test
	void test2() {
		System.out.println("disabled...");
	}

	@Test
	void test3() {
		System.out.println("disabled...");
	}

}
