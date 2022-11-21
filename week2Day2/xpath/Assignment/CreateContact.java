package week2Day2.xpath.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Eswar");
		driver.findElement(By.id("lastNameField")).sendKeys("Ashok");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Eswarl");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ashok2");
		driver.findElement(By.name("departmentName")).sendKeys("Auto");
		driver.findElement(By.id("createContactForm_description")).sendKeys("text");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("eswar@mail.com");
		WebElement element1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select element = new Select(element1);
		element.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("desc");
		driver.findElement(By.xpath("//input[contains(@class,'small')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}

