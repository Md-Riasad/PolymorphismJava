import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void test() {
		
		Calculation C1 = new Calculation();
		
		int reult =C1.add(5, 5);
		assertEquals(10,reult);
		
	   int re = C1.add(5, 5, 5);
	    assertEquals(15, re);
	    
	}

}
