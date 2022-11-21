package week2Day2.xpath.Assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DuplicateLead {
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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("EA Sys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Eswar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ashok");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@mail.com");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("xyz@mail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		Thread.sleep(3000);
		String dupName = driver.findElement(By.xpath("//div[contains(@class,'firstName')]/a[@class='linktext']")).getText();
		System.out.println(dupName);
		driver.findElement(By.xpath("//div[contains(@class,'firstName')]/a[@class='linktext']")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		System.out.println("Title:" + title);
		String S2="Duplicate Lead | opentaps CRM";
		if(S2.equals(title))
		{
			System.out.println("Title is displayed");
		}
		else
		{
			System.out.println("Title is not displayed");
		}
		driver.findElement(By.name("submitButton")).click();
		String fistName= driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Duplicate lead name:"+ fistName);
		if(dupName.equals(fistName))
		{
			System.out.println("First name is same");
		}
		else
		{
			System.out.println("First name is not same");
		}
		driver.close();
	}

}

