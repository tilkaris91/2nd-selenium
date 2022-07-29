package utility;





import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelReader {
//	public static String readFromExcelSheet(int row,int colm) throws IOException{
//		String path = System.getProperty("user.dir")+"//testexcel.xlsx";
//		
//		File fl=new File(path);
//		
//		FileInputStream fist=new FileInputStream(fl);
//		
//		 
//		XSSFWorkbook wb = new XSSFWorkbook(fist);
//			XSSFSheet sh1 = wb.getSheet("data");
//			//XSSFSheet sh1 = wb.getSheetAt(0);
//			
//			DataFormatter df=new DataFormatter();
//			String stringvalue = df.formatCellValue(sh1.getRow(row).getCell(colm));
//			System.out.println(stringvalue);
//			
//			return stringvalue;
//			
//			
//	}

	public static void writedata() throws IOException
	{
	
		String path = "C:\\Users\\hp\\Desktop\\testexcel.xlsx";
		File src = new File(path);

		FileInputStream fis = new FileInputStream(src);

//		to access the work book

		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		To locate the exact sheet of the workbook
	XSSFSheet sh1 = wb.getSheet("Data");
		//XSSFSheet sh1 = wb.getSheetAt(0);
		
		File fout = new File(path);
		
		FileOutputStream fos = new FileOutputStream(fout);
		
		sh1.getRow(12).getCell(0).setCellValue("dfs");
		
		sh1.createRow(25).createCell(5).setCellValue("50th row data");
		
		wb.write(fos);
		
	
		
		
		
	}	
	
	
	
	
	
	

public static void main(String[] args) throws  IOException {
//	File fl=new File("C:\\Users\\hp\\Desktop\\testexcel.xlsx");
//	
//	FileInputStream fist=new FileInputStream(fl);
//	
//	 
//	XSSFWorkbook wb = new XSSFWorkbook(fist);
//		XSSFSheet sh1 = wb.getSheet("data");
//		
//		DataFormatter df = new DataFormatter();
//		String stringvalue = df.formatCellValue(sh1.getRow(2).getCell(0));
//
//		System.out.println(stringvalue);
//
//
//	
	writedata();
	
}
	
}
