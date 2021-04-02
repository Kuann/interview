package coding.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegexTest {

	@Test
	public void test_match_tenants() {
	      String line = "b63d7565-3be1-4512-b206-c3dda7cb795e";
	      String pattern = "(b63d7565-3be1-4512-b206-c3dda7cb795e)|(sasa)";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      
	      
	      
	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      
	      System.out.println(m.matches());

	}
	
}
