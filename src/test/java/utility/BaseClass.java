package utility;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class BaseClass {
	
	

	public static WebDriver driver=null;
	
public static WebDriver browsersetup(String browsername, String url) {
		
		
		
		if(browsername.equalsIgnoreCase("Chrome")){
			
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Edge")){
			
			driver=new EdgeDriver();
			
		}
			
		else {
			
			throw new IllegalArgumentException("invalid broser name:"+ browsername);
			
			}
		
		driver.get(url);
		
		return driver;
		
	}
	
	


      public static  String ExcelReadBasic (String filepath, String sheetname, int rownum, int cellnum) throws IOException {
	
 	//path
		String path = System.getProperty("user.dir")+filepath;
		
		//file to object
		FileInputStream fi = new FileInputStream(filepath);
			
			//workbook
			Workbook wb=new XSSFWorkbook(fi);
			
			//sheet
			Sheet sheet = wb.getSheet(sheetname);
			
			//row
			Row row = sheet.getRow(rownum);
			
			//cell
			Cell cell1 = row.getCell(cellnum);
			
			//data
		//	String data = cell.getStringCellValue();
			DataFormatter format=new DataFormatter();
			String data=format.formatCellValue(cell1);
			
			//wb close
			wb.close();
			return data;
			
}
			
	public static void tearDown() {
		
		driver.quit();
	}
			
	
	// Dropdown by visible text
    public static void selectByVisibleText( WebElement element, String text) {
        Select s = new Select(element);
        s.selectByVisibleText(text);
    }

    // Dropdown by value
    public static void selectByValue(WebElement element, String value) {
        Select s = new Select(element);
        s.selectByValue(value);
    }

    // Dropdown by index
    public static void selectByIndex( WebElement element, int index) {
        Select s = new Select(element);
        s.selectByIndex(index);
   	
    
    }
	    
  
	    // Alert accept
	    public static void acceptAlert() {
	      Alert a = driver.switchTo().alert();
	      a.accept();
	    }

	    // Alert dismiss
	    public static void dismissAlert() {
	      Alert a = driver.switchTo().alert();
	      a.dismiss();
	    }

	    // Alert text
	    public static String getAlertText() {
	      return driver.switchTo().alert().getText();
	    }
	    
	    public static void captureImage()
	            throws AWTException, IOException {

	        Robot robot = new Robot();

	        Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
	         Rectangle rr = new Rectangle(ss);

	        BufferedImage image =robot.createScreenCapture(rr);
	          File folder = new File("./Images");

	        if (!folder.exists()) {
	            folder.mkdirs();
	        }

	        File file = new File(folder, "Screenshot_" + System.currentTimeMillis()+ ".png" );
          
	        ImageIO.write(image, "png", file);

	        System.out.println( "Screenshot saved: " + file.getAbsolutePath()  );
	             
	    }

	    // Reusable sendKeys method
	    public static void enterText(By locator, String text) {
	        driver.findElement(locator).sendKeys(text);
	    }

	    // Close browser
	    public static void closeBrowser() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}
	    
	    
	    
	    
	    
	    
	    

	
	    	
	    
	   
 
		
		
		
	


	
	
	
	
			
			


