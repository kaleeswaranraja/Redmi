package facebook.org;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Mi {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalee\\eclipse-workspace\\Redmi\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		//maximize
			driver.manage().window().maximize();
			// to find the element
			WebElement userTxt = driver.findElement(By.id("email"));
			userTxt.sendKeys("9600500592");	
			WebElement passTxt = driver.findElement(By.id("pass"));
			passTxt.sendKeys("Kaviya@26");
			WebElement loginBtn = driver.findElement(By.name("login"));
			loginBtn.click();
			
		}}

	
