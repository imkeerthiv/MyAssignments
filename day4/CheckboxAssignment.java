package week2.day4;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckboxAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		//maximize
		driver.manage().window().maximize();
		//implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Checkbox
		driver.findElement(By.xpath("//span[@class='ui-chkbox-label']")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']")).click();
		driver.findElement(By.xpath("//label[@for='j_idt87:basic:0']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='j_idt87:basic:2']")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
