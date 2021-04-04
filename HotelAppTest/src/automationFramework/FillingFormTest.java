package automationFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//*  Name:       Nikunj Rathod
//*  Date:       2021-Apr-4
//*  Purpose:    QA Project

public class FillingFormTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(Utils.CHROME_CLASS, Utils.CHROME_PATH);
		WebDriver driver = new ChromeDriver();

		try {
			
			{
				driver.get("http://adactinhotelapp.com/index.php");
			
				WebElement username = driver.findElement(By.id("username"));
							
				WebElement password = driver.findElement(By.id("password"));
	
				WebElement login = driver.findElement(By.id("login"));				
				
				username.sendKeys("NBCC2021QA");
				password.sendKeys("56oPQBuLFldV");
				
				login.click();
			}
			{
				//driver.get("http://adactinhotelapp.com/SearchHotel.php");
				
				WebElement location = driver.findElement(By.id("location"));
				
				WebElement hotel = driver.findElement(By.id("hotels"));
				
				WebElement roomType = driver.findElement(By.id("room_type"));
				
				WebElement submit = driver.findElement(By.id("Submit"));
				
				location.sendKeys("Sydney");
				location.sendKeys(Keys.TAB);
				
				hotel.sendKeys("Hotel Creek");
				hotel.sendKeys(Keys.TAB);
				
				roomType.sendKeys("Standard");
				roomType.sendKeys(Keys.TAB);
				
				submit.click();
			
			}
			
			{
				//driver.get("http://adactinhotelapp.com/SelectHotel.php");
				
				WebElement radioButton = driver.findElement(By.id("radiobutton_0"));
				
				WebElement submit = driver.findElement(By.id("continue"));
								
				radioButton.click();
				
				submit.click();
			}
			
			{
				//driver.get("http://adactinhotelapp.com/BookHotel.php");
				
				WebElement firstName = driver.findElement(By.id("first_name"));				
				
				WebElement lastName = driver.findElement(By.id("last_name"));
								
				WebElement address = driver.findElement(By.id("address"));
								
				WebElement ccNum = driver.findElement(By.id("cc_num"));
								
				WebElement ccType = driver.findElement(By.id("cc_type"));
								
				WebElement ccMonth = driver.findElement(By.id("cc_exp_month"));
								
				WebElement ccYear = driver.findElement(By.id("cc_exp_year"));
				
				WebElement ccCvv = driver.findElement(By.id("cc_cvv"));
				
				WebElement submit = driver.findElement(By.id("book_now"));
				
				firstName.sendKeys("Nikunj");
				lastName.sendKeys("Rathod");
				address.sendKeys("270 Weldon Street");
				ccNum.sendKeys("1111111111111111");
				ccType.sendKeys("American Express");
				ccType.sendKeys(Keys.TAB);
				ccMonth.sendKeys("January");
				ccMonth.sendKeys(Keys.TAB);
				ccYear.sendKeys("2022");
				ccYear.sendKeys(Keys.TAB);
				ccCvv.sendKeys("123");
				ccCvv.sendKeys(Keys.TAB);
				
				submit.click();
				Utils.s(6);
			}
			{
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("document.getElementById('order_no').setAttribute('type', 'text');");
				String str = driver.findElement(By.name("order_no")).getAttribute("value");
				Utils.p("Yes order_no element is present and the Order No. is: " +str);
			}
			
			//Utils.s(10);
			
		}
		catch(Exception e){
			Utils.p(e.getMessage());
			
		}
		
		driver.close();
		
	}

}
