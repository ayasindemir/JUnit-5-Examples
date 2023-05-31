package org.ysn.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedAnnotation {

	@BeforeEach
	void parentBeforeEach() {
		System.out.println("runs before each nested class tests and parent class tests...");
	}

	@Test
	void parentTestMethod() {
		System.out.println("Parent NestedAnnotationClass -> test1...");
	}

	@Nested
	class FirstNestedClass {

		@Test
		void test1() {
			System.out.println("FirstNestedClass -> test1...");
		}

		@Test
		void test2() {
			System.out.println("FirstNestedClass -> test2...");
		}
	}

	class SecondClass {

		@Test
		void test1() {
			System.out.println("this will not run, @Nested annotation is not added");
		}
	}

}
