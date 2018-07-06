package com.qainfotech.appium.FlipkartAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class SignInActivity {
	
	AndroidDriver driver;
	
	public SignInActivity(AndroidDriver driver) {
		this.driver = driver;
	}

	public void LoginUsingCorrectCredentials() {
		ClickOnExistingUserButton();	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.flipkart.android:id/mobileNo")));
		WebElement mobileNo =driver.findElement(By.id("com.flipkart.android:id/mobileNo"));
		mobileNo.click();
		driver.findElement(By.id("com.google.android.gms:id/cancel")).click();
		mobileNo.sendKeys("9013252386");
		driver.findElement(By.id("com.flipkart.android:id/et_password")).click();
		driver.findElement(By.id("com.flipkart.android:id/et_password")).sendKeys("Aditya@321#");
		driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")).click();
	}

	private void ClickOnExistingUserButton() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.flipkart.android:id/btn_mlogin")));
		driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")).click();	
	}
	
	

}
