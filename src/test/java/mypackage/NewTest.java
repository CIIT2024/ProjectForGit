package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.ciitcoder.com/login");
	  driver.manage().window().maximize();
	  System.out.println("Welcome");
	    System.out.println("Welcome to pune");
  }
}
