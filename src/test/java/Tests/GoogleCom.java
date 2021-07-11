package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleCom {
  @Test
  public void f() {
	  WebDriver D = new ChromeDriver();
	  D.get("https://yahoo.com");
	  D.close();
  }
}
