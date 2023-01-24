package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.testng.Assert;
import com.utilities.AutomationBase;
import com.utilities.Utility;

public class loginPage extends Utility {

	public loginPage(WebDriver driverInstance) {
		driver = driverInstance;

	}

	public static void launchApp(String app) throws Exception {
		AutomationBase.launchApp(getAppUrl(app));
		explicitWait(2);
		logger.info("Site  is launched");
	}

	public static void submitCorrectDetails() throws Exception {

		loginPageObjects.userName.sendKeys("standard_user");
		loginPageObjects.password.sendKeys("secret_sauce");
		explicitWait(2);
	}

	public static void clickSubmit() {

		loginPageObjects.loginButton.click();
		explicitWait(2);

	}

	public static void checkErrorMessage() {
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",
				loginPageObjects.errorMessage.getText().toString());
		explicitWait(2);
	}

	public static void submitIncorrectDetails() {

		loginPageObjects.userName.sendKeys("standard_user");
		loginPageObjects.password.sendKeys("iasdasfd");
		explicitWait(2);

	}

	public static void isHomepageDisplayed() {

		Assert.assertEquals("Swag Labs", driver.getTitle());
		System.out.println(driver.getTitle());
		explicitWait(2);

	}

	public static void explicitWait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void navigateToLoginPage() throws Exception {
		launchApp("Sauce Demo");
		
	}

	public static void shouldBeLoggedIn() {
		loginPageObjects.loginButton.click();
		explicitWait(2);
		
	}

	public static void showHomePage() throws Exception {
		Assert.assertEquals("Swag Labs", driver.getTitle());		

	}

	public static void totalProducts(Integer int1) {

		int count = loginPageObjects.list.size();
		Assert.assertEquals(Double.valueOf(count), Double.valueOf(int1));
		explicitWait(2);

	}

	public static void productDetails() {

		loginPageObjects.productButton.click();
		explicitWait(2);
		
		Assert.assertEquals("Sauce Labs Backpack", loginPageObjects.productName.getText());
		explicitWait(2);
	}

	public static void addProduct() {

		loginPageObjects.addProduct.click();
		Assert.assertEquals(loginPageObjects.itemCount.getText(), "1");
		explicitWait(2);

	}

	public static void checkCart() {
		loginPageObjects.itemCount.click();

		Assert.assertEquals(loginPageObjects.check.getText(), "Sauce Labs Backpack");
		explicitWait(2);
	}

	public static void clickSelectFilter() {

		loginPageObjects.filterButton.click();
		explicitWait(2);
	}

	public static void filterCount(Integer int1) {

		Assert.assertEquals(loginPageObjects.optionList.size(), 4);
		explicitWait(2);
	}

	public static void openNavigation() {

		loginPageObjects.navigation.click();
		explicitWait(2);

	}

	public static void logOut() {

		loginPageObjects.logOut.click();
		explicitWait(2);

	}

	public static void checkLogout() {
		Assert.assertEquals("Swag Labs", driver.getTitle());
		System.out.println(driver.getTitle());
		explicitWait(2);
	}

	public static void navigateToCartAndRemove() {

		loginPageObjects.cartButton.click();
		explicitWait(2);

		loginPageObjects.productRemoveButton.click();
		explicitWait(2);

	}

	public static void checkIfRemoved() {

		String productClassName = loginPageObjects.product.getAttribute("class");
		Assert.assertEquals(productClassName, "removed_cart_item");
	}

	public static void multipleAdd() {

		loginPageObjects.addProduct.click();
		loginPageObjects.addProduct2.click();

		Assert.assertEquals(loginPageObjects.itemCount.getText(), "2");
		explicitWait(2);

	}

	public static void multipleCheck(int int1) {
		loginPageObjects.cartButton.click();
		explicitWait(2);
		System.out.println(loginPageObjects.listDiv.size());
		Assert.assertEquals(int1, loginPageObjects.listDiv.size());

	}

	public static void fillDetails() {
		WebElement checkOutButton = driver.findElement(By.id("checkout"));
		checkOutButton.click();
		explicitWait(2);

		Assert.assertEquals("CHECKOUT: YOUR INFORMATION", loginPageObjects.fillTitle.getText());
		loginPageObjects.firstName.sendKeys("Lucifer");
		loginPageObjects.lasName.sendKeys("MorningStar");
		loginPageObjects.postalCode.sendKeys("001782");

		explicitWait(2);

		loginPageObjects.continueButton.click();

	}

	public static void checkTotalAmount() {

		Assert.assertEquals("Total: $43.18", loginPageObjects.totalAmount.getText());
		explicitWait(2);
		driver.findElement(By.id("finish")).click();
		explicitWait(2);

	}

	public static void checkMessage() {

		Assert.assertEquals("CHECKOUT: COMPLETE!", loginPageObjects.finalPageTitle.getText());

	}




}
