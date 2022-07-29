package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssignmentCallMethodToUseExcelValues {
public static String readData(int row,int clm) {
	File src = new File("C:\\Users\\hp\\Desktop\\testexcel.xlsx");
//	To load that particular location in order to perform the action
	
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sh1 = wb.getSheet("Testsheet");
	DataFormatter df = new DataFormatter();
	String stringvalue = df.formatCellValue(sh1.getRow(row).getCell(clm));
	
	
	
	return stringvalue;
	
}

}
}
