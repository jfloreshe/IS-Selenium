package com.seleniumautomatizado.mavenproject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class webdriverdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath(".//*[@id = 'hl3']/li[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();

	      
	      // Print a Log In message to the screen
	      System.out.println(" The Result is " + result);
	      
	      /* positive - negative*/
	   // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("-50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();

	      
	      // Print a Log In message to the screen
	      System.out.println(" The Result is " + result);
	      /* negative positive*/
	   // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("-10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();

	      
	      // Print a Log In message to the screen
	      System.out.println(" The Result is " + result);
	      /* negative negative*/
	   // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("-10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("-50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();

	      
	      // Print a Log In message to the screen
	      System.out.println(" The Result is " + result);
	      
	      /* word word*/
	   // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("test");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("test");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font")).getText();

	      
	      // Print a Log In message to the screen
	      System.out.println(" The Result is " + result);
	      /* word positive*/
	   // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("test");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font")).getText();

	      
	      // Print a Log In message to the screen
	      System.out.println(" The Result is " + result);
	      
	      driver.close();
	}

}
