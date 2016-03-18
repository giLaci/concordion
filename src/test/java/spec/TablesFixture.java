package spec;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class TablesFixture {
    
    private String time;

    public String getGreeting() {
        return "Hello World!";
    }

    public String greetingFor(String firstName) {
        return "Hello " + firstName + "!";
    }
    
    public void setCurrentTime(String time) {
        this.time = time;
    }
    
    public String getDailyGreeting() {
        if (time != null && time.endsWith("AM")) {
            return "Good Morning World!";
        }
        return getGreeting();
    }
}
