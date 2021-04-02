package excelDataDrivern;

import java.util.Hashtable;

import com.project.MavenMarchSelenium9_30AMBatch.BaseTest;

public class DataUtils extends BaseTest
{
	
	public static Object[][] getTestData(ExcelAPI e, String sheetName, String testCaseName)
	{
		
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
		Object[][] d = new Object[rows][1];
		Hashtable<String , String> table=null ;
		
		for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
		{
			table = new Hashtable<String, String>();
			for(int cNum=0;cNum<cols;cNum++) 
			{
				//d[dataRow][cNum]= e.getCellData(sheetName, cNum, rNum);
				String key = e.getCellData(sheetName, cNum, colStartRowNum);
				String value = e.getCellData(sheetName, cNum, rNum);
				table.put(key, value);	
			}
			d[dataRow][0] = table;
			dataRow++;
		}
	return d;
	}

}
