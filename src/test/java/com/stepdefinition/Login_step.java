package com.stepdefinition;

import java.io.IOException;
import com.Excelutility.Excel_data;
import com.pages.Login_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_step{
	Login_page login=new Login_page();
	
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser(){
	    login.url();
	}

	@When("^the user opens Swaglabs homepage$")
	public void the_user_opens_Swaglabs_homepage(){
		login.swag_homepage();
	   
	}

	@Then("^the user enters username and password$")
	public void the_user_enters_username_and_password() throws IOException, InterruptedException{
		//Excel_data data=new Excel_data();
		for(int i=1;i<=5;i++) {
		login.swaglabs_username(i);
		login.swaglabs_password(i);
		login.swaglabs_loginbutton();
		Thread.sleep(4000);
		login.quit();
		
		if(i<=4) {
		login.url();
		login.swag_homepage();
		}
	}
	}

	@Then("^click the login button$")
	public void click_the_login_button() throws IOException, InterruptedException{
		System.out.println("K");
		/*login.swaglabs_loginbutton();
		Thread.sleep(3000);
		login.quit();*/
	}

}
