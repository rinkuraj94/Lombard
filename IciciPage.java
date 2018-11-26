package com.icici.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.excel.utility.Xls_Reader1;

public class IciciPage {

	public static void main(String[] args) throws InterruptedException {
		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com");
		
		/*Xls_Reader1 reader=new Xls_Reader1("/Users/Rinku/eclipse-workspace/ICICILombard/src/com/exceldata/icici.xlsx");
		int count=reader.getRowCount("IciciData");
		System.out.println("Totals no row :: " +count);
		String firstname=reader.getCellData("IciciData", "SNO", 1);
		System.out.println(firstname);*/
		
		System.out.println("Ganpatti Bappa Morya");	
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/Rinku/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.icicilombard.com/motor-insurance/two-wheeler-insurance#coverage");
		System.out.println("==============Open Browser=============");
		
		System.out.println("Existing Policy - Pass");
		
		WebElement city=driver.findElement(By.id("txtRto"));//.sendKeys("MAHARASHTRA-NAVI MUMBAI");
		sendKeys(driver, city, 30, "MAHARASHTRA-NAVI MUMBAI");
		
		WebElement bikeModel=driver.findElement(By.id("tw_vd-mybike"));//.sendKeys("TVS");
		sendKeys(driver, bikeModel, 30, "TVS");
		
		WebElement bikeModelClick=driver.findElement(By.linkText("TVS - APACHE (148CC)"));//.click();//TVS - APACHE (148CC)
		clickOn(driver, bikeModelClick, 30);
		
		System.out.println("DropDown = Pass");
		

		
		driver.findElement(By.xpath("//select[@id='tw_claims_made']/following-sibling::div/a[2]")).click();
		Thread.sleep(3000);//clickOn(driver, claimade, 90);
		driver.findElement(By.linkText("1")).click();
		Thread.sleep(3000);//clickOn(driver, claimadeDrop, 90);
		
		System.out.println("Claim  = Pass");
		
		driver.findElement(By.xpath("//select[@id='tw_vd-registerunder']/following-sibling::div/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("20%")).click();
		Thread.sleep(3000);
		
		System.out.println("NCB= Pass");
		
		driver.findElement(By.xpath("//select[@id='tw_pre_pol_tenure']/following-sibling::div/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("2")).click();
		Thread.sleep(3000);
		
		System.out.println("Previous Policy Duration = Pass");
		
		driver.findElement(By.id("btnsubmit")).click();
		Thread.sleep(15000);
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.MILLISECONDS);
		System.out.println("Existing Policy Second = Pass");
		
		driver.findElement(By.xpath("//div[@class='popup light']"));
		System.out.println("Pop-Up = pass");
		
		driver.findElement(By.linkText("x")).click();
		System.out.println("Pass");

	}
	
	
	public static void sendKeys(WebDriver driver,WebElement element, int timeout, String value)
	{
		new WebDriverWait(driver,timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void clickOn(WebDriver driver, WebElement element, int timeout)
	{
		new WebDriverWait(driver,timeout).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	

}
