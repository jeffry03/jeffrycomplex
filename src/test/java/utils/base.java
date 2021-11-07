package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
static WebDriver driver;	
public static WebDriver browserOpen(String browser){
	
if(browser.equalsIgnoreCase("chrome"))
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}
else if(browser.equalsIgnoreCase("edge"))
{
	WebDriverManager.edgedriver().setup();
driver=new EdgeDriver();	
}
return driver;
}
public void openUrl(String url) {
driver.get(url);
}
public void maximize() {
	driver.manage().window().maximize();
}

public void send(WebElement element,String value) {
element.sendKeys(value);
}
public void tap(WebElement element) {
element.click();
}
}
