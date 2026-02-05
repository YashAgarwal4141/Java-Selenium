import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToSS {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		 try {
	            Thread.sleep(10000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		driver.findElement(By.cssSelector("#loginBtn")).click();
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		driver.findElement(By.cssSelector("#Email")).sendKeys("yashagarwal2097@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("Yash@12340");
		driver.findElement(By.cssSelector("#Login")).click();
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		driver.quit();
		

	}

}
