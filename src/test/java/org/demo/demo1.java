package org.demo;

import org.testng.annotations.DataProvider;

public class demo1 {
	@DataProvider(name="login")
	public Object[][]getdata(){
		return new Object[][]{{"admin17","admin12"},
		                      {"admin199","admin122"},
		                      {"admin178","admin142"},
		                      {"admin167","admin192"}};
		                     
	}	                      
}
