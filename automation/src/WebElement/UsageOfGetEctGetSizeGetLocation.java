package WebElement;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetEctGetSizeGetLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement firstname=driver.findElement(By.name("firstname"));
	    WebElement lastname=driver.findElement(By.name("lastname"));
	   Dimension d1=firstname.getSize();
	   int h1=d1.getHeight();
	   int h2=lastname.getSize().getHeight();
	   int w1=d1.getWidth();
	   int w2=lastname.getSize().getWidth();
	   Point p1=firstname.getLocation();
	   Rectangle r1=firstname.getRect();
	   int xAxis1=p1.getX();
	   int yAxis1=p1.getY();
	   int yAxis2=lastname.getLocation().getY();
	   if(h1==h2&&w1==w2&&yAxis1==yAxis2) {
		   System.out.println("pass:both the text are of same size and alligned proprely");
	   }else {
		   System.out.println("fail:both the text box are of diffrent size and not alligned proprely");
	   }
	   driver.quit();
	   
	   
	   
	   
	   
	   
				 

	}

}
