
package maven2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Browserlaunch {
    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","C:\\Users\\Mukesh\\eclipse-workspace\\sel\\maven2\\target\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.instagram.com/");
driver.manage().window().maximize();
WebElement mukesh=driver.findElement(By.xpath("//input[@name='username']"));
mukesh.sendKeys("mukeshvenkat871@gmail.com");
WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
password.sendKeys("mukeshkiya26");


 


        
    }
}

