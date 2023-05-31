package org.ysn.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class DisplayNameGenerationAnnotation {

	@Nested
	@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
	class Nested_Display_Name_Class_1 {

		@Test
		void nested_test_1() {
			System.out.println("test1...");
		}

		@Test
		@DisplayName("My Method Name")
		void nested_test_2() {
			System.out.println("test2...");
		}

	}

	@Nested
	@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
	class Nested_Display_Name_Class_2 {

		@Test
		void nested_test_1() {
			System.out.println("test1...");
		}

		@Test
		@DisplayName("My Method Name")
		void nested_test_2() {
			System.out.println("test2...");
		}

	}

}
