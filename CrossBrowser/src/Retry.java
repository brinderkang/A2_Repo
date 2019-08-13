import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class Retry implements IRetryAnalyzer {

	int minretryCount=0;
	int maxretryCount=2;
	
	@Override
	public boolean retry(ITestResult result) {
		
		
		if(minretryCount<=maxretryCount)
		{
			System.out.println("Test Failed :- "+ result.getName());
			System.out.println("Retrying test count :-  "+(minretryCount+1));
			minretryCount++;
			return true;
		}
		
		return false;
	}

}
