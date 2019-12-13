package lamp_data;

import java.security.SecureRandom;

public class GeneratedToken {
	
public static SecureRandom random =  new SecureRandom();
	
	public String genToken() {
		
		int value1 = 1000 + random.nextInt(9000);
		int value2 = 10 + random.nextInt(90);
		return "lamp" + value1 +  value2;
	}

}
