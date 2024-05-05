package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//maximize
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("testleaf.2023@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Tuna@321");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		String get_title = driver.getTitle();
		System.out.println(get_title);
		driver.close();
	}

}
