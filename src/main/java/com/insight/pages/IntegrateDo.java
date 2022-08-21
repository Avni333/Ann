package com.insight.pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class IntegrateDo {
	

		
	public static void main(String args[])
	
	{
		 System.setProperty("webdriver.chrome.driver", "/Users/anitasubedi/Downloads/chromedriver");  
		    WebDriver driver = new ChromeDriver();  
		    JavascriptExecutor js = (JavascriptExecutor)driver;  
		    
		    driver.manage().window().maximize(); //maximize window
			// driver.manage().deleteAllCookies(); //delete all the cookies
		
			
		      
		// Launch website  
		    driver.navigate().to("https://insightsoftware.com/bizview/");
		   
		    driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		    
		 //Checking logo present or not   
		    boolean b1 = driver.findElement(By.xpath("//img[@class='entered lazyloaded']")).isDisplayed();
		  System.out.println("Logo is Validated successfully"+" "+ b1);
		  
		  
		  //Scrolling to Integrate With Section
		  WebElement Element = driver.findElement(By.xpath("//div[@id='block_data_sources']"));
	        js.executeScript("arguments[0].scrollIntoView();", Element);  
	        
	     
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      
	        
	      
	     driver.findElement(By.xpath("//a[@class='__mPS2id'][contains(text(),'Infor')]")).click();
	      
	      
	      driver.findElement(By.xpath("//a[contains(text(),'Infor Lawson')]")).click();
	      
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	      
	      driver.navigate().back();
	    //  driver.navigate().refresh();
	      
	      WebElement Element1 = driver.findElement(By.xpath("//div[@id='block_data_sources']"));
	        js.executeScript("arguments[0].scrollIntoView();", Element1);   
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      
	   
	        
	        
	        driver.findElement(By.xpath("//a[@class='__mPS2id'][contains(text(),'JD Edwards')]")).click();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.findElement(By.xpath("//a[@class='__mPS2id'][contains(text(),'Microsoft')]")).click();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.findElement(By.xpath("//a[@class='__mPS2id'][contains(text(),'SAP')]")).click();
	        
	        
	        
	        
	        
	        
	     
	
	
	}

	}
	