package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;

public class Listenerss extends TestListenerAdapter {

	
	  @Override
	  public void onTestFailure(ITestResult tr) {
		  System.out.println("❌ FAILED : " + tr.getName());
	        System.out.println("Reason   : " + tr.getThrowable()); // ✅ prints actual error
	  }

	  @Override
	  public void onTestSkipped(ITestResult tr) {
	    log("Skipped");
	  }

	  private void log(String string) {
		System.out.println(string);
	}
	@Override
	  public void onTestSuccess(ITestResult tr) {
	    log("Yup test case got pass");
	  }
}
