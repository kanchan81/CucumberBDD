package StapeDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSerchSteps {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("I am on google search page")
	public void i_am_on_google_search_page() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}

	@When("I entered java and click on search")
	public void i_entered_java_and_click_on_search() {
		 driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("java");
		 driver.findElement(By.xpath("//*[@aria-label='Google Search']")).click();
		//*[@aria-label='Google Search']
	}

	@Then("page title must start with java")
	public void page_title_must_start_with_java() {
		System.out.println(driver.getCurrentUrl());
	}

}
