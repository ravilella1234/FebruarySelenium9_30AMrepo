package parallel;

import java.util.Arrays;

import org.testng.TestNG;

public class RunSuiteParallel 
{

	public static void main(String[] args) 
	{
		//String [] s1 =  new String[3];
		//s1[0]="ravi";
		
		//String[] s2 = new String[] {"ravi","lella","sai"};
		
		TestNG ng = new TestNG();
		ng.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//megasuite.xml"}));
		ng.setSuiteThreadPoolSize(2);
		ng.run();
	}

}
