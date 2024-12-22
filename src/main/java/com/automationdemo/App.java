package com.automationdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://testpages.eviltester.com/styled/search");
    	Thread.sleep(2000);
    	
    	WebElement search = driver.findElement(By.xpath("/html/body/div/form/p[1]/input"));
    	search.sendKeys("Something");
    	WebElement click = driver.findElement(By.xpath("/html/body/div/form/input"));
    	Thread.sleep(2000);
    	click.click();
    }
    
}
