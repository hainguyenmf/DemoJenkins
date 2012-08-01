package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC_2 extends TC_Base
{
	
	@BeforeMethod
	public void beforeMethod()
	{
	}
	
	@AfterMethod
	public void afterMethod()
	{
	}
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get(baseUrl + "/");
		driver.findElement(By.id("gbqfq")).clear();
		driver.findElement(By.id("gbqfq")).sendKeys("boy");
		driver.findElement(By.id("gbqfq")).sendKeys(Keys.ENTER);
		
		Assert.assertTrue(isTextPresent("boy"));
	}
	
}