package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks1 {
	@Before
	public void m1() {
		System.out.println("Before");
		
	}
	@BeforeStep
	public void bs() {
		System.out.println("Before Step");

	}
	@After
	public void af() {
		System.out.println("After");

	}
	@AfterStep
	public void as() {
		System.out.println("After Step");

	}
}
