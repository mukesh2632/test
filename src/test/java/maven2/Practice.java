package maven2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
	 public static void main(String[] args) throws InterruptedException, IOException{
		 System.setProperty("webdriver.edge.driver","C:\\Users\\Mukesh\\eclipse-workspace\\sel\\maven2\\target\\msedgedriver.exe");
		 WebDriver driver=new EdgeDriver();
		 String url="https://demo.guru99.com/test/drag_drop.html";
		 driver.navigate().to(url);
		 driver.manage().window().maximize();
		 WebElement drag=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		 WebElement drop=driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));

		 Actions i= new Actions(driver);
		 i.dragAndDrop(drag, drop).build().perform();
		// i.moveToElement(email).perform();
		 //i.sendKeys(email,"mukeshvenkat871@gmail.com").perform();
		 //i.doubleClick(email).perform();
		 //i.contextClick().build().perform();
		 WebElement dragn = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	        WebElement dropn = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
	      Actions m= new Actions(driver);
		 m.dragAndDrop(dragn, dropn).build().perform();
		 
		 WebElement dragnn = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	        WebElement dropnn = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
	        Actions s= new Actions(driver);
		 s.dragAndDrop(dragnn, dropnn).build().perform();
		 
		 WebElement dragnnn = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	        WebElement dropnnn = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
	        Actions w= new Actions(driver);
		 w.dragAndDrop(dragnnn, dropnnn).build().perform();
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 File des= new File ("C:\\Users\\Mukesh\\eclipse-workspace\\sel\\maven2\\target\\mukesh.png");
		 FileUtils.copyFile(src, des);
		 driver.quit();
		

	  
		 }
}

