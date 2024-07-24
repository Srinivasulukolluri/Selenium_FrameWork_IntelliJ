package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Constants.CommonConstants;

public class DataReader {
	
	   private static final Logger logger = LoggerFactory.getLogger(DataReader.class);

	    public static String getPropertyFromKey(String key) {
	        Properties property = new Properties();
	        
	        try (FileInputStream propertyFile = new FileInputStream(CommonConstants.getDataFilePath())) {
	            property.load(propertyFile);
	        } catch (FileNotFoundException e) {
	            logger.error("Unable to locate data.properties file.", e);
	            return ""; // Return empty string or default value
	        } catch (IOException e) {
	            logger.error("Unable to open data.properties file.", e);
	            return ""; // Return empty string or default value
	        }

	        return property.getProperty(key, ""); // Default to empty string if key is not found
	    }


}
