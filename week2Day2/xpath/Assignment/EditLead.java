package week2Day2.xpath.Assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class EditLead {
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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Logistics");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ram12");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raghul");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]")).sendKeys("Ram12");
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		Thread.sleep(3000);
		String id = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
		String title = driver.getTitle();
		System.out.println("Title:" + title);
		String S2="View Lead | opentaps CRM";
		if(S2.equals(title))
		{
			System.out.println("Title is displayed");
		}
		else
		{
			System.out.println("Title is not displayed");
		}
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		String newS1 ="Systems";
		WebElement ele = driver.findElement(By.id("updateLeadForm_companyName"));
		ele.clear();
		ele.sendKeys(newS1);

		driver.findElement(By.className("smallSubmit")).click();
		String cName =driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Updated company name :" +cName);
		String c1Name = newS1 + " ("+id+")";
		System.out.println("Entered company name with id:"+ c1Name);
		if(c1Name.equals(cName))
		{
			System.out.println("Company name is verified");
		}
		else
		{
			System.out.println("Company name is not same");
		}
		driver.close();
	}
}
