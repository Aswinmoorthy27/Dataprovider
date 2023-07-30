package Dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Commonclass {

	public static RemoteWebDriver driver;

	@BeforeMethod
	public void beforelogin() {

		driver = new EdgeDriver();

		driver.get("https://www.abhibus.com/");

		// maximize
		driver.manage().window().maximize();

		// wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	@DataProvider
	public String[][] Datapassing() 
	{
		String[][]  senddata=new String[1][2];
		
		senddata[0][0]="Chennai";
		senddata[0][1]="Bangalore";

		
		return senddata;
	}

	@AfterMethod
	public void Aftersteps() {

		driver.close();

	}

}
