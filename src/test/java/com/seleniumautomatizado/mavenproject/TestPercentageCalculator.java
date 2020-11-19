package com.seleniumautomatizado.mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.junit.Test;
import org.junit.Ignore;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


public class TestPercentageCalculator {
		
    @Test
    public void testPositivePositive() {
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
	      
	      driver.close();
	      assertEquals("5", result);
    }
    @Test
    public void testPositiveNegative() {
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
	      driver.findElement(By.id("cpar2")).sendKeys("-50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      
	      driver.close();
	      assertEquals("-5", result);
    }
    @Test
    public void testNegativePositive() {
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
	      driver.findElement(By.id("cpar1")).sendKeys("-10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      
	      driver.close();
	      assertEquals("-5", result);
    }
    @Test
    public void testNegativeNegative() {
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
	      driver.findElement(By.id("cpar1")).sendKeys("-10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("-50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      
	      driver.close();
	      assertEquals("5", result);
    }
    @Test
    public void testWordWord() {
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
	      driver.findElement(By.id("cpar1")).sendKeys("test");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("test");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font")).getText();
	      
	      driver.close();
	      assertEquals("Please provide two numeric values in any fields below.", result);
    }
    
    @Test
    public void testWordNumber() {
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
	      driver.findElement(By.id("cpar1")).sendKeys("test");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("15");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font")).getText();
	      
	      driver.close();
	      assertEquals("Please provide two numeric values in any fields below.", result);
    }
}
