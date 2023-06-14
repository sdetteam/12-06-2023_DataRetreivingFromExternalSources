package Json;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3 {
	static Test1 inputfromJson = new Test1(); 

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\gandepudi.jayakumar\\Downloads\\chromrdriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
	   WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	   Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
		
      
	 //*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[1]
		
		
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(inputfromJson.getValueByKey("username"));
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(inputfromJson.getValueByKey("password"));
		
		//usernameInput.sendKeys("Admin");
		//passwordInput.sendKeys("Admin123");
		
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	//	loginButton.click();
		
	//	driver.quit();
		
	}

}
