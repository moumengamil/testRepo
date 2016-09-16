package MyTest;
import org.testng.Assert;		
import org.testng.annotations.Test;	

public class Testauto {
	
	
			
			
		
				
			@Test				
			public void test_to_pass() {	
								 
				Assert.assertEquals(1,1); 		
			}	
			@Test				
			public void test_to_fail() {	
								 
				Assert.assertEquals(1,4); 		
			}	
				
		
	

}
