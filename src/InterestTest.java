import static org.junit.Assert.*;

import org.junit.Test;

public class InterestTest {

	
	Interest i =new Interest();
	@Test
	void testCalSimpleInterest() {
		
		assertEquals(8500,i.SimpleInterest(68000, 9.6f,9),0.0);
	}

	@Test
	void testCalCompoundInterest() {
		
		assertEquals(21755.342888139312,i.CompoundInterest(20202, 2.5f,3),0.0);
	}
}
