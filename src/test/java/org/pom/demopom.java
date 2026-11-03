package org.pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import utility.BaseClass;

public class demopom extends BaseClass {
	
	public static void main(String[]args) throws IOException {
		
		String path="ExcelFiles\\ExcelRead-WB.xlsx";
		
		String female = demopom.ExcelReadBasic(path, "demo", 1, 0);
		String firstname = demopom.ExcelReadBasic(path, "demo", 1, 1);
		String lastname = demopom.ExcelReadBasic(path, "demo", 1, 2);
		String email = demopom.ExcelReadBasic(path, "demo", 1, 3);
		String password = demopom.ExcelReadBasic(path, "demo", 1, 4);
		String confirmpassword = demopom.ExcelReadBasic(path, "demo", 1, 5);
		
		
		WebDriver driver = demopom.browsersetup("Chrome", "https://demowebshop.tricentis.com/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//register
		 RegisterPom registerpom=new RegisterPom();
            
            
        //approach1
		 registerpom.clickFemale();
		 registerpom.getFirstname().sendKeys(firstname);
		 registerpom.getLastname().sendKeys(lastname);
		 registerpom.getEmail().sendKeys(email);
		 registerpom.getPass().sendKeys(password);
		 registerpom.getConfirmPass().sendKeys(confirmpassword);
		 registerpom.getRegister().click();
		 
		 //approach2
		 registerpom.clickFemale();
		 registerpom.SetFirstname(firstname);
		 registerpom.SetLastname(lastname);
		 registerpom.SetEmail(email);
		 registerpom.SetPassword(password);
		 registerpom.SetConfirmPassword(confirmpassword);
		 registerpom.clickRegister();
		 
		 //approach3
	//	 registerpom.performRegister(female, female, firstname, lastname, email, password, confirmpassword);
		
		 
            
		
		
	}



}
