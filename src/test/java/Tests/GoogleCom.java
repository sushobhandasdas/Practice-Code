package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GoogleCom {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  ChromeOptions op = new ChromeOptions();
		op.setHeadless(true);
		driver = new ChromeDriver(op);	
		driver.get("https://smallpdf.com/pdf-to-word");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebElement uploadEle = driver.findElementByCssSelector("#file_upload");
		//uploadEle.sendKeys(getFile());
		//String errorMsg = driver.findElementByCssSelector(".error-header .error").getText();
		//System.out.println(errorMsg);
		driver.findElement(By.xpath("//span[contains(.,'Choose Files')]")).sendKeys("C:\\Users\\sushobhan_das\\CollectionExample\\ArtifactCollection\\file\\SUSHOBHAN's Resume F.pdf");
		Thread.sleep(10000);
		driver.quit();
  }
}
