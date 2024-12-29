package msb.pages
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertTrue

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


class HomePage {
	
	@Keyword
	public static void verifyAccessToHomePageSuccessFully() {
		String url = WebUI.getUrl()
		WebUI.comment('url: ' + url)
		assertTrue(url.contains(GlobalVariable.G_URL_MSB))
		WebUI.verifyElementVisible(findTestObject("Object Repository/CommonComponents/img_Logo"))
	}

}