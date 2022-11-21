package week2Day2.xpath.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Eswar");
		driver.findElement(By.name("lastname")).sendKeys("Ashok");
		driver.findElement(By.name("reg_email__")).sendKeys("7897789000");
		driver.findElement(By.id("password_step_input")).sendKeys("abcabc");
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select date1 = new Select(date);
		date1.selectByIndex(22);
		WebElement day = driver.findElement(By.name("birthday_month"));
		Select day1 = new Select(day);
		day1.selectByVisibleText("May");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select year1 = new Select(year);
		year1.selectByValue("1999");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		 Thread.sleep(3000);
		 driver.close();
	}

}
