package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class RunHooks {
	@Before	//after @BeforeMethod and before @Test
	public void before(Scenario sc) {
		System.out.println(sc.getSourceTagNames());
		System.out.println(sc.getLine());
		System.out.println(sc.getStatus());
	}

	@After	// after @Test and before @Aftermethod
	public void after(Scenario sc) {
		System.out.println(sc.getStatus());
	}
}
