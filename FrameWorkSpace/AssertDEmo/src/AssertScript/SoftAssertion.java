package AssertScript;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion 
{
	@Test
	public void softAssertion()
	{
		SoftAssert assertion =new SoftAssert();
		System.out.println("assert started");
		assertion.assertEquals(12, 13,"values is not matching please check");
		System.out.println("assert completed");
		assertion.assertAll();

	}
	@Test
	public void hardAssertion()
	{
		System.out.println("assert started");
		Assert.assertEquals(15, 16,"values does not match please check");
		System.out.println("assert completed");
	}
}
