package Constants;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonConstants {
	
	    private static final int IMPLICITWAITTIME = 30;
	    private static final int PAGELOADTIMEOUT = 30;

	    public static String getDateTimeStamp() {
	        return new SimpleDateFormat("ddMMyyyy_hhmmss").format(new Date());
	    }

	    private static final String projectDirectory = System.getProperty("user.dir");
	    private static final String RESOURCES_FILEPATH = projectDirectory + File.separator + "resources";
	    private static final String CONFIG_FILEPATH = RESOURCES_FILEPATH + File.separator + "config.properties";
	    private static final String DATA_FILEPATH = RESOURCES_FILEPATH + File.separator + "data.properties";
	    private static final String LOG4J_FILEPATH = RESOURCES_FILEPATH + File.separator + "log4j.properties";
	    private static final String SCREENSHOT_FILEPATH = projectDirectory + File.separator + "\\Screenshots\\";
	    private static final String EXTENTREPORT_FILEPATH = projectDirectory + File.separator + "Reports";
	    
	    public static String getScreenshotFilePath() {
	        return SCREENSHOT_FILEPATH;
	    }

	    public static String getExtentReportFilePath() {
	        return EXTENTREPORT_FILEPATH;
	    }

	    public static String getDataFilePath() {
	        return DATA_FILEPATH;
	    }

	    public static String getConfigFilePath() {
	        return CONFIG_FILEPATH;
	    }

	    public static String getScreenshotFileName() {
	        return "Screenshot_" + getDateTimeStamp() + ".png";
	    }

	    public static int getImplicitWaitTime() {
	        return IMPLICITWAITTIME;
	    }

	    public static int getPageLoadTimeOut() {
	        return PAGELOADTIMEOUT;
	    }

	    public static String getLog4jFilePath() {
	        return LOG4J_FILEPATH;
	    }
}
