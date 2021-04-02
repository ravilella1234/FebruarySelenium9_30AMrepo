package excelDataDrivern;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataManagementByDataProvider 
{
  @Test(dataProvider = "getData")
  public void f(String RunMode, String Browser, String UserName, String UserPassword)
  {
	  
  }
  
  @DataProvider
  public Object[][] getData() throws Exception
  {
	    ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testCaseName = "TestB";
		
		int testStartRowNum = 0;
		while(!e.getCellData(sheetName, 0, testStartRowNum).equals(testCaseName))
		{
			testStartRowNum++;
		}
		System.out.println("Test Starts from Row :-" + testStartRowNum);
		
		int colStartRowNum = testStartRowNum+1;
		int dataStartRowNum = testStartRowNum+2;
		
		
		//calculate rows of data
		int rows = 0;
		while(!e.getCellData(sheetName, 0, dataStartRowNum+rows).equals(""))
		{
			rows++;
		}
		System.out.println("Total rows are :- " + rows);
		
		
		//calculate total columns
		int cols = 0;
		while(!e.getCellData(sheetName, cols, colStartRowNum).equals(""))
		{
			cols++;
		}
		System.out.println("Total Cols are :- " + cols);
		
		//read the test Data
		int dataRow=0;
		Object[][] d = new Object[rows][cols];
		for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
		{
			for(int cNum=0;cNum<cols;cNum++) 
			{
				d[dataRow][cNum]= e.getCellData(sheetName, cNum, rNum);
			}
			dataRow++;
		}
	return d;
  }
}
