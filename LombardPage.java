package com.icici.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LombardPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Ganpatti Bappa Morya");	
		
		System.setProperty("webdriver.chrome.driver", "/Users/Rinku/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("https://www.icicilombard.com/");
		driver.get("https://www.icicilombard.com/motor-insurance/two-wheeler-insurance#coverage");
		//driver.get("https://www.icicilombard.com/registration-new-ui?returl=/motor-insurance/two-wheeler-insurance/get-quote/insured-details");
		System.out.println("==============Open Browser=============");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		/*act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Products ')]"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@title='Motor Insurance']/span/span[contains(text(),'Motor Insurance')]"));
		System.out.println("Motor Insurance - Pass");
		driver.findElement(By.linkText("Two Wheeler Insurance")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Two Wheeler Insurance')]")).click();
		System.out.println("Two Wheeler Insurance - Pass");
		Thread.sleep(3000); */
		
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
		
		WebElement city=driver.findElement(By.id("txtRto"));//.sendKeys("MAHARASHTRA-NAVI MUMBAI");
		sendKeys(driver, city, 30, "mum");
		
		WebElement cityclick=driver.findElement(By.linkText("MAHARASHTRA-NAVI MUMBAI"));
		clickOn(driver, cityclick, 30);
		
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
		//driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.MILLISECONDS);
		System.out.println("Existing Policy Second = Pass");
		
//		driver.findElement(By.xpath("//div[@class='popup light']"));
//		System.out.println("Pop-Up = pass");
//		Thread.sleep(3000);
//		WebElement popUp=driver.findElement(By.xpath("//a[@class='close closeBtn']"));//.click();
//		clickOn(driver, popUp, 30);
//		
//		System.out.println("Pass");
		
		driver.findElement(By.xpath("//div[@class='innerCv']"));
		
		System.out.println("Select = Pass");
		
		driver.findElement(By.id("tw_optionC")).click();
		Thread.sleep(3000);
		System.out.println("Select1 = Pass");
		driver.findElement(By.xpath("//a[contains(text(),'Buy Now')]")).click();	
		try {
			Thread.sleep(3000);
		}catch(Exception e)
		{
			System.out.println("Error");
		}
		//Thread.sleep(9000);
		System.out.println("Pageloading");  
		
		
		driver.findElement(By.id("btnguest")).click();
		System.out.println("Click Guest Login Button");
		

		/*driver.findElement(By.xpath("//div[@class='popup light']"));
		System.out.println("Pop-Up = pass");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='close closeBtn']")).click();
		Thread.sleep(3000); */
		//Mr
		driver.findElement(By.xpath("//select[@id='tw_mr']/following-sibling::div/a[2]")).click();
		Thread.sleep(3000);
		System.out.println("Mr");
		driver.findElement(By.linkText("Mr")).click();
		Thread.sleep(3000);
		
		//FullName
		driver.findElement(By.id("tw_fullname")).sendKeys("Rinku Saw");
		//Mob
		//driver.findElement(By.id("tw_mobileno")).sendKeys("9876541230");
		//Email
		//driver.findElement(By.id("tw_emailaddress")).sendKeys("abc@gmail.com");
		//DOB
		driver.findElement(By.id("tw_dob")).click();
		driver.findElement(By.id("ui-datepicker-div"));
		driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		String date="18-SEP-2018";
		String dateArr[] =date.split("-"); //{18,SEP,2018}
		String day=dateArr[0];
		String mont=dateArr[1];
		String yearl=dateArr[2];
		System.out.println(date+ " " +mont+ " " +yearl);
		
		Select monthName=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		monthName.selectByVisibleText("Sep");
		
		System.out.println("Month = Pass");
		
		Select yearName=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		yearName.selectByVisibleText("1999");
		System.out.println("Year = Pass");
		
		//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[1]
		//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[6]
		
		String beforeXpath="//*[@id='ui-datepicker-div']/table/tbody/tr[";
		String afterXpath="]/td[";
		//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[1]
		
		final int totalweekday=7;
		boolean flag = false;
		for(int rowNum=2;rowNum<=7;rowNum++)
		{
			for(int colNum=1;colNum<=totalweekday;colNum++)
			{
				String dayVal=driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
				System.out.println(dayVal);
				if(dayVal.equals(day))
				{
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
					flag=true;
					break;
				}
			}
			
			if(flag)
			{
				break;
			}
			
		}
		
		System.out.println("Date Click");
//		driver.findElement(By.id("tw_dob")).sendKeys("06/11/2000");
//		System.out.println("Pass");
//		Thread.sleep(3000);
//		//Address1
		driver.findElement(By.id("tw_address1")).sendKeys("Abc Def Ghi Address1");
		//PinCode
		driver.findElement(By.id("tw_pincode")).sendKeys("400007");
		//Thread.sleep(3000);
		//City&State
		driver.findElement(By.id("tw_citystate")).sendKeys("Mumbai");
		Thread.sleep(3000);
		
		//Aadhar
		driver.findElement(By.id("txtaadhaarno")).sendKeys("txtaadhaarno");
		Thread.sleep(3000);
		//PanCard
		driver.findElement(By.id("txtpanno")).sendKeys("EAQPS1245H");
		Thread.sleep(3000);
		//LandNumber
		driver.findElement(By.id("tw_lnadlineNo")).sendKeys("2202289841");
		Thread.sleep(3000);
		//Landmark
		driver.findElement(By.id("tw_LandMark")).sendKeys("abdadd hjhjjjj");
		Thread.sleep(3000);
		
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		//Nominee
		driver.findElement(By.id("tw_nameofnominee")).sendKeys("Adndndnd");
		Thread.sleep(3000);
		//relation & insured
		driver.findElement(By.xpath("//select[@id='tw_nomineeselectrelation']/following-sibling::div/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("MOTHER")).click();
		Thread.sleep(3000);
		
		//DOB of Nominee
		
		
				driver.findElement(By.id("tw_nominee_dob")).click();
				driver.findElement(By.id("ui-datepicker-div"));
				driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
				String date1="11-SEP-2018";
				String dateArr1[] =date1.split("-"); //{18,SEP,2018}
				String day1=dateArr1[0];
				String mont1=dateArr1[1];
				String yearl1=dateArr1[2];
				System.out.println(date1+ " " +day1+ " " +mont1+ " " +yearl1);
				
				Select monthName1=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
				monthName1.selectByVisibleText("May");
				
				System.out.println("Month = Pass");
				
				Select yearName1=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
				yearName1.selectByVisibleText("1962");
				System.out.println("Year = Pass");
				
				//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[1]
				
				//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[1]
				//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[6]
				
				//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[1]
				String beforeXpath1="//*[@id='ui-datepicker-div']/table/tbody/tr[";
				String afterXpath1="]/td[";
				//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[1]
				
				final int totalweekday1=7;
				boolean flag1 = false;
				for(int rowNum=2;rowNum<=7;rowNum++)
				{
					for(int colNum=1;colNum<=totalweekday1;colNum++)
					{
						String dayVal1=driver.findElement(By.xpath(beforeXpath1+rowNum+afterXpath1+colNum+"]")).getText();
						System.out.println(dayVal1);
						if(dayVal1.equals(day1))
						{
							driver.findElement(By.xpath(beforeXpath1+rowNum+afterXpath1+colNum+"]")).click();
							flag1=true;
							break;
						}
					}
					
					if(flag1)
					{
						break;
					}
					
				}
				
				System.out.println("Date Click Nominee");

		
		//driver.findElement(By.id("tw_nominee_dob")).sendKeys("06/11/1962");
		Thread.sleep(3000);
		System.out.println("Pass");
		//driver.findElement(By.linkText("Next")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Next')]")).click();
		System.out.println("Next Click = Pass");
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='popup light']"));
		System.out.println("Pop-Up = pass");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='close closeBtn']")).click();
		Thread.sleep(3000); */
		System.out.println("Pop-Up = pass1");
		
		driver.findElement(By.id("tw_policy_no")).sendKeys("2");
		driver.findElement(By.xpath("//select[@id='tw_previousinsurer']/following-sibling::div/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("GENERAL INSURANCE CORPORATION OF INDIA")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='btnSectn bt1']/a[contains(text(),'Save')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Save')]")).click();
		System.out.println("Save");
		
		
		

		
	} // end Main
	
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
