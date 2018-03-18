package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class Config {
	
	private static Properties configFile;
	
	static {
		String path = "/Users/Karakol/Documents/eclipse-workspace/HomeDepot/src/test/resources/testData/configuration.properties";
		
		try {
			FileInputStream input = new FileInputStream(path);
			configFile = new Properties();
			configFile.load(input);
			
			input.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) {
		if(configFile.containsKey(key)) {
			return configFile.getProperty(key);
		}else {
			throw new RuntimeException("Key " + key + " is not present in properties file");
		}
	}
}
