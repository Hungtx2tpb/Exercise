import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.junit.Assert.assertEquals
import org.openqa.selenium.Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import msb.pages.CommonActions
import msb.pages.HomePage

String keyword = 'xyz123'
CommonActions.openAndNavigateToMSB()
HomePage.verifyAccessToHomePageSuccessFully()
WebUI.setText(findTestObject('Object Repository/CommonComponents/txt_SearchBar'), keyword + Keys.ENTER)
String value = WebUI.getAttribute(findTestObject('Object Repository/CommonComponents/txt_SearchBar'), 'value')
WebUI.waitForElementVisible(findTestObject('Object Repository/SearchResultsWindow/txt_InvalidMessage'), 10)
String message = WebUI.getText(findTestObject('Object Repository/SearchResultsWindow/txt_InvalidMessage')) 
'The keyword is displayed in the search bar'
assertEquals(value, keyword)
'verify Invalid message should be displayed'
assertEquals(message, 'Xin lỗi, chúng tôi không tìm được bất kỳ kết quả nào cho từ khóa mà bạn tìm kiếm')	
WebUI.closeBrowser()
