package org.ysn.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestAnnotation {

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 4, 5, 6, 7, 8 })
	void test1(int param) {
		System.out.println(param);
	}

	@ParameterizedTest
	@NullSource
	void test2(String param) {
		System.out.println(param);
	}

	@ParameterizedTest
	@CsvSource({ "1, A", "2, B", "3, C" })
	void test3(String p1, String p2) {
		System.out.println(p1 + " -> " + p2);
	}

}
