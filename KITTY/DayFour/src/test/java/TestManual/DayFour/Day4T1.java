package TestManual.DayFour;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4T1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriverManager.edgedriver().setup();
       WebDriver driver=new EdgeDriver();
       driver.manage().window().maximize();
       driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
       driver.findElement(By.id("input-firstname")).sendKeys("Harini");
		driver.findElement(By.id("input-lastname")).sendKeys("Saran");
		driver.findElement(By.id("input-email")).sendKeys("hari@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("password");
		driver.findElement(By.id("input-newsletter-yes")).click();	
		
		Thread.sleep(5000);
		driver.quit();
	}




}
