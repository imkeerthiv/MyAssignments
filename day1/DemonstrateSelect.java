package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemonstrateSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Keerthi");
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Venkataraman");
//		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9988998899");
//		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9988998899");
		WebElement d=driver.findElement(By.xpath("//select[@id='day']"));
		Select day=new Select(d);
		day.selectByIndex(3);
		WebElement m=driver.findElement(By.xpath("//select[@id='month']"));
		Select mon=new Select(m);
		mon.selectByVisibleText("May");
		WebElement y=driver.findElement(By.xpath("//select[@id='year']"));
		Select year=new Select(y);
		year.selectByIndex(25);
		WebElement r1=driver.findElement(By.xpath("//label[@class='_58mt']"));
		r1.click();
	}

}
