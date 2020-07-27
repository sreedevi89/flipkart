package flipkart.cucumber;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testerSteps {
	
	WebDriver dr;
	SoftAssert softassert = new SoftAssert();

	
	@Given("^I am on the flipkart Page$")
	public void navigate(){
	       dr=new FirefoxDriver();
	       dr.get("http://www.flipkart.com");         
	       }
	
	@When ("^user logged in using username as \"(.*)\" and password as \"(.*)\"$")
	public void login(String username,String password){
	       dr.findElement(By.xpath("//*[@id='Email']")).sendKeys(username);
	       dr.findElement(By.xpath("//*[@id='Password']")).sendKeys(password);
	       dr.findElement(By.xpath("//*[@id='Login']")).click();
	       dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       }
	
	@Then("^home page should be displayed$")
	public void verifySuccessful(){
	      String expectedText="Flipkart";
	      String actualText=dr.findElement(By.xpath("//*[@id='gbq1']/div/a/span")).getText();
	      Assert.assertTrue("Login not successful",expectedText.equals(actualText));
	      }
	
	
	@And ("^Search Camera as \"(.*)\"$")
	public void searchcamera(String camera){
		dr.findElement(By.xpath("//*[@id='searchpath']"))..sendKeys(camera);
	    dr.findElement(By.xpath("//*[@id='Search']")).click();
	    
	    WebDriverWait wait =new WebDriverWait(dr, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@name,'D7500 DSLR Camera Body with 18-140 mm']")));
	    
	    WebElement searchcamera = driver.findElement(By.Xpath(“//*[contains(@name,'D7500 DSLR Camera Body with 18-140 mm']);
	    softassert.assertEquals (true, searchcamera.isDisplayed());
	}

	
	
	@And ("^select \"(.*)\" as camera model$")
	public void selectcamera(){
		dr.findElement(By.xpath("//*[contains(@name,'D7500 DSLR Camera Body with 18-140 mm']")).click();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement searchcamerapage =driver.findElement(By.Xpath("//*[@id='nikon D7500']");
		softassert.assertEquals (true, searchcamerapage.isDisplayed());

	}

	
	
	 @And("^Verify$\")
	public void verifycamerapage(String Name,String Price  ){
		
		List<Map<String, String>> data = table.asMaps();
		
		String expectedName = data.get(0).get("Name")
	    WebElement actualName = driver.findElement(By.Xpath(“//*[contains(@name,'D7500 DSLR Camera Body with 18-140 mm']); 
		Assert.assertEquals("Login not successful",expectedName.equals(actualName));
	    String expectedprice = data.get(0).get("price")
	    WebElement actualprice = driver.findElement(By.Xpath(“//*[contains(@price,'78400']); 
	    
		Assert.assertEquals("Login not successful",expectedprice.equals(actualprice));
		
	}
	
	
	@And("^click on add to cart button$")
	public void addtocartbutton(){
		
		dr.findElement(By.id("addtocart").click();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	 @And("^Verify$\")
	public void verifycamerapage(String Name,String Price  ){
		
		List<Map<String, String>> data = table.asMaps();
		
		String expectedName = data.get(0).get("Name")
	    WebElement actualName = driver.findElement(By.Xpath(“//*[contains(@name,'D7500 DSLR Camera Body with 18-140 mm']); 
		Assert.assertEquals("Login not successful",expectedName.equals(actualName));
	    String expectedprice = data.get(0).get("price")
	    WebElement actualprice = driver.findElement(By.Xpath(“//*[contains(@price,'78400']); 
	    
		Assert.assertEquals("Login not successful",expectedprice.equals(actualprice));
		
	}
	
	@Then("^click logout button $\")
			
			public void logoutbutton()
			{
				 dr.findElement(By.xpath("//*[@id='logout']")).click;
				 dr.quit();
			}
			
}
			}