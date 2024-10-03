package stepDefinitions;

import org.apache.commons.lang3.RandomStringUtils;

public class BaseClass {
	
	//create method random to generate random email
	public static String randomString() {
		String generateString1 = RandomStringUtils.randomAlphabetic(6);
		return(generateString1);
	}

}
