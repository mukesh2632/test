package maven2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Optionsclass {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();

        EdgeOptions options = new EdgeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("inprivate");
        options.addArguments("disable-extensions");
        WebDriver driver = new EdgeDriver(options);
     driver.get("https://www.icc-cricket.com/");
       
        
    }
}
