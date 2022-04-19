package hooks;

import org.base.BaseClass;
import org.junit.AfterClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	
	@Before
	public void beforeScenario() {
		launchBrowser();
		getUrl("https://tuzzut.com/");
		waitAll();
		
		
	}
	@After
	public void closeScenario() {
		close();
	}

}
