package msb.pages
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class CommonActions {
	
	@Keyword
	public static void openAndNavigateToMSB() {
		WebUI.openBrowser("")
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.G_URL_MSB)
		WebUI.waitForElementClickable(findTestObject("Object Repository/HomePage/btn_PorletClose"), GlobalVariable.LONG_TIMEOUT)
		WebUI.click(findTestObject("Object Repository/HomePage/btn_PorletClose"))
	}
}
