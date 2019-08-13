import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParallelBrowingIE {
	
WebDriver driver;
	
	@Parameters("browser")
	
	@BeforeClass
	public void LaunchBrowser(String browser)
	{
//		driver= new FirefoxDriver();
//		driver.get("http://oca-azure-test:8108/login.aspx");
//		driver.manage().window().maximize();
		
		
			 
			  // If the browser is Firefox, then do this
		//Navdeep comment
		// Brinder Comment 
		// Brinder Comment 1
			 
			  if(browser.equalsIgnoreCase("firefox")) {
			 
			  driver = new FirefoxDriver();
			 
			  // If browser is IE, then do this   
			 
			  }else if (browser.equalsIgnoreCase("ie")) {
			 
			  // Here I am setting up the path for my IEDriver
			 
			  System.setProperty("webdriver.ie.driver", "D:\\Brinder\\BrowserDrivers\\IEDriverServer.exe");
			 
			  driver = new InternetExplorerDriver();
			  }else if (browser.equalsIgnoreCase("chrome")) {
				  
				  // Here I am setting up the path for my ChromeDriver
				 
				  System.setProperty("webdriver.chrome.driver", "D:\\Brinder\\BrowserDrivers\\chromedriver.exe");
				 
				  driver = new ChromeDriver();
			 
			  }
			  
			  driver.get("http://oca-mel-test:8108/login.aspx");
			  driver.manage().window().maximize();
			  
	}
	@Test
	public void Create_PrintProduct() throws InterruptedException
	{
//		driver= new FirefoxDriver();
//		driver.get("http://oca-azure-test:8108/login.aspx");
//		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='txtLogin']")).clear();
		driver.findElement(By.xpath("//input[@name='txtLogin']")).sendKeys("bpo.admin@yopmail.com");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='btnSign1']")).click();
		Thread.sleep(5000);
		
		driver.get("http://oca-azure-test:8108/BPO/ManagementCompany/RequestPrintQuote.aspx?i=2030&pn=My%20Print%20Orders&j=2162&prn=Request%20Print%20%20Quotes");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cpMain_cpMainContent_cmbClient_Input']")).clear();
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cpMain_cpMainContent_cmbClient_Input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='RMIT University - Australia']")).click();		
		
		/*
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cpMain_cpMainContent_cmbClient_Input']")).sendKeys("RMIT University - Australia");
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cpMain_cpMainContent_cmbClient_Input']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cpMain_cpMainContent_cmbClient_Input']")).sendKeys(Keys.ENTER);
		*/
		/*Select dropdown = new Select(driver.findElement(By.name("ctl00$ctl00$cpMain$cpMainContent$cmbClient")));
		dropdown.selectByValue("RMIT University - Australia");
		*/
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='ctl00$ctl00$cpMain$cpMainContent$cmbDepartment']")).clear();
		driver.findElement(By.xpath("//input[@name='ctl00$ctl00$cpMain$cpMainContent$cmbDepartment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='International']")).click();
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='ctl00$ctl00$cpMain$cpMainContent$cmbUser']")).clear();
		driver.findElement(By.xpath("//input[@name='ctl00$ctl00$cpMain$cpMainContent$cmbUser']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Amandeep SINGH']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cpMain_cpMainContent_cmbProdCntry_Input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cpMain_cpMainContent_cmbProdCntry_DropDown']/div/ul/li[2]/label/input")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cpMain_cpMainContent_cmbDelivery_Input']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cpMain_cpMainContent_cmbDelivery_Input']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[text()='India, Gurgaon']")).click();
		
		
		
		driver.findElement(By.xpath("//img[@id='cpMain_cpMainContent_imgAddProdName']")).click();
		Thread.sleep(2000);
		Random randominteger= new Random();
		int randomnumber=randominteger.hashCode();
		String ProductName= "International AutoPrint " +randomnumber;
		System.out.println(ProductName);
		driver.switchTo().frame("wnAddPrd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rtxtProductName']")).sendKeys(ProductName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ctl00_cpTopToolbar_rToolbarProduct']/div/div/div/ul/li[1]/a/span/span/span/img")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cpMain_cpMainContent_txtVariation']")).sendKeys("1st");
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cpMain_cpMainContent_txtIntRef']")).sendKeys("prodref "+ randomnumber );
		
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cpMain_cpMainContent_cmbProcess_Input']")).clear();
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cpMain_cpMainContent_cmbProcess_Input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Digital']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cpMain_cpMainContent_cmbType_Input']")).clear();
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cpMain_cpMainContent_cmbType_Input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Banners']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cpMain_cpMainContent_cmbProofMethod_Arrow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cpMain_cpMainContent_cmbProofMethod_DropDown']/div/ul/li[2]/label/input")).click();
		
		int num = randomnumber;

		while (num > 100){
		    num /= 10;
		}
		String Quantity= num+"00";
		System.out.println(Quantity);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='ctl00_ctl00_cpMain_cpMainContent_txtSpecs']")).sendKeys("Specify");
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cpMain_cpMainContent_grdQty_ctl00_ctl04_txtQty']")).sendKeys(Quantity);
		driver.findElement(By.xpath("//input[@id='cpMain_cpMainContent_btnSubmit']")).click();
		Thread.sleep(20000);
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id='popup_ok']")).click();
		/*String QuoteSave=driver.findElement(By.xpath("//div[text()='Quote has been saved successfully.']")).getText();
		
		if (QuoteSave.equals("Quote has been saved successfully."))
		{
			driver.findElement(By.xpath("//*[@id='popup_ok']")).click();
		}
		*/
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id='lnkLogout']/img")).click();
		
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
	}


}
