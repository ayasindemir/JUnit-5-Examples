package org.ysn.test;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.api.TestMethodOrder;

@TestClassOrder(ClassOrderer.OrderAnnotation.class)
public class OrderAnnotationn {

	@Order(value = 2)
	@Nested
	@TestMethodOrder(OrderAnnotation.class)
	class OrderByAnnotation {

		@Order(value = 3)
		@Test
		void test3() {
			System.out.println("Order 3...");
		}

		@Order(value = 1)
		@Test
		void test1() {
			System.out.println("Order 1...");
		}

		@Order(value = 2)
		@Test
		void test2() {
			System.out.println("Order 2...");
		}

	}

	@Order(value = 1)
	@Nested
	@TestMethodOrder(MethodOrderer.MethodName.class)
	class OrderByMethodName {

		@Test
		void test3() {
			System.out.println("Order 3...");
		}

		@Test
		void test1() {
			System.out.println("Order 1...");
		}

		@Test
		void test2() {
			System.out.println("Order 2...");
		}

	}

}
