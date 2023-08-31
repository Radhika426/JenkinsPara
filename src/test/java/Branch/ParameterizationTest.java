package Branch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationTest {
	
	public void m1() {
		WebDriver driver=null;
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		driver.get(URL);
	}

}
