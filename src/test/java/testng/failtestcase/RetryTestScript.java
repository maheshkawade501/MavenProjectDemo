package testng.failtestcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTestScript implements IRetryAnalyzer {
//we need to add this class in failtestscript to rerun the failed test cases
    private int retryCount=0;
    private final int maxRetryCount=3;


    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxRetryCount) {

            retryCount++;
            return true;
        }
        return false;
    }
}
