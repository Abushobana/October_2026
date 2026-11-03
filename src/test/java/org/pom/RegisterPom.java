package org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass;

public class RegisterPom extends BaseClass {
	
	
//	WebDriver driver;
//	
//	
//	//by locator
//	//constructor
//	
//	public RegisterPom(WebDriver driver) {
//		this.driver=driver;
//}
//	
//    //locator
//	
//	private By Male=By.xpath("//input[@id='gender-male']");
//	private By Female=By.xpath("//input[@id='gender-female']");
//	private By Firstname=By.name("firstname");
//	private By Lastname=By.name("lastname");
//	private By Email=By.name("email");
//	private By Password=By.name("password");
//	private By ConfirmPassword=By.name("confirmpassword");
//	private By Register=By.xpath("//input[@value='Register']");
//	
//	
//	//methods and actions
//	
//	
//	public WebElement getMale(){
//		return driver.findElement(Male);
//	}
//	
//	public void clickMale() {
//	     driver.findElement(Male).click();
//	}
//	
//	public WebElement getFemale(){
//		return driver.findElement(Female);
//	}
//	
//	public void clickFemale() {
//		driver.findElement(Female).click();
//	}
//	
//	
//	public WebElement getFirstname() {
//		return driver.findElement(Firstname);
//		
//	}
//	
//	public void SetFirstname(String firstname) {
//		
//	driver.findElement(Firstname).sendKeys(firstname);
//	}
//	
//	public WebElement getLastname() {
//		return driver.findElement(Lastname);
//		 
//	}
//	
//	public void SetLastname(String lastname) {
//		driver.findElement(Lastname).sendKeys(lastname);
//	}
//	
//   public WebElement getEmail() {
//		return driver.findElement(Email);
//		 
//	}
//	
//    public void SetEmail(String email) {
//    	driver.findElement(Email).sendKeys(email);
//   }
//    
//    public WebElement getPass() {
//		return driver.findElement(Password);
//		 
//	}
//    
//   public void SetPassword(String pass) {
//    	driver.findElement(Password).sendKeys(pass);
//  }
//    
//    public WebElement getConfirmPass() {
//		return driver.findElement(ConfirmPassword);
//		 
//	}
//    
//    public void SetConfirmPassword(String confirmpass) {
//    	driver.findElement(ConfirmPassword).sendKeys(confirmpass);
//   }
//    
//    public WebElement getRegister() {
//		return driver.findElement(Register);
//		 
//	}
//    
//    public void clickRegister() {
// 	driver.findElement(Register).click();
//    	
//    }
//    
//    
//    public void performRegister(String male, String female, String firstname, String lastname, String email, String pass, String confirmpass ) {
//    	
//     	driver.findElement(Male).click();
//   	    driver.findElement(Female).click();
//    	driver.findElement(Firstname).sendKeys(firstname);
//    	driver.findElement(Lastname).sendKeys(lastname);
//    	driver.findElement(Email).sendKeys(email);
//     	driver.findElement(Password).sendKeys(pass);
//     	driver.findElement(ConfirmPassword).sendKeys(confirmpass);
//  	    driver.findElement(Register).click();
//    	
//    	
//  }
//    
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//constructor
	public RegisterPom() {
	
		PageFactory.initElements(driver, this);
	
	}
	
	//element
	
	
	@FindBy(xpath="//input[@id='gender-male']")
	private WebElement Male;
	
	@FindBy(xpath="//input[@id='gender-female']")
    private WebElement Female;
	
	@FindBy(name="FirstName")
	private WebElement Firstname;
	
	@FindBy(name="LastName")
	private WebElement Lastname;
	
	@FindBy(name="Email")
	private WebElement Email;
	
	@FindBy(name="Password")
	private WebElement Password;
	
    @FindBy(name="ConfirmPassword")
    private WebElement ConfirmPassword;
	
	@FindBy(xpath="//input[@value='Register']")
	private WebElement Register;
	
	//methods and actions
	
	public WebElement getMale(){
		return Male;
	}
	
	public void clickMale() {
	     Male.click();
	}
	
	public WebElement getFemale(){
		return Female;
	}
	
	public void clickFemale() {
		Female.click();
	}
	
	
	public WebElement getFirstname() {
		return Firstname;
		
	}
	
	public void SetFirstname(String firstname) {
		
		Firstname.sendKeys(firstname);
	}
	
	public WebElement getLastname() {
		return Lastname;
		 
	}
	
	public void SetLastname(String lastname) {
		Lastname.sendKeys(lastname);
	}
	
  public WebElement getEmail() {
		return Email;
		 
	}
	
    public void SetEmail(String email) {
   	Email.sendKeys(email);
   }
    
    public WebElement getPass() {
		return Password;
		 
	}
    
   public void SetPassword(String pass) {
   	Password.sendKeys(pass);
    }
    
    public WebElement getConfirmPass() {
		return ConfirmPassword;
		 
	}
    
    public void SetConfirmPassword(String confirmpass) {
    	ConfirmPassword.sendKeys(confirmpass);
   }
    
   public WebElement getRegister() {
		return Register;
		 
	}
    
    public void clickRegister() {
    	Register.click();
    	
    }
    
    
    public void performRegister(String male, String female, String firstname, String lastname, String email, String pass, String confirmpass ) {
    	
    	Male.click();
    	Female.click();
    	Firstname.sendKeys(firstname);
    	Lastname.sendKeys(lastname);
    	Email.sendKeys(email);
    	Password.sendKeys(pass);
    	ConfirmPassword.sendKeys(confirmpass);
     	Register.click();
    	
    	
    }
    
}




	
    


