package excelDataDrivern;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriterByColumnName 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\testdatanew.xlsx");
		FileOutputStream fos ; 
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell;
		
		int colNum = -1;
		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals("Result"))
			{
				colNum=i;
			}
		}
		
		row = sheet.getRow(2);
		cell = row.getCell(colNum);
		
		cell.setCellValue("Aborted");
		
		fos = new FileOutputStream("C:\\Users\\DELL\\Desktop\\testdatanew.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		

	}

}
