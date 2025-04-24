package maven2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multivaluedropdown {
	public static void main (String[]args) throws Exception{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		 String url="";
		 driver.navigate().to(url);
		 driver.manage().window().maximize();
	}

	
}
