package maven2;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.awt.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {


public static void main (String[]args) throws Exception{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	 String url="https://demo.automationtesting.in/Alerts.html";
	 driver.navigate().to(url);
	 driver.manage().window().maximize();
	WebElement mukesh=driver.findElement(By.xpath("//button[@class=\"btn btn-danger\" ]"));
	  Thread.sleep(3000);
	mukesh.click();
	Thread.sleep(3000);
	Alert s =	driver.switchTo().alert();
s.accept();
WebElement confirm=driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]"));
confirm.click();
driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
s.accept();
Thread.sleep(3000);
WebElement prompt=driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[3]"));
prompt.click();
driver.findElement(By.xpath("//button[contains(text(), 'prompt box')]")).click();
String i=s.getText();
System.out.println(i);
s.sendKeys("mukesh");
s.accept();



	

	
}

}
