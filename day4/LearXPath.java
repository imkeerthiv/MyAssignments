package week2.day4;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class LearXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement eleUsername=driver.findElement(By.xpath("//input[@id='username']"));
eleUsername.sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
driver.close();
	}

}
