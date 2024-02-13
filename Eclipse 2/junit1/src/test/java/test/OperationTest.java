package test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.Operation;
public class OperationTest {
	int i=1;
	@AfterEach
	public void b4() {
		System.out.println("Testcase finished: "+i);
		i++;
	}
	@Test
	public void addTest() {
		int actualResult=Operation.add(1,2);
		Assertions.assertEquals(3,actualResult);
	}
	
	@Test
	public void addTest1() {
		int actualResult=Operation.add(5,0);
		Assertions.assertEquals(5,actualResult);
	}
	
	@ParameterizedTest
	@CsvSource({"1,2,3","3,4,7"})
	void testAddition(int f,int s, int exp) {
		int r=Operation.add(f, s);
		Assertions.assertEquals(exp, r);
	}
}
