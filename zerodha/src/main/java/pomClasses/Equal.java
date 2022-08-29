package pomClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Equal {

	
	@Test
	public void m1() {
		String str1 = "Hi";
		String str2 = "Hello";
		Assert.assertEquals(str1, str2);
		}	
	
	@Test
	public void m2() {
		String s = "Hello";
		String s1 = "Hello";
		Assert.assertNotEquals(s, s1);
		
	}
	
	@Test
	public void m3() {
		String s = null;
		Assert.assertNotNull(s);
	}
	
	@Test
	public void m4() {
		boolean status = true;
		Assert.assertTrue(status);
	}

		
	}

