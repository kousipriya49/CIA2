package cia2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q2 {
	@Test
	public static void f() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.trivago.in/");
		driver.manage().window().maximize();
		WebElement location=driver.findElement(By.xpath("//*[@id=\"input-auto-complete\"]"));
    	location.click();
    	WebElement option=driver.findElement(By.xpath("//*[@id=\"suggestion-list\"]/ul/li[2]/div/div"));
    	option.click();
    	Thread.sleep(2000);
    	WebElement cin=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[6]/time"));
    	cin.click();
    	Thread.sleep(2000);
    	WebElement cout=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[12]/time"));
    	cout.click();
    	Thread.sleep(2000);
    	WebElement guest=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div/button[2]/span/span[1]"));
    	guest.click();
    	Thread.sleep(2000);
    	WebElement pet=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[2]"));
    	pet.click();
    	Thread.sleep(2000);
    	WebElement apply=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[2]/div/button[2]"));
    	apply.click();
		Thread.sleep(30000);
    	WebElement hotel=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[2]/div/ul/li[2]/div/label"));
    	hotel.click();
    	Thread.sleep(2000);
    	WebElement rating=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[3]/div/button"));
    	rating.click();
        Select se=new Select(rating);
        se.selectByIndex(0);
        Thread.sleep(2000);
        WebElement filter=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div/div[5]/div/button"));
    	filter.click();
    	WebElement name=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[1]/section/h2/button/span"));
    	System.out.println("Name of the first product : "+name);
    	WebElement sort=driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]"));
    	sort.click();
    	Select s=new Select(sort);
        s.selectByIndex(4);
        Thread.sleep(2000);
    	WebElement name1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[1]/section/h2/button/span"));
    	Thread.sleep(2000);
    	WebElement price1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/p"));
    	System.out.println("Name and Price of the product : "+name1+" "+price1);
    	WebElement stays=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[1]/span[2]/strong"));
    	System.out.println("Stays : "+stays);
    	WebElement sites=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]/span[2]/strong"));
    	System.out.println("Booking sites : "+sites);
    	List<WebElement> li =  driver.findElements(By.xpath("//*[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		for(WebElement l:li)
		System.out.println(l.getText()+" ");
	  
	  WebElement viewdeal =driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[2]/div[2]/button"));
	  viewdeal.click();
	  
	  WebElement priceofhostel=driver.findElement(By.xpath("//*[@id=\"Layer_1\"]/g[2]/polygon"));
	       priceofhostel.click();
	  
	  WebElement  name2=driver.findElement(By.xpath("//*[@id=\"topOfPage\"]/div[6]/div[2]/div/room-rate-list/room-rate-item[1]/div/div/div/div[2]/div/div[2]/div[1]/app-rate-price/div/div[3]/span"));
	  System.out.println(name2.getText());
	  
	  WebElement fil=driver.findElement(By.xpath("//*[@id=\"topOfPage\"]/div[6]/div[2]/div/room-rate-list/room-rate-item[1]/div/div/div/div[2]/div/div[2]/div[2]/button"));
		fil.click();
		
		WebElement select=driver.findElement(By.xpath("//*[@id=\"topOfPage\"]/div[6]/div[2]/div/room-rate-list/room-rate-item[1]/div/app-cash-free-rates-drawer/div/div[1]/app-rate-card[1]/div/div[2]/div[2]/app-select-button/button"));
		select.click();
		
		driver.get("https://www.holidayinn.com/hotels/us/en/pay/payment");
}
}
