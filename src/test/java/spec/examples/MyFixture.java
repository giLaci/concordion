package spec.examples;

import org.concordion.integration.junit4.ConcordionRunner;
import org.concordion.internal.util.SimpleFormatter;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class MyFixture {

    public String greetingFor(String name) {
	return SimpleFormatter.format("Hello %s!", name);
    }

}
