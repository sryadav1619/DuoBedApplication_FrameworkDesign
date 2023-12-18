package com.duobed.TestLayer;

import org.testng.annotations.Test;

import com.duobed.PageLayer.AddToCartPage;

public class AddToCartPageTest {

	@Test
	public void addToCartFunctionality()
	{
		AddToCartPage AtC = new AddToCartPage();
	
		         AtC.ClickOnAddToCartButton();
	
	
	}
}
