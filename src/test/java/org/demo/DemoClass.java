package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClass extends demo1 {
	
	@DataProvider(name="login1")
	public Object[][]getdata(){
		return new Object[][]{{"admin17","admin12"},
		                      {"admin199","admin122"},
		                      {"admin178","admin142"},
		                      {"admin167","admin192"}};
		                     
	}	                      
	@Test(dataProvider="login",dataProviderClass=demo1.class)
	public void data(String uname,String pword) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\viveks\\Downloads\\Driver\\operadriver_win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to(" https://bit.ly/2QiBwQw ");
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(uname);
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(pword);
	
}
	
}

