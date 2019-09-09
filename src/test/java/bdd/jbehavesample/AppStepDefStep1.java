package bdd.jbehavesample;

import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Step;

public class AppStepDefStep1 {

	@Shared
	AppStepDefinitions shared;
	int sum;
	@Step
	@When(value = "I add these numbers")
	public void method2(){
		sum = shared.a+shared.b;
	}
}
