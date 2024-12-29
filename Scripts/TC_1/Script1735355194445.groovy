import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.junit.Assert.assertEquals
import org.openqa.selenium.Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import msb.pages.CommonActions
import msb.pages.HomePage

String keyword = 'Vay thấu chi từ lương'
CommonActions.openAndNavigateToMSB()
HomePage.verifyAccessToHomePageSuccessFully()
WebUI.setText(findTestObject('Object Repository/CommonComponents/txt_SearchBar'), keyword + Keys.ENTER)
String value = WebUI.getAttribute(findTestObject('Object Repository/CommonComponents/txt_SearchBar'), 'value')
WebUI.waitForElementVisible(findTestObject('Object Repository/SearchResultsWindow/txt_SuggestedTitle'), 10)
String suggestTile = WebUI.getText(findTestObject('Object Repository/SearchResultsWindow/txt_SuggestedTitle')) 
'The keyword is displayed in the search bar'
assertEquals(value, keyword)
'verify results title will be displayed correctly.'
assertEquals(suggestTile, keyword)	
WebUI.closeBrowser()
