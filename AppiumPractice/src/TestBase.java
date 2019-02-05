import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * 
 */
/**
 * @author Lalit
 *
 */
public class TestBase {
	
	public static void main(String args[]) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		//Following capability required for ios version greater than 8
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		cap.setCapability(MobileCapabilityType.APP, "//users//Lalit//Desktop//UICatalog.app");
	
		
		AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
		
	}
	
}