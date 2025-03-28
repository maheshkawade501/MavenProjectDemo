package testng.failtestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailTestScript {

    //running through testngfailtest.xml,
    // with the retryanalyser failed test cases run as per count mention in retryclass

    @Test  //(retryAnalyzer = RetryTestScript.class)  //this is rededunt method using reryanalyser
    public void testMethod1(){
        System.out.println("test1");
    }

    @Test  //(retryAnalyzer = RetryTestScript.class)
    public void testMethod2(){
        System.out.println("test2");
    }

    @Test //(retryAnalyzer = RetryTestScript.class)
    public void testMethod3(){
        Assert.assertTrue(false);//forcefully fail(Manually rerun test testng-failed.xml after correcting)
        System.out.println("test3");
    }

    @Test //(retryAnalyzer = RetryTestScript.class)
    public void testMethod4(){
        Assert.assertTrue(false);//forcefully fail(Manually rerun test testng-failed.xml after correcting)
        System.out.println("test4");
    }

    @Test //(retryAnalyzer = RetryTestScript.class)
    public void testMethod5(){
        System.out.println("test5");
    }
}
