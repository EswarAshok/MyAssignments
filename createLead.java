package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("comp");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("comp1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("comp2");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("comp3");
		driver.findElement(By.name("departmentName")).sendKeys("CSE");
		driver.findElement(By.name("description")).sendKeys("Computer Science Education");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@xyz.com");
		WebElement option =driver.findElement(By.name("generalStateProvinceGeoId"));
		Select opt = new Select(option);
		opt.selectByVisibleText("New York");
		/*String title = driver.getTitle();
		System.out.println(title);*/
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
