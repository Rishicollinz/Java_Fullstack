package test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.MessageUtil;
public class MessageUtilTest {
	String message="Robert";
	MessageUtil messageUtil=new MessageUtil(message);
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutation");
		message="Hi!"+"Robert";
		assertEquals(message,messageUtil.salutationMessage());
	}
	

}