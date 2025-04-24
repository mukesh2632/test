package maven2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[]args)throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url="https://www.globalsqa.com/demo-site/select-dropdown-menu/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.tagName("select"));
		Select s= new Select(drop);
		List<WebElement> options = s.getOptions();
		for (int i = options.size() - 1; i >= 0; i--) {
            String text = options.get(i).getText();
            System.out.println(text);
        }
		
	}

	}



