import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProgram {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		int xaxis = size.getWidth();
		int yaxis = size.getHeight();
		Dimension tgtsize = new Dimension(xaxis/4,yaxis) ;
		driver.manage().window().setSize(tgtsize);
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
//		int x = position.getX();
//		int y = position.getY();
		Point tgtpoint = new Point(-8,-8);
		driver.manage().window().setPosition(tgtpoint);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Point tgtp2 = new Point((xaxis/3)-24,-8);
		driver.manage().window().setPosition(tgtp2);
		
	}

}
