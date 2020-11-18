package com.example.seleniumdevops;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleAppTest {
	 protected WebDriver driver;


	
	/*  private static final String CHROMEDRIVER_EXE = "chromedriver.exe";
	    protected WebDriver driver;

	    @Before
	    public void setUp() {
	        String driverFile = findFile();
	        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	        ChromeDriverService service = new ChromeDriverService.Builder()
	                .usingDriverExecutable(new File(driverFile))
	                .build();
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
	        options.addArguments("--headless");
	        options.setExperimentalOption("useAutomationExtension", false);
	        options.addArguments("start-maximized"); // open Browser in maximized mode
	        options.addArguments("disable-infobars"); // disabling infobars
	        options.addArguments("--disable-extensions"); // disabling extensions
	        options.addArguments("--disable-gpu"); // applicable to windows os only
	        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
	        options.merge(capabilities);
	        this.driver = new ChromeDriver(service, options);
	    }

	    private String findFile() {
	        ClassLoader classLoader = getClass().getClassLoader();
	        URL url = classLoader.getResource(CHROMEDRIVER_EXE);
	        return url.getFile();
	    }

	 

	    @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }*/


	
	
	@BeforeMethod
	public void testSetup()
	{
		
	System.setProperty("webdriver.chrome.driver", "E:/selenium/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://3.95.171.198:9080/sampleapp/");
	
	}

	@Test
	public void openBrowser()
	{

	//driver.findElement(By.id("signupModalButton")).click();
	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
}
	
	
	
	
}