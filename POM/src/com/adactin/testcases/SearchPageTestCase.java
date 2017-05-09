package com.adactin.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.adactin.pageclass.LoginPage;
import com.adactin.pageclass.SearchHotelPage;



public class SearchPageTestCase {
	LoginPage loginPage;
	SearchHotelPage searchHotelPage;

@Test
public void correctLogin() throws InterruptedException{
	loginPage = new LoginPage();
	loginPage.setTxtUsername("ID3646347");
	loginPage.setTxtPassword("January101979");
	loginPage.clickBtnLogin();
	searchHotelPage = new SearchHotelPage();
	Assert.assertEquals("Hello ID3646347!", searchHotelPage.getTextWelcomeText());
	//Thread.sleep(5000);
}
	
@Test
public void searchHotels() throws InterruptedException{
	searchHotelPage = new SearchHotelPage();
	searchHotelPage.setTxtLocation("Melbourne");
	searchHotelPage.setTxtHotels("Hotel Sunshine");
	searchHotelPage.setTxtRoomtype("Standard");
	//Thread.sleep(1000);
	searchHotelPage.setTxtRoomNo("1 - One");
	searchHotelPage.setTxtDatepickin("09/05/2017");
	searchHotelPage.setTxtDatepickout("10/05/2017");
	//Thread.sleep(5000);
	searchHotelPage.setTxtAdultroom("3 -Three");
	//Thread.sleep(5000);
	searchHotelPage.setTxtChildroom("2 - Two");

	searchHotelPage.clickBtnSubmit();
	
	//searchHotelPage = new SearchHotelPage();
	//Assert.assertEquals("Hello ID3646347!", searchHotelPage.getTextWelcomeText());
	}

}