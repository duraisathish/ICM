package icm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ICMWEB {
	
	public WebDriver driver = new ChromeDriver();
	
	@BeforeTest()
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	}

	public void master()
	{
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);		
		driver.switchTo().defaultContent();
		
		WebDriverWait wait7 = new WebDriverWait(driver, 200);
		wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[3]/li")));		
		WebElement master = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[3]/li"));
		master.click();
	}
	
	public void close()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/form/div[1]/button")));		
		WebElement close = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[1]/button"));
		close.click(); 
	}
	
	public void saveclose()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/form/div[3]/button[3]")));		
		WebElement saveclose = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[3]/button[3]"));
		saveclose.click();
	}
	
	
	@Test(priority=1,enabled=true)
	public void Login() throws InterruptedException
	{

		driver.get("http://220.225.128.97:9100");		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.switchTo().defaultContent();		
		driver.manage().window().maximize();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("username")));		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("password")));		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("admin");
		
		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[3]/form/button")));		
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[3]/form/button"));
		login.click();		
		
	}
	
	
	@Test(priority=2,enabled=true)
	public void Company()
	{
		try{
			
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		driver.switchTo().defaultContent();
						
		WebDriverWait wait1 = new WebDriverWait(driver, 200);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[1]/li")));		
		WebElement company = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[1]/li"));
		company.click();
		
		WebElement company2 = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[1]/li/ul/li[1]/a/span[2]"));
		company2.click();	
		WebDriverWait wait2 = new WebDriverWait(driver, 200);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("disableCreateButton")));
		
		WebElement addcompany = driver.findElement(By.id("disableCreateButton"));
		addcompany.click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 200);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("field_name")));		
		WebElement username = driver.findElement(By.id("field_name"));
		username.sendKeys("NewTestCompany19");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 200);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("field_street_address")));		
		WebElement street = driver.findElement(By.id("field_street_address"));
		street.sendKeys("6th cross street");
		
		WebDriverWait wait5 = new WebDriverWait(driver, 200);
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("field_postalcode")));		
		WebElement pcode = driver.findElement(By.id("field_postalcode"));
		pcode.sendKeys("632602");
		
		WebDriverWait wait6 = new WebDriverWait(driver, 200);
		wait6.until(ExpectedConditions.elementToBeClickable(By.id("field_registration_number")));		
		WebElement regno = driver.findElement(By.id("field_registration_number"));
		regno.sendKeys("2222");
		
		saveclose();
		
		close();
		}
		catch(Exception e)
		{
			
		}
	}
	
	@Test(priority=3,enabled=true)
	public void Category()
	{
		try{
			
		
		master();
		
		driver.switchTo().defaultContent();		
		WebElement category = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[3]/li/ul/li[2]/a"));
		category.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 200);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("disableCategoryCreateButton")));		
		WebElement addcategory = driver.findElement(By.id("disableCategoryCreateButton"));
		addcategory.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, 200);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("field_name")));		
		WebElement name = driver.findElement(By.id("field_name"));
		name.sendKeys("NewCategory19");
		
		WebDriverWait wait3 = new WebDriverWait(driver, 200);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("field_description")));		
		WebElement description = driver.findElement(By.id("field_description"));
		description.sendKeys("Qa category description");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 200);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/form/div[3]/button[3]")));
		
		saveclose();
		
		close();
		}
		catch(Exception e)
		{
			
		}
				
	}
	
	@Test(priority=4,enabled=true)
	public void Location()
	{
		try{
			
		
		master();
		
		WebElement location = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[3]/li/ul/li[1]"));
		location.click();
		
		WebElement addlocation = driver.findElement(By.id("disableLocationCreateButton"));
		addlocation.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 200);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("field_name")));
		
		WebElement name = driver.findElement(By.id("field_name"));
		name.sendKeys("NewLocation19");
		
		WebDriverWait wait2 = new WebDriverWait(driver, 200);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("desc")));		
		WebElement description = driver.findElement(By.id("desc"));
		description.sendKeys("new qa location");
		
		WebDriverWait wait3 = new WebDriverWait(driver, 200);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("field_longitude")));		
		WebElement longitude = driver.findElement(By.id("field_longitude"));
		longitude.sendKeys("90.33");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 200);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("field_latitude")));		
		WebElement latitude = driver.findElement(By.id("field_latitude"));
		latitude.sendKeys("80.33");
		
		saveclose();
		
		close();
		}
		catch(Exception e)
		{
			
		}

	}
	
	@Test(priority=5,enabled=true)
	public void CategoryLocationRelation() throws InterruptedException 
	{
		try{
			
		master();		
		
		WebElement category = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[3]/li/ul/li[2]/a"));
		category.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 200);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("searchQuery")));		
		WebElement catname = driver.findElement(By.id("searchQuery"));
		catname.sendKeys("NewCategory19");
		
		WebElement search = driver.findElement(By.xpath("//*[@id='searchForm']/form/button[1]"));
		search.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, 200);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/table/tbody/tr/td[2]/div/div")));		
		WebElement select = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/table/tbody/tr/td[2]/div/div"));
		select.click(); 
		
		
		WebDriverWait wait3 = new WebDriverWait(driver, 200);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disableAllCategoryElement']/div/ul/li[5]")));		
		WebElement selectloc = driver.findElement(By.xpath("//*[@id='disableAllCategoryElement']/div/ul/li[5]"));
		selectloc.click();
		
		WebDriverWait wait4 = new WebDriverWait(driver, 200);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='location']/div[1]/div/div/div/button")));		
		WebElement addloc = driver.findElement(By.xpath("//*[@id='location']/div[1]/div/div/div/button"));
		addloc.click();
		
		addloc.click();
		
		WebDriverWait wait5 = new WebDriverWait(driver, 200);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disableAllCategoryLocationElement']/div[2]/typeahead/div/ul[1]/li/input")));		
		WebElement addlocation = driver.findElement(By.xpath("//*[@id='disableAllCategoryLocationElement']/div[2]/typeahead/div/ul[1]/li/input"));
		addlocation.sendKeys("NewLocation19");
		
		WebElement addloca = driver.findElement(By.xpath("//*[@id='disableAllCategoryLocationElement']/div[2]/typeahead/div/ul[2]"));
		addloca.click();		
		
		saveclose();
		
		WebDriverWait wait6 = new WebDriverWait(driver, 200);
		wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/form/div[1]/button"))).isDisplayed();
		
		Thread.sleep(2000); 				
		close();
		}
		catch (Exception e)
		{
			
		}
		
	}
	
	@Test(priority=6,enabled=true)
	public void Template() throws InterruptedException 
	{
		try{
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[2]")));
		
		WebElement template = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[2]"));
		template.click();
		WebElement addlocation = driver.findElement(By.id("disableTemplateCreateButton"));
		addlocation.click();
		
		driver.findElement(By.id("field_Name")).sendKeys("NewTemplate19");
		driver.findElement(By.id("field_Description")).sendKeys("Comments for qa temp");		 
		driver.findElement(By.name("categoryAutocomplete")).sendKeys("NewCategory19" + Keys.DOWN + Keys.ENTER);
	
     
        WebDriverWait wait2 = new WebDriverWait(driver, 200);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='field_validFrom']")));
		WebElement fromdate = driver.findElement(By.xpath("//*[@id='field_validFrom']"));
		fromdate.sendKeys("01-05-2017"); 	
		
		WebDriverWait wait3 = new WebDriverWait(driver, 200);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='field_validTo']")));			
		WebElement todate = driver.findElement(By.xpath("//*[@id='field_validTo']"));
		todate.sendKeys("30-05-2017"); 	
		
		driver.findElement(By.id("field_checkinType")).click();
		
		WebDriverWait wait4 = new WebDriverWait(driver, 200);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("field_checkinType")));		
		WebElement checkin = driver.findElement(By.id("field_checkinType"));
		checkin.sendKeys("GPS");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait5 = new WebDriverWait(driver, 200);
        wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disableAllTemplateElement']/div[2]/ul/li[2]/a")));        
        WebElement reqtemplate = driver.findElement(By.xpath("//*[@id='disableAllTemplateElement']/div[2]/ul/li[2]/a"));
        reqtemplate.click();
        
		WebDriverWait wait6= new WebDriverWait(driver, 200);
        wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='field_request_name']")));        
        WebElement name = driver.findElement(By.xpath("//*[@id='field_request_name']"));
        name.click();
        
        driver.findElement(By.xpath("//*[@id='field_request_name']")).sendKeys("qa request");
        
        WebDriverWait wait7 = new WebDriverWait(driver, 200);
        wait7.until(ExpectedConditions.elementToBeClickable(By.id("field_usergroup")));       
        WebElement ugroup = driver.findElement(By.id("field_usergroup"));
        ugroup.sendKeys("Newcontractor19");
        
        saveclose();
        
        close();
		}
		catch(Exception e)
		{
			
		}
      
	}
	
	@Test(priority=7,enabled=true)
	public void User() throws InterruptedException
	{
		try{
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[2]/li")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[2]/li/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id='disableUserCreateButton']")).click();
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='details']/div[3]/div[1]/input")).sendKeys("Newuser19");
		
		driver.findElement(By.xpath("//*[@id='details']/div[4]/div[1]/input")).sendKeys("Qauser");
		driver.findElement(By.xpath("//*[@id='details']/div[5]/div[1]/input")).sendKeys("Qauser");
		driver.findElement(By.xpath("//*[@id='details']/div[6]/div[1]/input")).sendKeys("Newuser19@localhost");	
		
		driver.findElement(By.name("CompanyAutocomplete")).sendKeys("NewTestCompany19" + Keys.DOWN + Keys.ENTER);
		Thread.sleep(3000);
        
        saveclose();       
        
        if(!driver.findElements(By.xpath("/html/body/div[1]/div/div/form/div[1]/button")).isEmpty()){
            //THEN CLICK ON THE SUBMIT BUTTON
        	close();
        }else{
            //DO SOMETHING ELSE AS SUBMIT BUTTON IS NOT THERE
        }
        
        }
		catch(Exception e)
		{
			
		}
	}				
	
	@Test(priority=8,enabled=true)
	public void UserGroup() 
	{	try
		{
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[2]")));
		
		WebElement template = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[2]"));
		template.click();
		
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[2]/li")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[2]/li/ul/li[2]/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='disableUsergroupCreateButton']")).click();
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='field_name']")).sendKeys("Newgroup19");
		
		saveclose();		
		close();
		}
		catch(Exception e)
		{
			
		}
			
	}
	
	@Test(priority=9,enabled=true)
	public void UserGroupRelation() throws InterruptedException 
	{
		try{
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[2]")));
		
		WebElement template = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[2]"));
		template.click();
		
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[2]/li")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[2]/li/ul/li[1]")).click();
		
		WebDriverWait wait1= new WebDriverWait(driver, 200);
        wait1.until(ExpectedConditions.elementToBeClickable(By.id("searchQuery")));        
        WebElement user = driver.findElement(By.id("searchQuery"));
        user.sendKeys("Newuser19");
        
        WebDriverWait wait2= new WebDriverWait(driver, 200);
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='searchForm']/form/button[1]")));        
        WebElement search = driver.findElement(By.xpath("//*[@id='searchForm']/form/button[1]"));
        search.click(); 
        
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        
        if(!driver.findElements(By.xpath("/html/body/div[2]/div/div/div[2]/table/tbody/tr")).isEmpty()){
            //THEN CLICK ON THE SUBMIT BUTTON
        	WebDriverWait wait3= new WebDriverWait(driver, 200);
            wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/table/tbody/tr")));        
            WebElement click = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/table/tbody/tr"));
            click.isDisplayed();
            click.click();
            click.click();
        	
        }else{
            //DO SOMETHING ELSE AS SUBMIT BUTTON IS NOT THERE
        	WebDriverWait wait3= new WebDriverWait(driver, 200);
            wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/table/tbody/tr/td[1]")));        
            WebElement click = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/table/tbody/tr/td[1]"));
            click.isDisplayed();
            click.click();
            click.click();
        }
                
         
		}
		catch(Exception e)
		{
			
		}        
        
		driver.switchTo().defaultContent();
		
        WebDriverWait wait4= new WebDriverWait(driver, 200);
        wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/form/div[2]/ul/li[2]/a")));        
        WebElement ugroup = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[2]/ul/li[2]/a"));
        ugroup.isDisplayed();        
        ugroup.click(); 
        ugroup.click();        
        
        driver.findElement(By.name("UsergroupAutocomplete")).sendKeys("Newgroup19" + Keys.DOWN + Keys.ENTER);
        WebDriverWait wait5= new WebDriverWait(driver, 200);
        wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='usergroup']/div[1]/div/div[1]/div/div/button")));        
        WebElement add = driver.findElement(By.xpath("//*[@id='usergroup']/div[1]/div/div[1]/div/div/button"));
        add.click();
        Thread.sleep(2000);
        
        close();
		
	}
	
	@Test(priority=10,enabled=true)
	public void Contract() throws InterruptedException 
	{
		try
		{
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[1]/li")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[1]/li/ul/li[2]")).click();
		driver.findElement(By.id("disableContractCreateButton")).click();
		
		driver.findElement(By.id("field_name")).sendKeys("Newcontractor19");
		driver.findElement(By.name("CompanyAutocomplete")).sendKeys("NewTestCompany19" + Keys.DOWN + Keys.ENTER);
		driver.findElement(By.name("CategoryAutocomplete")).sendKeys("NewCategory19" + Keys.DOWN + Keys.ENTER);
	    
        
        driver.findElement(By.xpath("//*[@id='details']/div[4]/div[1]/typeahead/div/ul[1]/li/input")).sendKeys("NewLocation19" + Keys.DOWN + Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='field_start_date']")).sendKeys("01-05-2017");	
        driver.findElement(By.xpath("//*[@id='field_end_date']")).sendKeys("30-05-2017");
        Thread.sleep(2000);
        saveclose();
        Thread.sleep(2000);
        close();
		}
		catch(Exception e)
		{
			
		}
    }

	@AfterTest()
	public void quit()
	{
		System.out.println("Execution completed succesfully");
		driver.quit();
	
	}

}