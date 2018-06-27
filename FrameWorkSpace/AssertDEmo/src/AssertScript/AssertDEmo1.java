package AssertScript;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDEmo1 
{
	@Test
	public void assertTest1()
	{
		Assert.assertEquals(2,3,"the value is not matched");
	}
	@Test
	public void assertTest2()
	{
		System.out.println("test started");
		Assert.assertEquals(12, 12);
		System.out.println("test completed");
	}
	@Test
	public void assertTest3()
	{
		System.out.println("test started");
		Assert.assertEquals(50, 50,"value are matching");
		System.out.println("test completed");
	}
	@Test
	public void assertTest4()
	{
		System.out.println("test started");
		Assert.assertEquals(15, 20,"value is not matching plz check the test case");
		System.out.println("test completed");
	}
	@Test
	public void assertTest5()
	{
		Assert.assertEquals("hello", "hello","values are matching");
	}
	@Test
	public void assertTest6()
	{
		System.out.println("test started");
		String str="kaushal mandal";
		Assert.assertTrue(str.contains("kaushal"));
		System.out.println("completed and assertion is true");
	}
	@Test
	public void assertTest7()
	{
		System.out.println("test started");
		Assert.assertFalse(false);
		System.out.println("completed");
		
	}

}
