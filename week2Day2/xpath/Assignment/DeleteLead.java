package week2Day2.xpath.Assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Comp");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("comp2");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("(//input[contains(@name,'Number')])[4]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		Thread.sleep(3000);
	    String text4 = driver.findElement(By.xpath("//div[contains(@class,'partyId')]/a[@class='linktext']")).getText();
		System.out.println(text4);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text4);
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text2);
		String text3 = "Null Records";
		if(text2.equals(text3))
		{
			System.out.println("Record Deleted Successfully");
		}
		else
		{
			System.out.println("Records not deleted");
			
		}
		driver.close();
	}
}