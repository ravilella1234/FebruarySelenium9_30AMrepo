package excelDataDrivern;

import org.testng.annotations.Test;

import com.project.MavenMarchSelenium9_30AMBatch.BaseTest;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DM_001 extends BaseTest
{
	
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> h) 
  {
	  
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	    ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\suitex.xlsx");
		sheetName = "data";
		testCaseName = "LoginTest";
		
		return DataUtils.getTestData(e, sheetName, testCaseName);
  }
}
