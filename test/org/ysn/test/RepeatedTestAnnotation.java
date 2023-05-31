package org.ysn.test;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class RepeatedTestAnnotation {

	@RepeatedTest(3)
	void test1() {
		System.out.println("test1");
	}

	@RepeatedTest(3)
	void test2(TestInfo testInfo) {
		System.out.println(testInfo.getDisplayName());
	}

	@RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
	void test3() {
		System.out.println("test3");
	}

	@RepeatedTest(value = 3, name = "Custom name {currentRepetition} / {totalRepetitions}")
	void test4() {
	}

	@RepeatedTest(3)
	void test5(RepetitionInfo repetitionInfo) {
		System.out.println("Current : " + repetitionInfo.getCurrentRepetition() + " ; Total : "
				+ repetitionInfo.getTotalRepetitions());
	}

}
