package testNG;

import org.testng.annotations.Test;

public class DisableEnablemodule1 {
	@Test(enabled=false)     
    public void test1()                                          // First test case  
    {  
        System.out.println("Hello javaTpoint!!");  
    }  
      
    @Test  
    public void test2()                                          // Second test case  
    {  
        System.out.println("JTP Travels");  
    }}  

