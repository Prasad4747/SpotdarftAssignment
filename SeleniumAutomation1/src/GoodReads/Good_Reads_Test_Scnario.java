package GoodReads;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Good_Reads_Test_Scnario {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sourav shinde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.goodreads.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//1. Login to Goodreads.com
		
		//clicking on login button with using amzone
		
		WebElement ele1 = driver.findElement(By.xpath("//a[normalize-space()='Continue with Amazon']"));
		ele1.click();
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='ap_email']"));ele2.click();
		ele2.sendKeys("souravshinde88@gmail.com");
		WebElement ele3 = driver.findElement(By.xpath("//input[@id='ap_password']"));ele3.click();
		ele3.sendKeys(".eH?z5/k.Uv-b6R");
		WebElement signInButton = driver.findElement(By.id("signInSubmit"));
		signInButton.click();
		
		// CAPTCHA cannot be automated in ATSJ, so manual intervention is required.
        // Reason: The CAPTCHA mechanism implemented by ATSJ is specifically designed to prevent automated access. As per their terms of service, manual intervention is necessary for CAPTCHA verification.
        // Therefore, we are unable to automate the ATSJ CAPTCHA process using Selenium.
		//we can automate the captcha by using thrid party tool like
		//We can't be test further scenario because ofwe can not automate the captcha If the captcha problem solve by manually then futher secario will be look like as following
 
		
		// 2. Search for a specific book title
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("science");
		WebElement searchbtn = driver.findElement(By.xpath("//button[@aria-label='Search']"));
		searchbtn.click();
		
	   WebElement readbtn= driver.findElement(By.xpath("//div[@id='1_book_6346975']//div[@class='wtrUp wtrLeft']//form"));
	   readbtn.click();
	   
	// 3. Mark it as 'want to read'
	   WebElement bookLink = driver.findElement(By.linkText("bookTitle"));
       bookLink.click();
       driver.findElement(By.cssSelector("button.wtrToRead")).click();
		
       //// 4. Remove the selected book from your book list
       driver.findElement(By.className("siteHeader__personalUserProfileLink")).click();
       driver.findElement(By.linkText("My Books")).click();
       driver.findElement(By.linkText("Want to Read")).click();
       WebElement bookMenu = driver.findElement(By.cssSelector("a.actionLinkLite.bookPageSettingsMenuButton"));
       Actions action = new Actions(driver);
       action.moveToElement(bookMenu).perform();
       driver.findElement(By.cssSelector("div.popoverContent a.actionLink")).click();
		
		 
		
		 
		






	}
 
}
