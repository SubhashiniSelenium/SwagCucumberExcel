package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart_page {
	WebDriver driver;
	By username = By.id("user-name");
	By password = By.id("password");
	By loginbutton = By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]");
	By cart = By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");
	By Viewcart=By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
	
	public Cart_page() {
		this.driver = driver;
	}

	public void url() {
		//To launch the chrome browser
		 System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
		 //Creating instance for chrome browser
		    driver=new ChromeDriver();
		    //To maximise the window
		    driver.manage().window().maximize();
		  //To hold the browser for 50 seconds
		    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
	//To launch 
	public void swag_homepage() {
		driver.get("https://www.saucedemo.com/");
	}
	//To enter username
		public void swaglabs_username(String userid) {
			driver.findElement(username).sendKeys(userid);
		}
		//To enter password
		public void swaglabs_password(String pass) {
			driver.findElement(password).sendKeys(pass);
		}
		//To click login button
		public void swaglabs_loginbutton() {
			driver.findElement(loginbutton).click();
		}
		//To add items to the cart
	public void swaglabs_cart() {
		driver.findElement(cart).click();
		
	}
	public void viewcart() throws InterruptedException, IOException {
		driver.findElement(Viewcart).click();
		//Thread.sleep(3000);
		//Taking Screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("src\\test\\resources\\Screenshot\\cart.jpg"));
		//Closing the browser
		driver.close();
	}
	

}
