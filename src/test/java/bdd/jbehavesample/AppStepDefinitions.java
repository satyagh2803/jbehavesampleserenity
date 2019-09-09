package bdd.jbehavesample;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import net.thucydides.core.annotations.Steps;

/**
 * Unit test for simple App.
 */
public class AppStepDefinitions 
{
	@Steps(shared=true)
	AppStepDefStep1 appStepDefStep1;
	int a; int b;
	@Given(value = "I have two numbers <value1> and <value2>")
	public void method1(@Named("value1") int value1,@Named("value2") int value2){
		a = value1;
		b = value2;
	}
	
	@Then(value = "The total should be <sum>")
	public void method3(@Named("sum") int sumFromStory){
		if(appStepDefStep1.sum==sumFromStory) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
	}

}
