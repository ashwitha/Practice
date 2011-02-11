import junit.framework.TestCase;


public class GridTest extends TestCase 
{
	public void testToFindNumberOfRoutes()
	{
		assertEquals(184756, new Grid().progress(0, 0));
	}

}
