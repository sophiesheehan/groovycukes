package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.PendingException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browse_Stepdefs {
  private WebDriver webDriver;
  
  @Before
  public void before_Browse_Stepdefs(){
 // TODO: implement webdriver
//    this.webDriver = new ChromeDriver();
  }
  
  @After
  public void after_Browse_StepsDefs() {
//    this.webDriver.quit();
  }
  
  @Given("^I am on the home page$")                                                                                                                  
  public void i_am_on_the_home_page() throws Throwable {                                                                                             
      // Write code here that turns the phrase above into concrete actions                                                                           
      throw new PendingException();                                                                                                                  
  }                                                                                                                                                  

  @When("^I click browse$")                                                                                                                          
  public void i_click_browse() throws Throwable {                                                                                                    
      // Write code here that turns the phrase above into concrete actions                                                                           
      throw new PendingException();                                                                                                                  
  }                                                                                                                                                  

  @Then("^I should be on the browse page$")                                                                                                          
  public void i_should_be_on_the_browse_page() throws Throwable {                                                                                    
      // Write code here that turns the phrase above into concrete actions                                                                           
      throw new PendingException();                                                                                                                  
  }  
}