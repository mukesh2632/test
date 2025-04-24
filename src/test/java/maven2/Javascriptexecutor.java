package maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexecutor {
	

	public static void main (String[]args) throws Exception{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		 String url="https://www.facebook.com/";
		 driver.navigate().to(url);
		 driver.manage().window().maximize();
		 WebElement mail=driver.findElement(By.id("email"));
		 WebElement down=driver.findElement(By.xpath("//a[text()='Terms']"));
		 //WebElement login=driver.findElement(By.xpath("//button[text()='Log in']"));
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript( "arguments[0].setAttribute('value','mukeshvenkat871@gmail.com');" +
"arguments[0].style.color='green';" +
 "arguments[0].style.border='3px solid blue';" +
"arguments[0].style.outline='3px solid red';",mail);
		 Object s = js.executeScript("return arguments[0].getAttribute('value')", mail);
		System.out.println(s);
		//js.executeScript("arguments[1].click()", user,login);
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)", mail);

	
	}


}
