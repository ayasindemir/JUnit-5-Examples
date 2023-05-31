package org.ysn.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {

	@Test
	@EnabledOnOs(value = OS.WINDOWS)
	void enableOnWindos() {
		System.out.println("on windows...");
	}

	@Test
	@EnabledOnOs(value = OS.LINUX)
	void enableOnLinux() {
		System.out.println("on linux...");
	}

	@Test
	@DisabledOnOs(value = OS.WINDOWS)
	void disableOnWindos() {
		System.out.println("on windows not working...");
	}

	@Test
	@DisabledOnOs(value = OS.LINUX)
	void disableOnLinux() {
		System.out.println("on linux not working...");
	}

	@Test
	@EnabledOnJre(value = JRE.JAVA_8)
	void enableOnJava8() {
		System.out.println("working in Java 8");
	}

	@Test
	@DisabledOnJre(value = JRE.JAVA_8)
	void disableOnJava8() {
		System.out.println("not working in Java 8");
	}

	@Test
	@EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_12)
	void enableJRERange() {
		System.out.println("working between Java 8 - Java 12");
	}

	@Test
	@DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_12)
	void disableJRERange() {
		System.out.println("not working between Java 8 - Java 12");
	}

	@Test
	@EnabledIfSystemProperty(named = "name", matches = "value")
	void enabledIfSystemProperty() {
	}

	@Test
	@DisabledIfSystemProperty(named = "name", matches = "value")
	void disabledIfSystemProperty() {
	}

	@Test
	@EnabledIfEnvironmentVariable(named = "name", matches = "value")
	void enabledIfEnv() {
	}

	@Test
	@DisabledIfEnvironmentVariable(named = "name", matches = "value")
	void disabledIfEnv() {
	}

	@Test
	@EnabledIf("customCondition")
	void enabled() {
		System.out.println("Customcondition is true");
	}

	@Test
	@DisabledIf("customCondition")
	void disabled() {
		System.out.println("Customcondition is false");
	}

	boolean customCondition() {
		return false;
	}

}
