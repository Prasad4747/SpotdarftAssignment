package All_options;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AllOptions0 {

	public static void main(String[] args) 
	{
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\sourav shinde\\Downloads\\chromedriver_win32\\chromedriver.exe");
          ChromeOptions options = new ChromeOptions();
          options.addArguments("--remote-allow-origins=*");
	       WebDriver driver = new ChromeDriver(options);
	       driver.manage().window().maximize();
	       driver.get("https://www.ebay.com/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       WebElement dropdown = driver.findElement(By.id("gh-cat"));
	       
	      Select s =new Select(dropdown);
	      s.selectByIndex(4);
	      s.selectByValue("625");
	      s.selectByVisibleText("Clothing, Shoes & Accessories");
	      
	      List<WebElement> alloptions = s.getOptions();
	    		  System.out.println(alloptions.size());
	      for(WebElement b: alloptions)
	    	  System.out.println(b.getText());

	      driver.close();

	}

}
