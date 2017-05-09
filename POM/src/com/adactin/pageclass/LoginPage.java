package com.adactin.pageclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base{
	@FindBy(id="username")
	private WebElement txtUsername;
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	@FindBy(tagName="b")
	private WebElement lblincorrectLogin;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
//	public SearchHotelPage(){
//		PageFactory.initElements(driver, this);
//	}
	
	public String getTxtUsername(){
		return txtUsername.getAttribute("value");
	}
	
	public void setTxtUsername(String text){
		txtUsername.sendKeys(text);
	}
	
	public String getTxtPassword(){
		return txtpassword.getAttribute("value");
	}
	
	public void setTxtPassword(String text) {
		// TODO Auto-generated method stub
		txtpassword.sendKeys(text);
		txtpassword.sendKeys(Keys.TAB);
	}
	
	public void clickBtnLogin(){
		btnLogin.click();
	}
	
	public String getLblIncorrectLogin(){
		return lblincorrectLogin.getText();
	}

}
