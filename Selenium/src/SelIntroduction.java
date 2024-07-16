import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseurl ="https://rahulshettyacademy.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gauravra\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\gauravra\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		
		
		
		//System.setProperty("webdriver.gecko.driver", "C:/Users/gauravra/gecko_win64/gecko.exe");
		//WebDriver driver = new FirefoxDriver();
		//	System.setProperty("webdriver.edge.driver", "C:/Users/gauravra/edgedriver_win64/msedgedriver.exe");
		//	WebDriver driver = new EdgeDriver();
		
		
		driver.get(baseurl);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	//	driver.findElement(By.className(baseurl)		
	//driver.close();
		
	}

}
