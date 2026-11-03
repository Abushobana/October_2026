package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateData {
	
	public static void main(String[]args) throws IOException, InterruptedException {
		
		//path
		String path="C:\\Users\\abush\\eclipse-workspace\\October_2026\\ExcelFiles\\DemoBlaze.xlsx";
		//get file
		File f=new File(path);
		//file to object
		FileInputStream f1=new FileInputStream(f);
		//workbook
		Workbook wb=new XSSFWorkbook(f1);
		//sheet
		Sheet sheet = wb.getSheet("login");
		//row
		Row row = sheet.getRow(1);
	
		DataFormatter format=new DataFormatter();
		
		String username = format.formatCellValue(row.getCell(0));
		String password = format.formatCellValue(row.getCell(1));
		
		//wb close
		wb.close();
		f1.close();
		
		System.out.println(username);
		System.out.println(password);
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("signin2")).click();
		
		driver.findElement(By.id("sign-username")).sendKeys(username);
		driver.findElement(By.id("sign-password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Sign up']//[5]")).click();
		
		//login
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.id("loginusername")).sendKeys(username);
		driver.findElement(By.id("loginpassword")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
	
	}

}
