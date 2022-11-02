package com.stepDefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Steps {
	public static WebDriver driver;
	String expectedOutput = "YOUR CART";

	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://saucedemo.com");
		driver.manage().window().maximize();
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String string) {
		driver.findElement(By.id("user-name")).sendKeys(string);
	}

	@When("User enters Password as {string}")
	public void user_enters_password_as(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("User enters Username")
	public void user_enters_username() {
		driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
	}

	@When("User enters Password")
	public void user_enters_password() {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}

	@When("User adds products to cart")
	public void user_adds_products_to_cart() {
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
	}

	@When("User views cart products")
	public void user_views_cart_products() {
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	}

	@Given("User clicks on Tshirt addcart button")
	public void user_clicks_on_Tshirt_addcart_button() {
		WebElement product1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", product1);
		product1.click();

	}

	@Given("User clicks on Jacket addcart button")
	public void user_clicks_on_jacket_addcart_button() throws InterruptedException {
		WebElement product2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
		product2.click();
//		Thread.sleep(1000);
	}

	@Then("test case is successful")
	public void test_case_is_successful() {
		String actualOutput = driver.findElement(By.xpath("//*[@id='header_container']/div[2]/span")).getText();
		Assert.assertEquals(expectedOutput, actualOutput);
	}
	
	

}
