package UTILITY1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet {
public static void main(String[] args) throws IOException {
//	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
//
//	WebDriver driver = new ChromeDriver();

	

	
     
	
	Properties prop =new Properties();
	String path=System.getProperty("user.dir")+"//ExcelSheet//testexcel.xlsx";
	File fi=new File(path);
	FileInputStream fis=new FileInputStream(fi);
	String path1=System.getProperty("user.dir")+"//ExcelSheet//testexcel.xlsx";
	File fi1=new File(path1);
	FileOutputStream fos=new FileOutputStream(fi1);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh1 = wb.getSheet("data");
	sh1.getRow(2).getCell(0).setCellValue("gaurav chendake");
wb.write(fos);
}
}
