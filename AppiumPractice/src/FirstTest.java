import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class FirstTest extends TestBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		IOSDriver<IOSElement> driver = Setup();
		
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]").click();
		
	}

}
