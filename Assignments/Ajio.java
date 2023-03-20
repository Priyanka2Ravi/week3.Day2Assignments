package week3.day2.Assignments;


import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
				
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("--disable-notifications");
				ChromeDriver driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://www.ajio.com/");
				
				driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
				driver.findElement(By.xpath("//label[@for='Men']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
				Thread.sleep(2000);
				System.out.println(driver.findElement(By.className("length")).getText());
				
				//get the elements in list and remove the duplicate names by storing in set (BRAND-NAME)
				
				List<WebElement> brand = driver.findElements(By.className("brand"));
				
				Set<String> brandnames = new TreeSet<String>();
								
				for(WebElement we: brand)
				{
					brandnames.add(we.getText());
				}
				
				System.out.println("No of brands: "+ brandnames.size() + " List of all brandname :" + brandnames );
				
				//get the elements in list (BAG-NAME)

				
				List<WebElement> bag = driver.findElements(By.className("nameCls"));
				
				System.out.println("List of all bagnames: ");
				
				for(WebElement ee: bag)
				{
					System.out.println(ee.getText());
				}
				
				System.out.println("No of Bagnames : " + bag.size());
			}
		}


