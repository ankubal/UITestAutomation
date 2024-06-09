package com.Saucelabs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabs {
	WebDriver driver = null;
	WebDriverWait wait = null;
	Actions actions = null;

	@BeforeMethod
	public void intialisation() {
		// Setting the path to the respective driver
		// WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		// To launch the browser instancE

		driver = new EdgeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		wait = new WebDriverWait(driver, 30);

		actions = new Actions(driver);

		driver.manage().window().maximize();
	}

	@Test
	public void purchaseorder() {
		login();
		lowtoprice();
		addToCart();
		checkout();
		checkoutinfopage();
		completeOrder();
	}

	public void login() {
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginBtn.submit();
	}

	public void lowtoprice() {
		WebElement dropdown = driver.findElement(By.cssSelector("select.product_sort_container"));
		dropdown.click();
		Select select = new Select(dropdown);
		select.selectByValue("lohi");
	}

	public void addToCart() {
		WebElement addproduct1 = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
		WebElement addproduct2 = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
		addproduct1.click();
		addproduct2.click();
	}

	public void checkout() {
		WebElement checkout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.shopping_cart_link")));
		checkout.click();
     	WebElement productName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")));
		String actualProduct = productName.getText();
		String expectedProductName = "Sauce Labs Bolt T-Shirt";
		Assert.assertEquals(actualProduct,expectedProductName);
		WebElement productName2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']")));
		String actualProductt = productName2.getText();
		String expectedProductNametwo = "Test.allTheThings() T-Shirt (Red)";
		Assert.assertEquals(actualProductt,expectedProductNametwo);
		WebElement checkoutbtn = driver.findElement(By.cssSelector("#checkout"));
		checkoutbtn.click();
	
	}

	public void checkoutinfopage() {

		WebElement firstName = driver.findElement(By.id("first-name"));
		WebElement LastName = driver.findElement(By.id("last-name"));
		WebElement PostalCode = driver.findElement(By.id("postal-code"));
		WebElement continuebtn = driver.findElement(By.id("continue"));
		firstName.sendKeys("aka");
		LastName.sendKeys("an");
		PostalCode.sendKeys("l6x4e6");
		continuebtn.submit();
		WebElement payment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.summary_info>div:nth-of-type(2)")));
		String paymentinfo = payment.getText();
		System.out.println("payment info"+ paymentinfo);
		WebElement shippinginfo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.summary_info>div:nth-of-type(4)")));
		String shippinginfoo = shippinginfo.getText();
		System.out.println("payment info"+ shippinginfoo);
		WebElement total = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.summary_total_label")));
		String totalvalue = total.getText();
		System.out.println("payment info"+ totalvalue);
	}

	public void completeOrder() {
		WebElement finishbtn = driver.findElement(By.cssSelector("button.cart_button"));
		finishbtn.click();
		WebElement headerText = driver.findElement(By.cssSelector("h2.complete-header"));
		String actualHeaderText = headerText.getText();
		Assert.assertEquals(actualHeaderText, "Thank you for your order!");

	}
	@Test(priority=2)
	public void checktestfailed() {
		login();
		lowtoprice();
		addToCart();
		checkout();
		checkoutinfopage();
		WebElement finishbtn = driver.findElement(By.cssSelector("button.cart_button"));
		finishbtn.click();
		WebElement headerText = driver.findElement(By.cssSelector("h2.complete-header"));
		String actualHeaderText = headerText.getText();
		Assert.assertEquals(actualHeaderText, "Thank you for your order");
}}