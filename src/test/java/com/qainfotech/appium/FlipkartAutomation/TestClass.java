package com.qainfotech.appium.FlipkartAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TestClass {
	
	AndroidDriver driver;
	SignInActivity signIn;
	
	@BeforeClass
	public void setCapabilitiesAndLaunchApp() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Nexus_5_API_25");
		caps.setCapability("udid", "emulator-5554"); 
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.1.1");
		caps.setCapability("appPackage", "com.flipkart.android");
		caps.setCapability("appActivity", ".activity.HomeFragmentHolderActivity");
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		signIn = new SignInActivity(driver);
	}
	
	@Test
	public void Login() {
		
		signIn.LoginUsingCorrectCredentials();
		

	}

}
