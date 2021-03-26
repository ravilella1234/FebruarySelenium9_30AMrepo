package excelDataDrivern;

public class DataManagement 
{

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testCaseName = "LoginTest";
		
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
		for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
		{
			for(int cNum=0;cNum<cols;cNum++) 
			{
				System.out.println(e.getCellData(sheetName, cNum, rNum));
			}
		}
	}

}
