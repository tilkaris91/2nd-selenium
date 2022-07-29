package testngdisscusion;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.ScreenShoot;

public class ListenerClass extends KiteLogIn implements ITestListener {

	

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test case started: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case executed: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
	
		
			try {
				ScreenShoot.capturescrshot(driver, result.getName());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skiped: "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("test  started: "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test complited: "+context.getName());
	}

}
