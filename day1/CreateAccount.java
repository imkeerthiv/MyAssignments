package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement eleUsername=driver.findElement(By.id("username"));
		eleUsername.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		WebElement accName=driver.findElement(By.id("accountName"));
		accName.sendKeys("hiKeerthi");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		WebElement ind=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industry=new Select(ind);
		industry.selectByIndex(3);
		WebElement own=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select own1=new Select(own);
		own1.selectByVisibleText("S-Corporation");
		WebElement sou=driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select sour=new Select(sou);
		sour.selectByIndex(4);
		WebElement mar=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select market=new Select(mar);
		market.selectByIndex(6);
		WebElement st=driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select state=new Select(st);
		state.selectByIndex(50);
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
