package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_page {
	WebDriver driver;
	By username = By.id("user-name");
	By password = By.id("password");
	By loginbutton = By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]");
	By search = By.xpath("//*[@id=\"inventory_filter_container\"]/select");
	
	public Search_page() {
		this.driver = driver;
	}
	public void url() {
		//To launch the chrome browser
		 System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  //To maximise the window
		  driver.manage().window().maximize();
		//To hold the browser for 50 seconds
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	//To launch Swag Homepage
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
	//To search the items in search box
	public void swaglabs_search() throws InterruptedException {
		driver.findElement(search).click();
		//Hold the browser for 1 sec
		Thread.sleep(1000);
		//Closing the browser
		driver.close();			
	}
}
