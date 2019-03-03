package sudheer_junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAdd {
	Cal c=new Cal();
@Before
public void setUp()
{
	System.out.println("before");
}
	@Test
	public void test() {
		assertEquals(10, c.add(3, 7));
	}
@After
public void tearDown()
{
	System.out.println("after");
}
}
