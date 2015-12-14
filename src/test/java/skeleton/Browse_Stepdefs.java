package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.PendingException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

// using firefox as just cant get chrome to work
// Xfvb :99 &
// export DISPLAY=:99
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Browse_Stepdefs {
  private WebDriver browser;
  
  @Before
  public void before_Browse_Stepdefs(){
    browser = new FirefoxDriver();
  }
  
  @After
  public void after_Browse_StepsDefs() {
    browser.quit();
  }
  
  @Given("^I am on (.*)$")                                                                                                                  
  public void i_am_on(String url) throws Throwable {
    browser.get(url);
  }                                                                                                                                                  

  @When("^I click (.*)")                                                                                                                          
  public void i_click( String link ) throws Throwable {
      browser.findElement(By.linkText(link)).click();
  }                                                                                                                                                  

  @Then("^I should be on (.*)$")                                                                                                          
  public void i_should_see(String expectedTitle) throws Throwable {
    
    assertThat ( browser.getTitle(), is (expectedTitle) );
  }  
}