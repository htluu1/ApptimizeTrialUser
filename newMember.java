package newAppAcct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class newMember {

	public static void main(String[] args) {
		//setProperty(a,b): Ensure b is set to path of gecko driver 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sherlock Mind Palace\\Desktop\\geckodriver-v0.16.1-win64\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	
    	//Go to testing site
    	driver.get("https://apptimize.com");
    	
    	//Click on Sign Up button
    	driver.findElement(By.xpath("//a[@href='/30-day-trial']")).click();
    	
    	//Search for id fname for 10 seconds before giving up
    	WebElement fname = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("fname")));
    	fname.sendKeys("Conan");
    	
    	WebElement lname = driver.findElement(By.id("lname"));
    	lname.sendKeys("Edogawa");
    	
    	//Fill in email field 
    	WebElement email = driver.findElement(By.id("email"));
    	email.sendKeys("kaitokid412@gmail.com");
    	
    	//Fill in Company name
    	WebElement cname = driver.findElement(By.id("company"));
    	cname.sendKeys("Apptimize Candidate");
    	
    	//Fill in Phone and Job field
    	WebElement phone = driver.findElement(By.id("phone"));
    	phone.sendKeys("415-555-0123");
    	
    	WebElement jtitle = driver.findElement(By.id("jobtitle"));
    	jtitle.sendKeys("Detective");
    	
    	//Create password
    	WebElement password = driver.findElement(By.id("password"));
    	password.sendKeys("InvestInMe");
    	
    	//Select No to software radio question
    	WebElement rNo = driver.findElement(By.xpath("//input[@name='purchased' and @value='No']"));
    	rNo.click();
   
    	//Select End User License Agreement Checkbox
    	WebElement read = driver.findElement(By.id("eula"));
    	read.click();
    	
    	WebElement submit = driver.findElement(By.id("submit"));
    	submit.click();
    	
    	//Confirm account was successfully created.
    	WebElement success = driver.findElement(By.id("zet-navbar-dashboard"));
    	success.clear();
        	
    	driver.quit();
   	
    	
	}

}
