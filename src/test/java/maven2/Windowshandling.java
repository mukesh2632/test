package maven2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowshandling {
	public static void main (String[]args) throws Exception{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		 String url="https://www.flipkart.com";
		 driver.navigate().to(url);
		 driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("realme mobile",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[4]")).click();
		Set<String> child=driver.getWindowHandles();
		List<String>s=new ArrayList<String>(child);
		driver.switchTo().window(s.get(2));
		
		
		
	}

	

}
