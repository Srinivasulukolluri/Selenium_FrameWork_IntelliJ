package Reports;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Constants.CommonConstants;
import Utilities.ConfigReader;

public class ExtentReportManager {

	
	public static ExtentReports extenReport;
	public static String extentReportFile;

	public static ExtentReports setupExtentReport() {
		
		String fileName = "ExecutionReport_" + new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date()) + ".html";
		String filePath = CommonConstants.getExtentReportFilePath();
				
		extentReportFile = filePath + fileName;

		extenReport = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
		sparkReporter.config().setReportName("Guru99Bank functional test report");
		sparkReporter.config().setDocumentTitle("Guru99Bank autumation execution report");
		sparkReporter.config().setTimeStampFormat("dd/MM/yyyy HH:mm:ss");
		
		extenReport.attachReporter(sparkReporter);
		extenReport.setSystemInfo("Application URL", ConfigReader.getPropertyFromKey("url"));
		extenReport.setSystemInfo("Browser",  ConfigReader.getPropertyFromKey("browser"));
		extenReport.setSystemInfo("Tester", "Amul Sinfal");
		extenReport.setSystemInfo("Operating System", System.getProperty("os.name"));
		extenReport.setSystemInfo("Java version", System.getProperty("java.version"));

		return extenReport;
	}
}
