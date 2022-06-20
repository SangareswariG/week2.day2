package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangareswari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shaa");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("AssociateConsultant");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Communicate with clients and best in automation testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sangariprem@gmail.com");
		Thread.sleep(2000);
		
		Select sel1=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		sel1.selectByVisibleText("California");
		Thread.sleep(2000);
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys IND Pvt.Ltd");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SANGARESWARI");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		Thread.sleep(2000);
		String Title=driver.getTitle();
		System.out.println(Title);
		
		
		
		
		
		
		
		
		

	}

}
