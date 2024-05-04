package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class LoginServiceTest {
	
	private void sleep(long sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLoginSuccess() {
		System.setProperty(
				"webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
		// Full path where login.html is located.
		// You can click on html file and copy the path shown in your browser.
		//
		driver.navigate().to(
				"file:///C:/Users/Darsh/Downloads/8.1P-resources%20(1)/pages/login.html");
		sleep(5);
		
		// Find username element
		//
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("ahsan");
		
		// Find password element
		//
		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("ahsan_pass");
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("1990-01-01");
		
		// Find Submit button, and click on button.
		//
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		
		sleep(5);
		
		/*
		 * On successful login, the title of page changes to 'success',
		 * otherwise, 'fail'.
		 */
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		Assert.assertEquals(title, "success");
		
		driver.close();
	}  @Test
    public void testLoginFailureInvalidPassword() {
		System.setProperty(
				"webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
        driver.navigate().to("file:///C:/Users/Darsh/Downloads/8.1P-resources%20(1)/pages/login.html");
        sleep(5);
        WebElement ele = driver.findElement(By.id("username"));
        ele.clear();
        ele.sendKeys("ahsan");
        ele = driver.findElement(By.id("passwd"));
        ele.clear();
        ele.sendKeys("wrongpassword");
        ele = driver.findElement(By.id("dob"));
        ele.clear();
        ele.sendKeys("1990-01-01");
        ele = driver.findElement(By.cssSelector("[type=submit]"));
        ele.submit();
        sleep(5);
        String title = driver.getTitle();
        System.out.println("Title: " + title);
        Assert.assertEquals(title, "fail");
    }
	 @Test
	    public void testLoginFailureInvalidUsername() {
		 System.setProperty(
					"webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();		
			System.out.println("Driver info: " + driver);
	        driver.navigate().to("file:///C:/Users/Darsh/Downloads/8.1P-resources%20(1)/pages/login.html");
	        sleep(5);
	        WebElement ele = driver.findElement(By.id("username"));
	        ele.clear();
	        ele.sendKeys("invalid");
	        ele = driver.findElement(By.id("passwd"));
	        ele.clear();
	        ele.sendKeys("ahsan_pass");
	        ele = driver.findElement(By.id("dob"));
	        ele.clear();
	        ele.sendKeys("1990-01-01");
	        ele = driver.findElement(By.cssSelector("[type=submit]"));
	        ele.submit();
	        sleep(5);
	        String title = driver.getTitle();
	        System.out.println("Title: " + title);
	        Assert.assertEquals(title, "fail");
	    }
	 
	 
	 @Test
	    public void testLoginFailureInvalidDateOfBirth() {
		 System.setProperty(
					"webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();		
			System.out.println("Driver info: " + driver);
	        driver.navigate().to("file:///C:/Users/Darsh/Downloads/8.1P-resources%20(1)/pages/login.html");
	        sleep(5);
	        WebElement ele = driver.findElement(By.id("username"));
	        ele.clear();
	        ele.sendKeys("ahsan");
	        ele = driver.findElement(By.id("passwd"));
	        ele.clear();
	        ele.sendKeys("ahsan_pass");
	        ele = driver.findElement(By.id("dob"));
	        ele.clear();
	        ele.sendKeys("invalid-date");
	        ele = driver.findElement(By.cssSelector("[type=submit]"));
	        ele.submit();
	        sleep(5);
	        String title = driver.getTitle();
	        System.out.println("Title: " + title);
	        Assert.assertEquals(title, "fail");
	    }
	 @Test
	 public void testLoginFailedEmptyPassword() {
			System.setProperty(
					"webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();		
			System.out.println("Driver info: " + driver);
	        driver.navigate().to("file:///C:/Users/Darsh/Downloads/8.1P-resources%20(1)/pages/login.html");
	        sleep(5);
	        WebElement ele = driver.findElement(By.id("username"));
	        ele.clear();
	        ele.sendKeys("ahsan");
	        ele = driver.findElement(By.id("passwd"));
	        ele.clear();
	        ele.sendKeys("");
	        ele = driver.findElement(By.id("dob"));
	        ele.clear();
	        ele.sendKeys("1990-01-01");
	        ele = driver.findElement(By.cssSelector("[type=submit]"));
	        ele.submit();
	        sleep(5);
	        String title = driver.getTitle();
	        System.out.println("Title: " + title);
	        Assert.assertEquals(title, "fail");
	    }
	 @Test
	 public void testLoginFailedEmptyUsername() {
			System.setProperty(
					"webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();		
			System.out.println("Driver info: " + driver);
	        driver.navigate().to("file:///C:/Users/Darsh/Downloads/8.1P-resources%20(1)/pages/login.html");
	        sleep(5);
	        WebElement ele = driver.findElement(By.id("username"));
	        ele.clear();
	        ele.sendKeys("");
	        ele = driver.findElement(By.id("passwd"));
	        ele.clear();
	        ele.sendKeys("ahsan_pass");
	        ele = driver.findElement(By.id("dob"));
	        ele.clear();
	        ele.sendKeys("1990-01-01");
	        ele = driver.findElement(By.cssSelector("[type=submit]"));
	        ele.submit();
	        sleep(5);
	        String title = driver.getTitle();
	        System.out.println("Title: " + title);
	        Assert.assertEquals(title, "fail");
	    }
	 @Test
	 public void testLoginFailedEmptyDOB() {
			System.setProperty(
					"webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();		
			System.out.println("Driver info: " + driver);
	        driver.navigate().to("file:///C:/Users/Darsh/Downloads/8.1P-resources%20(1)/pages/login.html");
	        sleep(5);
	        WebElement ele = driver.findElement(By.id("username"));
	        ele.clear();
	        ele.sendKeys("ahsan");
	        ele = driver.findElement(By.id("passwd"));
	        ele.clear();
	        ele.sendKeys("ahsan_pass");
	        ele = driver.findElement(By.id("dob"));
	        ele.clear();
	        ele.sendKeys("");
	        ele = driver.findElement(By.cssSelector("[type=submit]"));
	        ele.submit();
	        sleep(5);
	        String title = driver.getTitle();
	        System.out.println("Title: " + title);
	        Assert.assertEquals(title, "fail");
	    }
	 
	    
	    
	    
	 
	 
}
