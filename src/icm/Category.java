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

public class Category {
	
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
	public void company()
	{
		
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
		
		//Adding New company name 
		
		WebElement addcompany = driver.findElement(By.id("disableCreateButton"));
		addcompany.click();		
		
		WebDriverWait wait3 = new WebDriverWait(driver, 200);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("field_name")));		
		WebElement username = driver.findElement(By.id("field_name"));
		//provide new company name 
		username.sendKeys("newcom9");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 200);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("field_street_address")));		
		WebElement street = driver.findElement(By.id("field_street_address"));
		//provide address
		street.sendKeys("6th cross street");
		
		WebDriverWait wait5 = new WebDriverWait(driver, 200);
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("field_postalcode")));		
		WebElement pcode = driver.findElement(By.id("field_postalcode"));
		//provide postal code		
		pcode.sendKeys("632602");
		
		WebDriverWait wait6 = new WebDriverWait(driver, 200);
		wait6.until(ExpectedConditions.elementToBeClickable(By.id("field_registration_number")));		
		WebElement regno = driver.findElement(By.id("field_registration_number"));
		//provide reg no
		regno.sendKeys("2222");
		
		saveclose();
		
		close();

	}
	
	@Test(priority=3,enabled=true)
	public void category()
	{
		master();
		
		driver.switchTo().defaultContent();		
		WebElement category = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[3]/li/ul/li[2]/a"));
		category.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 200);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("disableCategoryCreateButton")));		
		WebElement addcategory = driver.findElement(By.id("disableCategoryCreateButton"));
		//Add new category
		addcategory.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, 200);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("field_name")));	
		//provide new category name 
		WebElement name = driver.findElement(By.id("field_name"));
		name.sendKeys("newcat9");
		
		WebDriverWait wait3 = new WebDriverWait(driver, 200);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("field_description")));		
		WebElement description = driver.findElement(By.id("field_description"));
		//provide description
		description.sendKeys("Qa category description");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 200);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/form/div[3]/button[3]")));
		
		saveclose();
		
		close();
				
	}
	
	@Test(priority=4,enabled=true)
	public void location()
	{
		master();
		
		WebElement location = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[3]/li/ul/li[1]"));
		location.click();
		
		//Add new location 
		
		WebElement addlocation = driver.findElement(By.id("disableLocationCreateButton"));
		addlocation.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 200);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("field_name")));
		//provide new location name
		WebElement name = driver.findElement(By.id("field_name"));
		name.sendKeys("newloc9");
		
		WebDriverWait wait2 = new WebDriverWait(driver, 200);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("desc")));
		//provide description 
		WebElement description = driver.findElement(By.id("desc"));
		description.sendKeys("new qa location");
		
		WebDriverWait wait3 = new WebDriverWait(driver, 200);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("field_longitude")));
		//provide longitude 
		WebElement longitude = driver.findElement(By.id("field_longitude"));
		longitude.sendKeys("90.33");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 200);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("field_latitude")));
		//provide latitude
		WebElement latitude = driver.findElement(By.id("field_latitude"));
		latitude.sendKeys("80.33");
		
		saveclose();
		
		close();

	}
	
	@Test(priority=5,enabled=true)
	public void catlocrelation() throws InterruptedException 
	{
		master();		
		
		WebElement category = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[3]/li/ul/li[2]/a"));
		category.click();	
		
		WebDriverWait wait1 = new WebDriverWait(driver, 200);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("searchQuery")));	
		//Search already existing category
		WebElement catname = driver.findElement(By.id("searchQuery"));
		catname.sendKeys("newcat9");
		
		//Search the provide category 
		WebElement search = driver.findElement(By.xpath("//*[@id='searchForm']/form/button[1]"));
		search.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, 200);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/table/tbody/tr/td[2]/div/div")));
		
		//Select the searched category
		WebElement select = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/table/tbody/tr/td[2]/div/div"));
		select.click();
		
		
		WebDriverWait wait3 = new WebDriverWait(driver, 200);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disableAllCategoryElement']/div/ul/li[5]")));
		
		//Edit the category
		WebElement selectloc = driver.findElement(By.xpath("//*[@id='disableAllCategoryElement']/div/ul/li[5]"));
		selectloc.click();
		
		WebDriverWait wait4 = new WebDriverWait(driver, 200);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='location']/div[1]/div/div/div/button")));
		
		//Click on the Locations
		
		WebElement addloc = driver.findElement(By.xpath("//*[@id='location']/div[1]/div/div/div/button"));
		addloc.click();
		
		WebDriverWait wait5 = new WebDriverWait(driver, 200);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disableAllCategoryLocationElement']/div[2]/typeahead/div/ul[1]/li/input")));
		
		//Click on the Add location button 
		
		WebElement addlocation = driver.findElement(By.xpath("//*[@id='disableAllCategoryLocationElement']/div[2]/typeahead/div/ul[1]/li/input"));
		addlocation.sendKeys("newloc9");
		
		//Auto search and location details and select 
		WebElement addloca = driver.findElement(By.xpath("//*[@id='disableAllCategoryLocationElement']/div[2]/typeahead/div/ul[2]"));
		addloca.click();		
		
		saveclose();
		
		WebDriverWait wait6 = new WebDriverWait(driver, 200);
		wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/form/div[1]/button"))).isDisplayed();
		
		Thread.sleep(2000); 				
		close();
		
	}
	
	
	@Test(priority=6,enabled=true)
	public void user() throws InterruptedException 
	{
		try{
		//Click on the user tab field 
		WebDriverWait wait1 = new WebDriverWait(driver, 200);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[2]/li")));
		
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[2]/li")).click();
		//select the users
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[2]/li/ul/li[1]")).click();
		//select the new user button
		driver.findElement(By.xpath("//*[@id='disableUserCreateButton']")).click();
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		
		//Enter the user name
		driver.findElement(By.xpath("//*[@id='details']/div[3]/div[1]/input")).sendKeys("newus9");
		//Enter the first name
		driver.findElement(By.xpath("//*[@id='details']/div[4]/div[1]/input")).sendKeys("newus");
		//Enter the last name
		driver.findElement(By.xpath("//*[@id='details']/div[5]/div[1]/input")).sendKeys("newus");
		//Enter the email
		driver.findElement(By.xpath("//*[@id='details']/div[6]/div[1]/input")).sendKeys("newus9@localhost");	
		//Search the existing company and select 
		driver.findElement(By.name("CompanyAutocomplete")).sendKeys("newcom9" + Keys.DOWN + Keys.ENTER);
		}
		catch(Exception e)
		{
			
		}
		Thread.sleep(3000);
       
        	saveclose();
            Thread.sleep(2000);
            close();         	
       
               
        
	}
	
	
	
	@Test(priority=7,enabled=true)
	public void usergroup() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[2]/a/span[2]")).click();
		
		try{			
				
		Thread.sleep(2000);
		//Click on the user tab field 		
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[2]/li")).click();
		//Click on the user group tab field 
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[2]/li/ul/li[2]")).click();
		//Click on the new user group  button 
		driver.findElement(By.xpath("//*[@id='disableUsergroupCreateButton']")).click();
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		//Enter the user group name
		driver.findElement(By.xpath("//*[@id='field_name']")).sendKeys("newusg9");
		}
		catch(Exception e)
		{
			
		}
				
		saveclose();		
		close();
		
		
		
	}
	
	@Test(priority=8,enabled=true)
	public void uusergrouprelation() throws InterruptedException 	
	{
		
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[2]/a/span[2]")).click();
		
		try{		
		
		//Click on the user tab field 
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[2]/li")).click();
		//Click on the user tab field
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[2]/li/ul/li[1]")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("searchQuery"))); 
        //Search the existing user 
        WebElement user = driver.findElement(By.id("searchQuery"));
        user.sendKeys("newus2");
        
        WebDriverWait wait2= new WebDriverWait(driver, 200);
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='searchForm']/form/button[1]")));
        //Click on the search button 
        WebElement search = driver.findElement(By.xpath("//*[@id='searchForm']/form/button[1]"));
        search.click();
                
        WebDriverWait wait3= new WebDriverWait(driver, 200);
        wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/table/tbody/tr"))); 
        //Select the existing user search result displayed
        WebElement click = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/table/tbody/tr"));
        click.click();	
        
        WebDriverWait wait4= new WebDriverWait(driver, 200);
        wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/form/div[2]/ul/li[3]/a")));
        //Select the user group tab
        WebElement ugroup = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[2]/ul/li[3]/a"));
        ugroup.click();
        
        //Search existing user group name and select the user group
        driver.findElement(By.name("UsergroupAutocomplete")).sendKeys("newusg9" + Keys.DOWN + Keys.ENTER);
        WebDriverWait wait5= new WebDriverWait(driver, 200);
        wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='usergroup']/div[1]/div/div[1]/div/div/button")));        
        
        //Add user to the group
        WebElement add = driver.findElement(By.xpath("//*[@id='usergroup']/div[1]/div/div[1]/div/div/button"));
        add.click();
        Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
        
        
        close();
                
        
	}
	
	@Test(priority=9,enabled=true)
	public void template() throws InterruptedException 
	{
		try{
				
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		
		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[2]")));
		//Click on the template tab
		WebElement template = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[2]"));
		template.click();
		//Click on the New template button 
		WebElement addtemplate = driver.findElement(By.id("disableTemplateCreateButton"));
		addtemplate.click();
				
		//Enter the new template name 
		driver.findElement(By.id("field_Name")).sendKeys("newtemp9");
		//Enter the description
		driver.findElement(By.id("field_Description")).sendKeys("Comments for qa temp");
		//Search and select the existing category 
		driver.findElement(By.name("categoryAutocomplete")).sendKeys("newcat9" + Keys.DOWN + Keys.ENTER);
	
     
        WebDriverWait wait2 = new WebDriverWait(driver, 200);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='field_validFrom']")));
		//Enter the valid from date
		WebElement fromdate = driver.findElement(By.xpath("//*[@id='field_validFrom']"));
		fromdate.sendKeys("01-05-2017"); 	
		
		WebDriverWait wait3 = new WebDriverWait(driver, 200);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='field_validTo']")));	
		//Enter the valid to date
		WebElement todate = driver.findElement(By.xpath("//*[@id='field_validTo']"));
		todate.sendKeys("30-05-2017"); 	
		
		
		driver.findElement(By.id("field_checkinType")).click();
		
		WebDriverWait wait4 = new WebDriverWait(driver, 200);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("field_checkinType")));
		//Select the check-in type from drop down
		WebElement checkin = driver.findElement(By.id("field_checkinType"));
		checkin.sendKeys("GPS");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait5 = new WebDriverWait(driver, 200);
        wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disableAllTemplateElement']/div[2]/ul/li[2]/a")));
        
        //Click on the request tab
        WebElement reqtemplate = driver.findElement(By.xpath("//*[@id='disableAllTemplateElement']/div[2]/ul/li[2]/a"));
        reqtemplate.click();
        
		WebDriverWait wait6= new WebDriverWait(driver, 200);
        wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='field_request_name']")));
        
        WebElement name = driver.findElement(By.xpath("//*[@id='field_request_name']"));
        name.click();
        //Enter the user name 
        driver.findElement(By.xpath("//*[@id='field_request_name']")).sendKeys("newreq");
        
        WebDriverWait wait7 = new WebDriverWait(driver, 200);
        wait7.until(ExpectedConditions.elementToBeClickable(By.id("field_usergroup"))); 
        //Select the drop down from user group
        WebElement ugroup = driver.findElement(By.id("field_usergroup"));
        ugroup.sendKeys("newusg9");
		}
		catch(Exception e)
		{
			
		}
      
        	saveclose();
        	close();
          
      
	}
	
	
	@Test(priority=10,enabled=true)
	public void contract() throws InterruptedException 
	{
		try{
		//Select the company tab 
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[1]/li")).click();
		//Select the contract tab
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[1]/li/ul/li[2]")).click();
		//Create the contract
		driver.findElement(By.id("disableContractCreateButton")).click();
		
		//Enter the new name for contract 
		driver.findElement(By.id("field_name")).sendKeys("newcontr9");
		//Enter the existing company name and select
		driver.findElement(By.name("CompanyAutocomplete")).sendKeys("newcom9" + Keys.DOWN + Keys.ENTER);
		//Enter the existing category and select 
		driver.findElement(By.name("CategoryAutocomplete")).sendKeys("newcat9" + Keys.DOWN + Keys.ENTER);
	    
		//Enter the existing location and select 
        driver.findElement(By.xpath("//*[@id='details']/div[4]/div[1]/typeahead/div/ul[1]/li/input")).sendKeys("newloc9" + Keys.DOWN + Keys.ENTER);
        //Enter the start date
        driver.findElement(By.xpath("//*[@id='field_start_date']")).sendKeys("01-05-2017");
        //Enter the end date
        driver.findElement(By.xpath("//*[@id='field_end_date']")).sendKeys("30-05-2017");
		}
		catch(Exception e)
		{
			
		}
	  	saveclose();
       	close();
        	
    }

	@AfterTest()
	public void quit()
	{
		System.out.println("Execution completed succesfully");
	
	}

}