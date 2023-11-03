package StapeDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = new ChromeDriver();
	
	
	@Given("I am on login page")
	public void i_am_on_login_page() {	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	@When("user entered valid username")
	public void user_entered_valid_username() {
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	}

	@And("user entered valid password")
	public void user_entered_valid_password() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	    
	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}

	@Then("user redericts to the home page")
	public void user_redericts_to_the_home_page() {
		System.out.println(driver.getCurrentUrl());
	   
	}


}
