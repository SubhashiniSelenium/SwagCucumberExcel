package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Excelutility.Excel_data;

public class Login_page {
	WebDriver driver;
	By username = By.id("user-name");
	By password = By.id("password");
	By loginbutton = By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]");
	
	public Login_page() {
		this.driver = driver;
	}
	public void url() {
		  //To launch chrome browser
		  System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		  driver=new ChromeDriver();
		  //To maximise the browser
		  driver.manage().window().maximize();
		  //To hold the browser for 50 seconds
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	//To launch Swag Homepage
	public void swag_homepage() {
		driver.get("https://www.saucedemo.com/");
		 System.out.println(driver.getTitle());
	}
	//To enter username
	public void swaglabs_username(int i) throws IOException {
		Excel_data data=new Excel_data();
		driver.findElement(username).sendKeys(data.excel_username(i));
	}
	//To enter password
	public void swaglabs_password(int i) throws IOException {
		Excel_data data=new Excel_data();
		driver.findElement(password).sendKeys(data.excel_password(i));
	}
	//To click login button
	public void swaglabs_loginbutton() {
		driver.findElement(loginbutton).click();
	}
	//To close the browser
	public void quit()
	{
		driver.close();
	}
}
