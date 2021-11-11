package week2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://en-gb.facebook.com//");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
				//Thread.sleep(5000);// Step 5: Add implicit wait
				driver.findElement(By.linkText("Create New Account")).click();// Step 6: Click on Create New Account button
				driver.findElement(By.name("firstname")).sendKeys("sri");
				driver.findElement(By.name("lastname")).sendKeys("nithya");// 
				driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("abc123");
				driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("abc123");
				WebElement findElement = driver.findElement(By.id("day"));
				Select s=new Select(findElement);
				s.selectByIndex(9);
				WebElement findElement2 = driver.findElement(By.id("month"));
				Select s1=new Select(findElement2);
				s1.selectByVisibleText("Jan");
				WebElement year = driver.findElement(By.id("year"));
				Select s2=new Select(year);
				s2.selectByValue("1989");
				driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
				driver.findElement(By.xpath("//button[@name='websubmit']")).click();
				
				
				
				//driver.findElement(By.xpath("//button[@name='websubmit']")).click();
				
				

	}

}
