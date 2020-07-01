package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import hooks.TestNgHooks;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(features = { "src/main/java/features/OffnetFlowExistingCustomer.feature" }, 
				glue = { "pages","hooks" }, 
				monochrome = true, 
				dryRun = false, 
				plugin = { "html:reports/cucumber",	"json:reports/cucumber.json" }
				)

public class RunCucumberUsingTestNG extends TestNgHooks {

	private TestNGCucumberRunner testNGCucumberRunner;

	
	@BeforeTest
	public void setData() {
		testCaseName = "TC001-Offnet";
		testDescription = "Offnet - NewCustomerFlow - One Hour Pass Cucumber";
		category = "smoke";
		authors = "Kandeepan";  
		dataSheetName = "TC001";
		nodes = "OffnetFlow";
	}
	
    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        // the 'featureWrapper' parameter solely exists to display the feature file in a test report
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    /**
     * Returns two dimensional array of {@link PickleWrapper}s
     * with their associated {@link FeatureWrapper}s.
     *
     * @return a two dimensional array of scenarios features.
     */
    @DataProvider
    public Object[][] scenarios() {
        if (testNGCucumberRunner == null) {
            return new Object[0][0];
        }
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        if (testNGCucumberRunner == null) {
            return;
        }
        testNGCucumberRunner.finish();
    }

}
