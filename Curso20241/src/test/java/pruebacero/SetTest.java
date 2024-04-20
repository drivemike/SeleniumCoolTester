package pruebacero;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetTest {
  @Test
  public void test01() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https:/www.google.com");
  }
}
