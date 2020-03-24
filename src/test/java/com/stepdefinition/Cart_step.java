package com.stepdefinition;

import java.io.IOException;

import com.Excelutility.Excel_data;
import com.pages.Cart_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cart_step{
	Cart_page cart=new Cart_page();
	
	@Given("^user launched the chrome browser$")
	public void user_launched_the_chrome_browser(){
	   cart.url(); 
	}

	@When("^the user opens Swaglab homepage$")
	public void the_user_opens_Swaglab_homepage(){
		cart.swag_homepage();
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws IOException{
		//Excel_data data=new Excel_data();
		 cart.swaglabs_username("standard_user");
		 cart.swaglabs_password("secret_sauce");
	}

	@Then("^clicked the login button$")
	public void clicked_the_login_button(){
		cart.swaglabs_loginbutton();
	}

	@Then("^the clicks the product to cart$")
	public void the_clicks_the_product_to_cart(){
	    cart.swaglabs_cart();
	}

	@Then("^the product is added to cart$")
	public void the_product_is_added_to_cart() throws InterruptedException, IOException{
	   cart.viewcart();
	}


}
