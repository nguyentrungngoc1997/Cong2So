package myjava.mybignumber;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MyBigNumberTest 
{
	@Test
	void testSum() 
	{
		MyBigNumber myClass = new MyBigNumber();
		String sum = myClass.sum("1", "2");
		assertEquals("3", sum);
	}
}