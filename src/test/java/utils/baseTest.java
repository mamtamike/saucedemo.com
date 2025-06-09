package utils;

	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class baseTest {
		public static WebDriver driver;
        public static FileReader fr;
        public static Properties prop=new Properties();

        @BeforeSuite
		public void setup() throws IOException {
	    	if(driver==null) {
	    	fr=new FileReader("C:\\eclipse_workspace\\Saucedemo.com\\src\\test\\resources\\Testdata\\config.properties");
            prop.load(fr);
	    	}
	    	if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
		    }
	    	else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
	    		WebDriverManager.firefoxdriver().setup();
	    		driver = new FirefoxDriver();
	    		driver.manage().window().maximize();
	    		driver.get(prop.getProperty("url"));
	    	}
	    	else if(prop.getProperty("browser").equalsIgnoreCase("edge")){
	    		WebDriverManager.edgedriver().setup();
	    		driver = new EdgeDriver();
	    		driver.manage().window().maximize();
	    		driver.get(prop.getProperty("url"));
	    		
	    	}	
	    }
	    @AfterSuite
	    public void tearDown() {
	    	driver.close();
	    }
}







