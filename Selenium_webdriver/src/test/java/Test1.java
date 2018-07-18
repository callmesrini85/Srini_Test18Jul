import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 
{
	
 @Parameters("browser")
 @Test 
	public void test(String value)
	{
	   WebDriver driver=null;
	   
		if(value.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\edghyowe8\\chromedriver.exe");
		driver=new ChromeDriver();
	    }
		else if(value.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Ref1\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("No Driver found");
		}
		
		driver.get("http://localhost:8080/login");
		driver.findElement(By.id("j_username")).sendKeys("Mahesh");
		driver.findElement(By.name("j_password")).sendKeys("Jenkins");
		
		//driver.findElement(By.className("class=\"submit-button primary\"")).click();
		driver.findElement(By.name("Submit")).click();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		Assert.assertEquals(title, "Dashboard [Jenkins]");
		System.out.println(title);
		System.out.println(title);
		System.out.println(title);
			
		System.out.println("Srini Pulled from Github");
		System.out.println("Mahes Changed");
		
		
		
		
		
	}

}
