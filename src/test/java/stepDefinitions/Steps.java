package stepDefinitions;



import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Steps {				

    WebDriver driver;	
  
    @Given("^User is on facebook sign up page$")
    public void user_is_on_facebook_sign_up_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32_1\\chromedriver.exe");
    	driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();
       		
    }
    
    @When("^User fills all the fields by entering password with less characters$")
    public void user_fills_all_the_fields_by_entering_password_with_less_characters(DataTable userdetails) throws Throwable {
      WebDriverWait wait=new WebDriverWait(driver,15);
   	  List<List<String>> data=userdetails.raw();
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
      driver.findElement(By.name("firstname")).sendKeys(data.get(1).get(1));
      driver.findElement(By.name("lastname")).sendKeys(data.get(2).get(1));
      driver.findElement(By.name("reg_email__")).sendKeys(data.get(3).get(1));
      driver.findElement(By.name("reg_passwd__")).sendKeys(data.get(4).get(1));
      Select day = new Select(driver.findElement(By.name("birthday_day"))); 
      day.selectByValue(data.get(5).get(1)); 
		
      Select month = new Select(driver.findElement(By.name("birthday_month")));
      month.selectByValue(data.get(6).get(1)); 
		
      Select year = new Select(driver.findElement(By.name("birthday_year")));
      year.selectByValue(data.get(7).get(1)); 
		
      driver.findElement(By.className("_58mt")).click(); 
      
       
    }
    @When("^Click on 'Sign Up' button$")
    public void click_on_Sign_Up_button() throws Throwable {
    	driver.findElement(By.name("websubmit")).click(); 
    }

    @Then("^User can see the error message for invalid password$")
    public void user_can_see_the_error_message_for_invalid_password() throws Throwable {

    	String expected = "Your password must be at least 6 characters long. Please try another.";
    	//String expected = "An error occurred. Please try again.";
    	WebDriverWait wait=new WebDriverWait(driver,50);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("_58mo")));
        WebElement m = driver.findElement(By.className("_58mo"));
        String actual = m.getText();
        System.out.println("Error message is: "+ actual);
        //verify error message with Assertion
        Assert.assertEquals(expected, actual);
        
    }
    
    }

		 

  		