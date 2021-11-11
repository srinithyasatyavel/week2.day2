import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SalesForce:
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver=new ChromeDriver();
		// Step 2: Launch the chromebrowser
			// Step 3: Load the URL 

			           driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk"); //www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
			driver.manage().window().maximize();// Step 4: Maximise the window
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));// Step 5: Add implicit wait
			driver.findElement(By.name("UserFirstName")).sendKeys("ria");
			driver.findElement(By.name("UserLastName")).sendKeys("sen");
			driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("wbz@gmail.com");
			WebElement jobtitle = driver.findElement(By.name("UserTitle"));
			Select s=new Select(jobtitle);
			driver.findElement(By.name("CompanyName")).sendKeys("Salesforce");
			WebElement findElement = driver.findElement(By.name("CompanyEmployees"));
			Select s1=new Select(findElement);
			s1.selectByValue("9");
			driver.findElement(By.name("UserPhone")).sendKeys("9898974563");
			WebElement element = driver.findElement(By.name("CompanyCountry"));
			Select s2=new Select(element);
			s2.selectByValue("AF");
			driver.findElement(By.className("checkbox-ui-label")).click();
		driver.close();
			
			// Step 6: Fill in all the text boxes"
			// Step 7: Handle all the dropdowns
			// Step 8: Click the check box
			// Step 9: Close the browser
			//*Note: No need click Start my freeTrial

	}

}
