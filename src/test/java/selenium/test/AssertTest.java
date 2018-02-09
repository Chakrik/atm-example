package selenium.test;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {
	
	int i = 2343;
	
	float f  = 4.9f;
	long l = 34343234343l;
	
	double d = 32.32;
	
	boolean b  = true;

	String s  = "S12312";
	String s1 = "\"Carolina\" (state song)";
	String s2 = "Carolina, Rhode Island, " 
			+ "a village that straddles the border of two "
			+ "towns in the U.S. state of Rhode Island" ;
		
	String s3 = s1 + s2+ s;

	
	

	@Test
	public void sampleTest() {
		
		Assert.assertEquals( true, true);
		Assert.assertEquals(2343, i);
		
		Assert.assertEquals(s1, s1);
		
		 b = false; 
		 
		 AssertTest at1  = new AssertTest();
		 
		 s = "" + at1;
		 
		 System.out.println(" Hi .. Some test " + at1);
			
		 int res = square(4,5);
		 
		 System.out.println(res);
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int square(int a, int b) {
		int sum = a + (2 * a * b);
		return sum;
	}
}
