package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class Config {
	
	private static Properties configFile;
	
	static {
		String path = "./src/test/resources/testData/configurations.properties";
		
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
