package parallel;

import org.testng.annotations.Test;

public class TestNGParallelMethods 
{
  @Test
  public void test1() 
  {
	  System.out.println("iam inside Test1" + Thread.currentThread().getId());
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("iam inside Test2" + Thread.currentThread().getId());
  }
  
  @Test
  public void test3() 
  {
	  System.out.println("iam inside Test3" + Thread.currentThread().getId());
  }
}
