package RunLoginTC;

import com.bootcamp.framework.testcases.LeafTapsHome;
import com.bootcamp.framework.testcases.LeafTapsLogin;
import com.framework.LeafTapsBaseClass.LeafTapsBaseClass;

public class RunLogin extends LeafTapsBaseClass

{
	
	public void verifyrunlogin() throws InterruptedException {
		// TODO Auto-generated method stub
		
		LeafTapsLogin ltl = new LeafTapsLogin();
		ltl.enterUsername().enterPassword().clickLoginButton();
		
		

	}

}
