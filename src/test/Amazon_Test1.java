package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;

public class Amazon_Test1  extends Config {

	// in this class we are running each test with the @Test - TestNG Annotation

	@Test(priority = 0) // this test will execute first because of the priority
	public void amazonSearchMusic() {
		System.out.println("This is Amazon Music search test");
		String expected = "music";
		//locate the search box and type music.
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(expected);
		//click on the search button
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		// assert if the "music" is in the search result

		WebElement exp = driver.findElement(By.xpath("//*[@id=\"search\"]/span[2]/h1/div/div[1]/div/div/span[3]"));
		//store the actual search result in a String variable 
		String actual = exp.getText();
		//getting rid of the "" from the actual search result
		String actualvalue = actual.replaceAll("\"","");
		Assert.assertEquals(actualvalue, expected);

	}

	@Test (priority=1)
	public void amazonMoviesearch(){

		System.out.println("this is amazon movie search");

		String expected="movie";

		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(expected);

		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();

		WebElement wele=driver.findElement(By.xpath("//*[@id=\"search\"]/span/h1/div/div[1]/div/div/span[3]"));

		String actual=wele.getText();

		String act=actual.replaceAll("\"", "");

		Assert.assertEquals(act, expected);	


	}	
}
