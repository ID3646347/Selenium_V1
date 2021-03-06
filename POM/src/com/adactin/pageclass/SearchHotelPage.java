package com.adactin.pageclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchHotelPage extends Base{
	
	@FindBy(id="username_show")
	private WebElement txtWelcomeText;
	
	@FindBy(id="location")
	private WebElement txtLocation;
	
	@FindBy(id="hotels")
	private WebElement txtHotels;
	
	@FindBy(id="room_type")
	private WebElement txtRoomtype;
	
	@FindBy(id="room_nos")
	private WebElement txtRoomno;
	
	@FindBy(id="datepick_in")
	private WebElement txtDatepickin;
	
	@FindBy(id="datepick_out")
	private WebElement txtDatepickout;
	
	@FindBy(id="adult_room")
	private WebElement txtAdultroom;
	
	@FindBy(id="child_room")
	private WebElement txtChildroom;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;
	
	public SearchHotelPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getTextWelcomeText(){
		return txtWelcomeText.getAttribute("value");
	}
	
	public void setTxtLocation(String text){
		txtLocation.sendKeys(text);
	}
	
	public void setTxtHotels(String text) {
		// TODO Auto-generated method stub
		txtHotels.sendKeys(text);
	}
	
	public void setTxtRoomtype(String text) {
		// TODO Auto-generated method stub
		txtRoomtype.sendKeys(text);
	}
	
	public void setTxtRoomNo(String text) {
		// TODO Auto-generated method stub
		txtRoomno.sendKeys(text);
	}
	
	public void setTxtDatepickin(String text) {
		// TODO Auto-generated method stub
		txtDatepickin.sendKeys(text);
		txtDatepickin.sendKeys(Keys.TAB);
	}
	
	public void setTxtDatepickout(String text) {
		// TODO Auto-generated method stub
		txtDatepickout.sendKeys(text);
		//txtDatepickin.sendKeys(Keys.TAB);
	}
	
	public void setTxtAdultroom(String text) {
		// TODO Auto-generated method stub
		txtAdultroom.sendKeys(text);
	}
	
	public void setTxtChildroom(String text) {
		// TODO Auto-generated method stub
		txtChildroom.sendKeys(text);
	}
	
	public void clickBtnSubmit(){
		btnSubmit.click();
	}
	

}
