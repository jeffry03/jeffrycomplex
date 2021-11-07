package org.program;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import utils.base;


public class ProgramComplex extends base{
	static WebDriver driver;
		
@BeforeClass	
public static void openBrowser() {
driver=browserOpen("chrome");
}

@AfterClass
public static void closeBrowser() {
driver.close();
}

@Before
public void maxi() {
openUrl("https://opensource-demo.orangehrmlive.com/");
maximize();
}

@Test
public void test() {
WebElement user = driver.findElement(By.id("txtUsername"));
send(user,"Admin");
WebElement pass = driver.findElement(By.id("txtPassword"));
send(pass,"admin123");
WebElement login = driver.findElement(By.id("btnLogin"));
tap(login);
}

@Test
public void test1() {
WebElement user = driver.findElement(By.id("txtUsername"));
send(user,"Admin");
WebElement pass = driver.findElement(By.id("txtPassword"));
send(pass,"admin@123");
WebElement login = driver.findElement(By.id("btnLogin"));
tap(login);
}


@After
public void validate() {
WebElement valid = driver.findElement(By.id("welcome"));
String text = valid.getText();
boolean contains = text.contains("Welcome");
Assert.assertTrue(contains);
Assert.assertEquals("Welcome paul", text);
}
}
