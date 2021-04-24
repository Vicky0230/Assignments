package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadAndDuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		String text=driver.findElement(By.tagName("h2")).getText();

		System.out.println(text);

		String text1=driver.getTitle();
		if(text1.equals("Leaftaps - TestLeaf Automation Platform"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Expleo");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mari");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vignesh");

		WebElement dropdown2=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1 = new Select(dropdown2);
		dd1.selectByVisibleText("Partner");

		WebElement MarketingCampaign=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2=new Select(MarketingCampaign);
		dd2.selectByVisibleText("Demo Marketing Campaign");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("M");

		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("H");

		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MR");

		driver.findElement(By.name("birthDate")).sendKeys("04/30/94");

		driver.findElement(By.name("generalProfTitle")).sendKeys("Quality Associate");

		driver.findElement(By.name("departmentName")).sendKeys("Quality Associate");

		driver.findElement(By.name("annualRevenue")).sendKeys("400000");

		WebElement Currency=driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dd3=new Select(Currency);
		dd3.selectByVisibleText("INR - Indian Rupee");

		WebElement Industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd4=new Select(Industry);
		dd4.selectByVisibleText("Computer Software");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");

		WebElement Ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd5=new Select(Ownership);
		dd5.selectByVisibleText("Partnership");

		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("4001");

		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Chennai");

		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Selenium & locators");

		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Self_Learning");

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9500702882");

		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("04634");

		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Vicky");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mtm.vignesh.js@gmail.com");

		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://github.com/vicky230/MyJavaLearning");

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Vignesh TMV");

		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Vignesh TMV");

		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Chennai");

		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Chennai");

		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Vignesh MTM");


		WebElement Country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd6=new Select(Country);
		dd6.selectByVisibleText("India");

		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("627425");

		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("627425");


		WebElement State=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd7=new Select(State);
		dd7.selectByVisibleText("TAMILNADU");

		driver.findElement(By.className("smallSubmit")).click();

		driver.findElement(By.linkText("Duplicate Lead")).click();

		driver.findElement(By.xpath("//td//input[@name='companyName']")).clear();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ZOHO");

		driver.findElement(By.className("smallSubmit")).click();

		String CurrentCompanyname=driver.findElement(By.id("viewLead_companyName_sp")).getText();

		String updatedCompany=CurrentCompanyname.replaceAll("[^a-zA-Z]", " ");

		System.out.println(updatedCompany);

		if(updatedCompany.contains("ZOHO")) 
		{
			System.out.println("Duplicate lead_name updated");
		}
		else
		{
			System.out.println("Error with duplicate value");
		}

		driver.close();
	}

}
