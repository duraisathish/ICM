package icm;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Requestor {
	
	public AndroidDriver driver;

	 @SuppressWarnings("rawtypes")
	@BeforeTest
	 public void setUp() throws MalformedURLException { 
		 
	 //Set ICM app folder path. This statement will refer project's folder path.
	 File classpathRoot = new File(System.getProperty("user.dir"));
		  
	  //Set folder name "Apps" where .apk file is stored.
	  File appDir = new File(classpathRoot, "APK");
		  
	  //Set Zonar .apk file name.  
	  File app = new File(appDir, "ICM.apk");		 
		 
	  // Created object of DesiredCapabilities class.
	  DesiredCapabilities capabilities = new DesiredCapabilities();

	  // Set android deviceName desired capability. Set your device name.
	  capabilities.setCapability("deviceName", "494dd0f20803");

	  // Set BROWSER_NAME desired capability. It's Android in our case here.
	  capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

	  // Set android VERSION desired capability. Set your mobile device's OS version.
	  capabilities.setCapability(CapabilityType.VERSION, "6.0.1");
	  
	  // Set android platformName desired capability. It's Android in our case here.
	  capabilities.setCapability("platformName", "Android");
	  
	  //Set .apk file's path capabilities.
	  capabilities.setCapability("app", app.getAbsolutePath());

	  // Set android appPackage desired capability. It is
	  // com.android.calculator2 for calculator application.
	  // Set your application's appPackage if you are using any other app.
	  capabilities.setCapability("appPackage", "com.ionicframework.imsv1630062");

	  // Set android appActivity desired capability. It is
	  // com.android.calculator2.Calculator for calculator application.
	  // Set your application's appPackage if you are using any other app.
	  capabilities.setCapability("appActivity", "com.ionicframework.imsv1630062.MainActivity");

	  // Created object of RemoteWebDriver will all set capabilities.
	  // Set appium server address and port number in URL string.
	  // It will launch calculator app in android device.
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 }
	 
	 @Test(priority=1,enabled=true)
	 public void login() throws InterruptedException
	 {
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @text='Email']")).isDisplayed();
		 		 
		 driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @text='Email']")).sendKeys("admin");
		 
		 driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @text='Password']")).sendKeys("admin");
		 
		 driver.findElement(By.xpath("//*[@class='android.widget.Button' and @content-desc='LOGIN ']")).click();
		
	 }
	 @Test(priority=2,enabled=false)
	 public void ClickonNewRequest()
	 {
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		 
		 WebElement NewRequest = driver.findElement(By.xpath("//*[@class='android.view.View' and @content-desc='New Request']"));
		 NewRequest.isDisplayed();
		 
		 NewRequest.click();		 
	 }
	 @Test(priority=3,enabled=false)
	 public void ChooseFaultType()
	 {
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		 
		 //Choosing the fault type
		 WebElement Lift = driver.findElement(By.xpath("//*[@class='android.widget.Button' and @content-desc='Lift ']"));
		 Lift.isDisplayed();
		 
		 Lift.click();
		 
		 //Selecting Lift Maintence
		 WebElement LiftMaintenance = driver.findElement(By.xpath("//*[@class='android.widget.Button' and @content-desc='Lift Maintenance ']"));
		 LiftMaintenance.isDisplayed();
		 
		 LiftMaintenance.click();
		 
		 //Select location of the fault		 
		 WebElement SelectManually = driver.findElement(By.xpath("//*[@class='android.widget.Button' and @content-desc='redo outline SELECT MANUALLY ']"));
		 SelectManually.isDisplayed();
		 
		 SelectManually.click();
		 
		 //Select where is the location of the fault 		 
		 WebElement SelectLocation = driver.findElement(By.xpath("//*[@class='android.widget.Button' and @content-desc='AKS Tower ']"));
		 SelectLocation.isDisplayed();
		 
		 SelectLocation.click();
		 
		 //Select the terminal 
		 WebElement Terminal1 = driver.findElement(By.xpath("//*[@class='android.widget.Button' and @content-desc='Terminal 1 ']"));
		 Terminal1.isDisplayed();
		 
		 Terminal1.click();
		 
		 //Select the lift location 
		 
		 WebElement LiftA = driver.findElement(By.xpath("//*[@class='android.widget.Button' and @content-desc='Lift A ']"));
		 LiftA.isDisplayed();
		 
		 LiftA.click();
	 }
	 
	 @Test(priority=4,enabled=false)
	 public void Priority()
	 {
		 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 	Dimension size = driver.manage().window().getSize();
	        int x = size.getWidth() / 2;
	        int starty = (int) (size.getHeight() * 0.60);
	        int endy = (int) (size.getHeight() * 0.10);
	        driver.swipe(x, starty, x, endy, 2000);	 	        
	        
	        //Select priority
			 
			 WebElement priority = driver.findElement(By.xpath("//*[@class='android.widget.Spinner' and @content-desc='Priority *']"));
			 priority.isDisplayed();
			 
			 priority.click();
			 
			 //Select Urgent
			 
			 WebElement urgent = driver.findElement(By.xpath("//*[@class='android.widget.RadioButton' and @content-desc='Urgent ']"));
			 urgent.isDisplayed();
			 
			 urgent.click();
			 
			 //Confirm priority 
			 
			 WebElement ok = driver.findElement(By.xpath("//*[@class='android.widget.Button' and @content-desc='OK ']"));
			 ok.isDisplayed();
			 
			 ok.click();
			 
			 //Comment priority 
			 
			 WebElement text = driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @text='Description *']"));
			 text.isDisplayed();
			 
			 text.sendKeys("Test");
			 
			 driver.hideKeyboard();
			 
			 //level of incident
			 
			 WebElement Level = driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @text='Which Level Incident InformationIncident InformationIncident InformationIncident InformationIncident Information Incident Information Incident Information *']"));
			 Level.isDisplayed();
			 
			 Level.sendKeys("Test");
			 
			 driver.hideKeyboard();
	 }	 
	 
	 
	 @Test(priority=5,enabled=false)
	 public void InitialInformation()
	 {
		 
		 //Select DropDown
		 
		 WebElement DropDown = driver.findElement(By.xpath("//*[@class='android.widget.Spinner' and @content-desc='Drop Down *']"));
		 DropDown.isDisplayed();
		 
		 DropDown.click();
		 
		 //Select Yes
		 
		 WebElement yes = driver.findElement(By.xpath("//*[@class='android.widget.RadioButton' and @content-desc='Yes ']"));
		 yes.isDisplayed();
		 
		 yes.click();
		 		 
		 //Confirm priority 
		 
		 WebElement ok = driver.findElement(By.xpath("//*[@class='android.widget.Button' and @content-desc='OK ']"));
		 ok.isDisplayed();
		 
		 ok.click();
		 
		 //Select the Radio button information 
		 
		 WebElement yesButton = driver.findElement(By.xpath("//*[@class='android.widget.ToggleButton' and @content-desc='YES ']"));
		 yesButton.isDisplayed();
		 
		 yesButton.click();
		 
	 }
	 
	 @Test(priority=6,enabled=false)
	 public void CheckBoxInformation()
	 {
		 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 	Dimension size = driver.manage().window().getSize();
	        int x = size.getWidth() / 2;
	        int starty = (int) (size.getHeight() * 0.60);
	        int endy = (int) (size.getHeight() * 0.10);
	        driver.swipe(x, starty, x, endy, 2000);	 
	        
	        //Select the Radio button information 
			 
			 WebElement SelectCheckBox = driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @content-desc='A']"));
			 SelectCheckBox.isDisplayed();
			 
			 SelectCheckBox.click();
			 
			 
			 //level of incident
			 
			 WebElement Level = driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @text='Text Box Only']"));
			 Level.isDisplayed();
			 
			 Level.sendKeys("Test");
			 
			 driver.hideKeyboard();
		 
	 }
	 
	 @Test(priority=7,enabled=false)
	 public void InventoryCheck()
	 {
		 //Select DropDown
		 
		 WebElement DropDown = driver.findElement(By.xpath("//*[@class='android.widget.Spinner' and @content-desc='Drop Down']"));
		 DropDown.isDisplayed();
		 
		 DropDown.click();
		 
		 //Confirm priority 
		 
		 WebElement ok = driver.findElement(By.xpath("//*[@class='android.widget.RadioButton' and @content-desc='Ok ']"));
		 ok.isDisplayed();
		 
		 ok.click();
		 
		 //Confirm ok 
		 
		 WebElement ok1 = driver.findElement(By.xpath("//*[@class='android.widget.Button' and @content-desc='OK ']"));
		 ok1.isDisplayed();
		 
		 ok1.click();
		 
		 //Select the Radio button information 
		 
		 WebElement yesButton = driver.findElement(By.xpath("//*[@class='android.widget.ToggleButton' and @content-desc='YES ']"));
		 yesButton.isDisplayed();
		 
		 yesButton.click();
		 
		 //Select the CheckBox information 
		 
		 WebElement SelectCheckBox = driver.findElement(By.xpath("//*[@class='android.widget.CheckBox' and @content-desc='Yes']"));
		 SelectCheckBox.isDisplayed();
		 
		 SelectCheckBox.click();		 
		 
	 }
	 
	 @Test(priority=8,enabled=false)
	 public void SubmitRequest()
	 {
		 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 	Dimension size = driver.manage().window().getSize();
	        int x = size.getWidth() / 2;
	        int starty = (int) (size.getHeight() * 0.60);
	        int endy = (int) (size.getHeight() * 0.10);
	        driver.swipe(x, starty, x, endy, 2000);	 
	        
	        //level of incident
			 
			 WebElement Text = driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @text='Text only *']"));
			 Text.isDisplayed();
			 
			 Text.sendKeys("Test");
			 
			 driver.hideKeyboard();
			 
			 //Raise Request is displayed
			 
			 WebElement request = driver.findElement(By.xpath("//*[@class='android.widget.Button' and @content-desc='RAISE REQUEST ']"));
			 request.isDisplayed();
			 
			 /*request.click();*/		 
	 }
	 
}