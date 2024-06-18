package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase () {
		
		try {
			prop = new Properties();
			String projectPath1 = System.getProperty("user.dir");
			FileInputStream fis = new FileInputStream(projectPath1+"/src/test/java/config/config.properties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		
		
	}
	
	public static void initialization() {
		
	    System.out.println("browser is open");
	    String projectPath = System.getProperty("user.dir");	    
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.get(prop.getProperty("url"));
	    
	    
	    
	}
	
}
