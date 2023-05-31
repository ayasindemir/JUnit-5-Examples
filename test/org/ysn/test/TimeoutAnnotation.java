package org.ysn.test;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutAnnotation {

	@Timeout(value = 5)
	@Test
	void test1() {
		System.out.println("if it exceeds five seconds, dont run");
	}

	@Timeout(value = 2)
	@Test
	void test2() throws InterruptedException {
		TimeUnit.SECONDS.sleep(3);
		System.out.println("if it exceeds two seconds, dont run");
	}

	@Timeout(value = 2, unit = TimeUnit.MILLISECONDS)
	@Test
	void test3() throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(3);
		System.out.println("if it exceeds two milliseconds, dont run");
	}

	@Timeout(value = 4, unit = TimeUnit.MILLISECONDS)
	@Test
	void test4() throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(3);
		System.out.println("if it exceeds four milliseconds, dont run");
	}

	@Nested
	@Timeout(value = 5, unit = TimeUnit.MILLISECONDS)
	class NestedClassTimeot {

		@Test
		void test5() throws InterruptedException {
			TimeUnit.MILLISECONDS.sleep(6);
			System.out.println("if it exceeds five milliseconds, dont run");
		}

		@Test
		void test6() throws InterruptedException {
			TimeUnit.MILLISECONDS.sleep(4);
			System.out.println("if it exceeds five milliseconds, dont run");
		}
	}

}
