package com.icici.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoLombard {
	
	WebDriver driver;
	
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
	
	@BeforeTest
	public void startUp() {
		System.out.println("Ganpatti Bappa Morya");
		System.setProperty("webdriver.chrome.driver", "/Users/Rinku/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.icicilombard.com/");
		System.out.println("==============Open Browser=============");
	}
	

	@Test(priority=1)
	public void TwoWheelerInsurance() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@title='Motor Insurance']/span/span[contains(text(),'Motor Insurance')]"));
		System.out.println("Motor Insurance - Pass");
		driver.findElement(By.linkText("Two Wheeler Insurance")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Two Wheeler Insurance')]")).click();
		System.out.println("Two Wheeler Insurance - Pass");
		Thread.sleep(3000);
		
		WebElement regNo=driver.findElement(By.id("reginum"));//.sendKeys("MH02CL0094");
		sendKeys(driver, regNo, 30, "MH02CL0094");
		
		WebElement mobNo=driver.findElement(By.id("2wMobileNo1"));//.sendKeys("8989497368");
		sendKeys(driver, mobNo, 30, "9876541230");
		
		WebElement email=driver.findElement(By.id("2wEmailId"));//.sendKeys("abc@gmail.com");
		sendKeys(driver, email, 30, "abc@gmail.com");
		
		
		WebElement btnExisting=driver.findElement(By.id("btnexisting"));//.click();
		clickOn(driver, btnExisting, 30);		
		
		//driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
		
		System.out.println("Existing Policy - Pass");
	}
	
	@Test(priority=2)
	public void existingPolicy() throws InterruptedException {
		
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
	}
	
	@Test(priority=3)
	public void popUp() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='popup light']"));
		System.out.println("Pop-Up = pass");
		Thread.sleep(3000);
		WebElement popUp=driver.findElement(By.xpath("//a[@class='close closeBtn']"));//.click();
		clickOn(driver, popUp, 30);
		
		System.out.println("Pass");
	}
	
	@Test(priority=4)
	public void options() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='innerCv']"));
		
		System.out.println("Select = Pass");
		
		driver.findElement(By.id("tw_optionA")).click();
		Thread.sleep(3000);
		System.out.println("Select1 = Pass");
		
		driver.findElement(By.xpath("//a[contains(text(),'Buy Now')]")).click();
		Thread.sleep(9000);
	}
	
	
	@AfterTest
	public void tearDown() {
		
	}
	


}
