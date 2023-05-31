package org.ysn.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("This is a special Class Display Name")
public class DisplayNameAnnotation {

	@Test
	@DisplayName("Custom test name containing spaces")
	void test1() {
		System.out.println("test1...");
	}

	@Test
	@DisplayName("╯°□°）╯")
	void test2() {
		System.out.println("test2...");
	}

	@Test
	@DisplayName("😱")
	void test3() {
		System.out.println("test3...");
	}

}
