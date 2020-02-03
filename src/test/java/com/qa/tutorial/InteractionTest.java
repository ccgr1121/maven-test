package com.qa.tutorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InteractionTest {
	
	@Test
	public void greetingTest() {
		Interaction interaction = new Interaction();
		assertEquals("Hi friend!", interaction.greeting());
	}
	
	@Test
	public void insultTest() {
		Interaction interaction = new Interaction();
		assertEquals("Is trash!", interaction.insult());
	}

	@Test
	public void runnerTest() {
		Runner runner = new Runner();
	}
}
