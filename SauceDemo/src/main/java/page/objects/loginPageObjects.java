package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Utility;

public class loginPageObjects extends Utility{
	public static WebDriver driver;


	public loginPageObjects(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver = driverInstance;
	}


	@FindBy(xpath = "//*[@id=\"user-name\"]")
	public static WebElement userName;

	@FindBy(id = "password")
	public static WebElement password;

	@FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[3]/h3")
	public static WebElement errorMessage;

	@FindBy(id = "login-button")
	public static WebElement loginButton;

	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")
	public static WebElement productButton;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div[2]/div[1]")
	public static WebElement productName;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	public static WebElement addProduct;
	
	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")
	public static WebElement itemCount;
	
	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div[2]/span/select")
	public static WebElement filterButton;
	

	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")
	public static WebElement check;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div")
	public static List<WebElement> list;
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[2]/div[2]/span/select/option")
	public static List<WebElement> optionList;
	
	@FindBy(id = "react-burger-menu-btn")
	public static WebElement navigation;
	
	@FindBy(id = "logout_sidebar_link")
	public static WebElement logOut;
	
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[3]/a")
	public static WebElement cartButton;
	
	@FindBy(id = "remove-sauce-labs-backpack")
	public static WebElement productRemoveButton;
	
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div[1]/div[3]")
	public static WebElement product;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	public static WebElement addProduct2;
	
	//WebElement cartButton = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
	
	@FindBy(xpath="//div[@class='cart_item']")
	public static List<WebElement> listDiv;
	
	
	@FindBy(id = "checkout")
	public static WebElement checkOutButton;
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[2]/span")
	public static WebElement fillTitle;
	
	@FindBy(id = "first-name")
	public static WebElement firstName;
	
	
	@FindBy(id = "last-name")
	public static WebElement lasName;
	

	@FindBy(id = "postal-code")
	public static WebElement postalCode;
	
	@FindBy(id = "continue")
	public static WebElement continueButton;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div[2]/div[7]")
	public static WebElement totalAmount;
	

	@FindBy(xpath="/html/body/div/div/div/div[1]/div[2]/span")
	public static WebElement finalPageTitle;
}
