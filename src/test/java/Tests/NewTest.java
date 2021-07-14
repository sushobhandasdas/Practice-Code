package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	WebDriverWait wait;
	List<WebElement> Lists;
	
	
	
	
	public NewTest(){
		//this.wait=new WebDriverWait(this.driver, 30);
		Lists= new ArrayList<WebElement>();
		//wait = new WebDriverWait(driver, 20);
	}
	
	
	public void ExcelM() throws FileNotFoundException{
		File file =  new File("C:\\Users\\sushobhan_das\\CollectionExample\\ArtifactCollection\\src\\Results.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
	}

	
	
	
	@FindBy(xpath = "//*[contains(.,'covid')]") 
	static WebElement CovidNum;
	
  @Test(invocationCount = 1)
  public void f() {
	  NewTest obj = new NewTest();
	  ChromeOptions op = new ChromeOptions();
		op.setHeadless(true);
	  WebDriver driver=new ChromeDriver(op);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://google.com");
	  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("covid19india"+Keys.ENTER);
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	  List<WebElement> counts=new ArrayList<WebElement>();
	  counts= driver.findElements(By.xpath("//*[contains(.,'covid')]"));
	  int C=counts.size();
	  System.out.println(C);

	  driver.findElement(By.partialLinkText("covid19india.org")).click();
	  //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Covid19"))));
	  
	  //driver.findElement(By.xpath("//h5[.='Confirmed']"))
	  //String text=driver.findElement(By.xpath("//div[@class='actions']/h5")).getText().toString();
	  counts=driver.findElements(By.xpath("//div[@class='state-name fadeInUp']"));
	  C=counts.size();
	  for(int i=1;i<C;i++){
		  System.out.println(driver.findElement(By.xpath("(//div[@class='state-name fadeInUp'])["+i+"]")).getText());
		  for(int j=1; j<=6;j++){
			  int k=j+1;
		  System.out.print(driver.findElement(By.xpath("//div[@class='table fadeInUp']/div/div[@class='cell heading']["+k+"]")).getText()+": ");
		  String data=driver.findElement(By.xpath("(//div[@class='row']["+i+"]/div[@class='cell statistic'])["+j+"]/div[@class='total']")).getText();
		  System.out.print(data+" ");
		  
		  }
		System.out.println();
		driver.getWindowHandles();
		  
	  }
	  
	  
	  //System.out.println("Last Updated On: "+text);
	  
	  
	  driver.quit();
  
  }
 
}
