package org.test;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.pom.RegisterPom;

import utility.BaseClass;


public class JunitDemo extends BaseClass {
	

  
  String path="ExcelFiles\\ExcelRead-WB.xlsx";	
  RegisterPom registerpom;
  
	@Before
	public void before() {
		JunitDemo.browsersetup("Chrome", "https://demowebshop.tricentis.com/register");
		 registerpom=new RegisterPom();
	}
	
	@After
	public void after() {
		driver.quit();
	}
	
	@Test
	public void test01() throws IOException {
		
		//Read data from Excel
		
		String male   =registerpom.ExcelReadBasic(path, "demo", 1, 0);
		String female    = registerpom.ExcelReadBasic(path, "demo", 1, 0);
		String firstname =registerpom.ExcelReadBasic(path, "demo", 1, 1);
		String lastname  =registerpom.ExcelReadBasic(path, "demo", 1, 2);
		String email     =registerpom.ExcelReadBasic(path, "demo", 1, 3);
		String password  =registerpom.ExcelReadBasic(path, "demo", 1, 4);
		String confirmpassword=registerpom.ExcelReadBasic(path, "demo", 1, 5);
		
		//Pass Excel values as arguments
	
   registerpom.performRegister(male,female, firstname, lastname, email, password, confirmpassword);
	
	
	}

}
