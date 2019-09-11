package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	//SAMPLE ALERT
	/*public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Day8Alert\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement sampl = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		sampl.click();
		
		Thread.sleep(4000);
		
		Alert al = driver.switchTo().alert();
		al.accept();
*/
	
	//CONFORM ALERT
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Day8Alert\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement sampl = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		sampl.click();
		
		WebElement a = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		a.click();
		
		Alert al = driver.switchTo().alert();
		al.accept();
}
}
