package stepDef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Teststeps {
	
	public static WebDriver driver;
	
	@Given("Browser is opened")
    public void browser_is_opened() {
         WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
	
	@When("user is navigated to homepage")
    public void user_is_navigated_to_homepage() {
        driver.get("https://www.growthengineering.co.uk/");    
    }
	
	@And("user verify links")
	public void user_clicks_on_link_verifylinks() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement ourProduct = driver.findElement(By.xpath("//ul[@id='menu-1-14f67f5']//a[contains(text(), 'Our Product')]"));
		js.executeScript("arguments[0].click()", ourProduct);
		driver.findElement(By.xpath("//ul[@id='menu-1-14f67f5']//a[contains(text(), 'Our Product')]")).click();
		String Product= driver.getTitle();
		System.out.println(Product);
		Assert.assertEquals(Product, "The #1 Learning Management System for Employee Engagement");
		
		
		WebElement ourApproach = driver.findElement(By.xpath("//ul[@id='menu-1-14f67f5']//a[contains(text(), 'Our Approach')]"));
		js.executeScript("arguments[0].click()", ourApproach);
		driver.findElement(By.xpath("//ul[@id='menu-1-14f67f5']//a[contains(text(), 'Our Approach')]")).click();
		String Appraoch= driver.getTitle();
		System.out.println(Appraoch);
		Assert.assertEquals(Appraoch, "Brain Science - Growth Engineering");
		
		
		WebElement resources = driver.findElement(By.xpath("//ul[@id='menu-1-14f67f5']//a[contains(text(), 'Resources')]"));
		js.executeScript("arguments[0].click()", resources);
		driver.findElement(By.xpath("//ul[@id='menu-1-14f67f5']//a[contains(text(), 'Resources')]")).click();
		String Resource= driver.getTitle();
		System.out.println(Resource);
		Assert.assertEquals(Resource, "Resources | White Papers, Tip Sheets & Infographics - Growth Engineering");
		
		
		WebElement aboutUs = driver.findElement(By.xpath("//ul[@id='menu-1-14f67f5']//a[contains(text(), 'About Us')]"));
		js.executeScript("arguments[0].click()", aboutUs);
		driver.findElement(By.xpath("//ul[@id='menu-1-14f67f5']//a[contains(text(), 'About Us')]")).click();
		String Aboutus= driver.getTitle();
		System.out.println(Aboutus);
		Assert.assertEquals(Aboutus, "About Us | Online Learning Superheroes - Growth Engineering");
		

		driver.findElement(By.xpath("//a[@id='contact-button']")).click();
		String contact= driver.getTitle();
		System.out.println(contact);
		Assert.assertEquals(contact, "Get in Touch | Growth Engineering - The Learning Engagement Experts");

		}
	
	@Then("user click Get in touch button")
	public void user_click_getInTouch_button() {
		driver.findElement(By.xpath("//a[@id='contact-button']")).click();
		String contact= driver.getTitle();
		System.out.println(contact);
		Assert.assertEquals(contact, "Get in Touch | Growth Engineering - The Learning Engagement Experts");
	}
	
	@Then("submit form without entering values")
	public void submit_form_without_entering_values() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@Then("verify validations are showing")
	public void verify_all_validations_Are_Showing() {
		
		String expected_error1= "Please complete this required field.";
		String expected_error2 = "Please select an option from the dropdown menu.";
		
		String actual_Error_firstname = driver.findElement(By.xpath("//*[@id=\"hsForm_63c6168e-e30a-4c79-ab68-77cedae08dfe\"]/fieldset[1]/div[1]/ul")).getText();
		String actual_Error_lastname = driver.findElement(By.xpath("//*[@id=\"hsForm_63c6168e-e30a-4c79-ab68-77cedae08dfe\"]/fieldset[1]/div[2]/ul/li/label")).getText();
		String actual_Error_email = driver.findElement(By.xpath("//*[@id=\"hsForm_63c6168e-e30a-4c79-ab68-77cedae08dfe\"]/fieldset[2]/div[1]/ul/li/label")).getText();
		String actual_Error_telephone = driver.findElement(By.xpath("//*[@id=\"hsForm_63c6168e-e30a-4c79-ab68-77cedae08dfe\"]/fieldset[2]/div[2]/ul/li/label")).getText();
		String actual_Error_company = driver.findElement(By.xpath("//*[@id=\"hsForm_63c6168e-e30a-4c79-ab68-77cedae08dfe\"]/fieldset[3]/div[1]/ul/li/label")).getText();
		String actual_Error_country = driver.findElement(By.xpath("//*[@id=\"hsForm_63c6168e-e30a-4c79-ab68-77cedae08dfe\"]/fieldset[3]/div[2]/ul/li/label")).getText();
		String actual_Error_Role = driver.findElement(By.xpath("//*[@id=\"hsForm_63c6168e-e30a-4c79-ab68-77cedae08dfe\"]/fieldset[5]/div/ul/li/label")).getText();
		String actual_Error_Enquiry = driver.findElement(By.xpath("//*[@id=\"hsForm_63c6168e-e30a-4c79-ab68-77cedae08dfe\"]/fieldset[6]/div/ul/li/label")).getText();
		String actual_Error_privacy = driver.findElement(By.xpath("//*[@id=\"hsForm_63c6168e-e30a-4c79-ab68-77cedae08dfe\"]/fieldset[7]/div/ul/li/label")).getText();
		
		Assert.assertEquals(actual_Error_firstname, expected_error1);
		Assert.assertEquals(actual_Error_lastname, expected_error1);
		Assert.assertEquals(actual_Error_email, expected_error1);
		Assert.assertEquals(actual_Error_telephone, expected_error1);
		Assert.assertEquals(actual_Error_company, expected_error1);
		
		Assert.assertEquals(actual_Error_country, expected_error2);
		Assert.assertEquals(actual_Error_Role, expected_error2);
		Assert.assertEquals(actual_Error_Enquiry, expected_error2);
		
		Assert.assertEquals(actual_Error_privacy, expected_error1);	
	}
	
	@Then("Browser is closed")	
	public void browser_is_closed() {
		driver.close();
	}
}
