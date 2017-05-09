package com.adactin.unittest;

import org.junit.Assert;
import org.junit.Test;

import com.adactin.pageclass.LoginPage;



public class LoginPageTest {
	@Test
	public void txtUserNameText(){
		LoginPage loginpage = new LoginPage();
		loginpage.setTxtUsername("ID3646347");
		Assert.assertEquals("ID3646347", loginpage.getTxtUsername());
	}
	
	@Test
	public void txtPasswordText(){
		LoginPage loginpage = new LoginPage();
		loginpage.setTxtPassword("January101979");
		Assert.assertEquals("January101979", loginpage.getTxtPassword());
	}

}
