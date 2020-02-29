package jesus;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

          @Override
          public void onTestStart(ITestResult result) {
                   System.out.println("Test method started: "+result.getName());
          }

          @Override
          public void onTestSuccess(ITestResult result) {
                   System.out.println("Test method passed: "+result.getName());
                  
          }

          @Override
          public void onTestFailure(ITestResult result) {
                   System.out.println("Test method failed: "+result.getName());
                   }

          @Override
          public void onTestSkipped(ITestResult result) {
                   // TODO Auto-generated method stub
                  
          }

          @Override
          public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
                   // TODO Auto-generated method stub
                  
          }

          @Override
          public void onStart(ITestContext context) {
                   System.out.println("hi...start");
                   // TODO Auto-generated method stub
                  
          }

          @Override
          public void onFinish(ITestContext context) {
                   // TODO Auto-generated method stub
        	  System.out.println("hi...Finish");
          }

}