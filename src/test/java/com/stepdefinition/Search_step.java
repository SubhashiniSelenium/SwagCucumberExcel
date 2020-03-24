package com.stepdefinition;

import java.io.IOException;

import com.Excelutility.Excel_data;
import com.pages.Search_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search_step{
	Search_page search=new Search_page();
	
	@Given("^the user launches chrome browser$")
    public void the_user_launches_chrome_browser(){
		search.url();  
}

   @When("^the user opened Swaglabs homepage$")
   public void the_user_opened_Swaglabs_homepage(){
       search.swag_homepage();
}

   @Then("^the user enter username and password$")
   public void the_user_enter_username_and_password() throws IOException{
	   //Excel_data data=new Excel_data();
       search.swaglabs_username("standard_user");
       search.swaglabs_password("secret_sauce");
}

   @Then("^clicks the login button$")
    public void clicks_the_login_button(){
	  search.swaglabs_loginbutton();
   
}

   @Then("^the user clicks the A to Z icon$")
    public void the_user_clicks_the_A_to_Z_icon() throws InterruptedException{
      search.swaglabs_search();
}

}
