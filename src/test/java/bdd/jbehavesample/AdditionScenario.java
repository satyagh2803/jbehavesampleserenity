package bdd.jbehavesample;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;
import net.serenitybdd.jbehave.SerenityStories;


public class AdditionScenario extends SerenityStories{

	 // Here we specify the configuration, starting from default MostUsefulConfiguration, and changing only what is needed
  /*  @SuppressWarnings("deprecation")
	@Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                // where to find the stories
                .useStoryLoader(new LoadFromClasspath(this.getClass()))
                        // CONSOLE and TXT reporting
                .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(StoryReporterBuilder.Format.CONSOLE, StoryReporterBuilder.Format.TXT, StoryReporterBuilder.Format.HTML, StoryReporterBuilder.Format.XML));
    }

    // Here we specify the steps classes
    @Override
    public List<CandidateSteps> candidateSteps() {
        // varargs, can have more that one steps classes
        return new InstanceStepsFactory(configuration(), new AppStepDefinitions()).createCandidateSteps();
    }	*/

}
