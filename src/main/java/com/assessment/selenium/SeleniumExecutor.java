package com.assessment.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumExecutor implements Executor {

  private final WebDriver driver;

  public SeleniumExecutor(WebDriver driver) {
    this.driver = driver;
  }

  /// Page 1
  @Override
  public void SetLoginAndClickNext(String login){
	  //add code here
  }

  /// Page 2
  @Override
  public String OpenCodePageAndReturnCode(){
	 
	//Add code here
	  String text = null;//replace variable with appropriate code.  
	return text;   
  }

  @Override
  public void SetCodeAndClickNext(String code){
	  //add code here
  }

  /// Page 3
  @Override
  public void FillMaskedPasswordAndClickLogin(String password){
	  //add code here
  }

  @Override
  public String GetLoggedInText(){
    String text = driver.findElement(By.id("loggedIn")).getText();
    return text;
  }

}
