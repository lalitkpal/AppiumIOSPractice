import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
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
	
	static IOSDriver<IOSElement> driver;
	
	public static IOSDriver<IOSElement> Setup() throws MalformedURLException{
		
		File appDir = new File("src");
		File app = new File(appDir, "UICatalog.app");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		//Following capability required for ios version greater than 8
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		System.out.println(app.getAbsolutePath());
	
		
		driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		return driver;
	}
	
}