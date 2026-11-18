import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.GCS_UAT_Environment.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(2560, 1271)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://katalontest-uat.ifscsc.cloud/landing-page"

TrueTestScripts.navigate("/landing-page")

"Step 2: Click on link ifsCloudEmployeeSolutions -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/GCS UAT Environment/Page_landing_page/link_ifsCloudEmployeeSolutions'))

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on input findPage"

TrueTestScripts.click(findTestObject('AI-Generated/GCS UAT Environment/Page_main_ifsapplications_web/input_findPage'))

"Step 5: Enter input value in input findPage"

TrueTestScripts.setText(findTestObject('AI-Generated/GCS UAT Environment/Page_main_ifsapplications_web/input_findPage'), input_findPage)

"Step 6: Click on link customerCustomers -> Navigate to page '/main/ifsapplications/web/page/Customers/*'"

TrueTestScripts.click(findTestObject('AI-Generated/GCS UAT Environment/Page_main_ifsapplications_web/link_customerCustomers'))

"Step 7: Click on button new"

TrueTestScripts.click(findTestObject('AI-Generated/GCS UAT Environment/Page_main_ifsapplications_web_page_Customers/button_new'))

"Step 8: Enter input value in input customerName (customer)"

// Bind values to the variables in the locators of "AI-Generated/GCS UAT Environment/Dynamic Objects/Page_main_ifsapplications_web_page_Customers/input_customerName"
TrueTestScripts.setText(findTestObject('AI-Generated/GCS UAT Environment/Dynamic Objects/Page_main_ifsapplications_web_page_Customers/input_customerName', ['input_customerName_InternalLabel_1': input_customerName_InternalLabel, 'input_customerName_css_value_1': input_customerName_css_value]), input_customerName)

"Step 9: Click on input customerName (name)"

// Bind values to the variables in the locators of "AI-Generated/GCS UAT Environment/Dynamic Objects/Page_main_ifsapplications_web_page_Customers/input_customerName"
TrueTestScripts.click(findTestObject('AI-Generated/GCS UAT Environment/Dynamic Objects/Page_main_ifsapplications_web_page_Customers/input_customerName', ['input_customerName_InternalLabel_1': input_customerName_InternalLabel_1, 'input_customerName_css_value_1': input_customerName_css_value_1]))

"Step 10: Enter input value in input customerName (name2)"

// Bind values to the variables in the locators of "AI-Generated/GCS UAT Environment/Dynamic Objects/Page_main_ifsapplications_web_page_Customers/input_customerName"
TrueTestScripts.setText(findTestObject('AI-Generated/GCS UAT Environment/Dynamic Objects/Page_main_ifsapplications_web_page_Customers/input_customerName', ['input_customerName_InternalLabel_1': input_customerName_InternalLabel_2, 'input_customerName_css_value_1': input_customerName_css_value_2]), input_customerName_1)

"Step 11: Click on button defaultLanguagePicker"

TrueTestScripts.click(findTestObject('AI-Generated/GCS UAT Environment/Page_main_ifsapplications_web_page_Customers/button_defaultLanguagePicker'))

"Step 12: Click on item english (english)"

// Bind values to the variables in the locators of "AI-Generated/GCS UAT Environment/Dynamic Objects/Page_main_ifsapplications_web_page_Customers/item_english"
TrueTestScripts.click(findTestObject('AI-Generated/GCS UAT Environment/Dynamic Objects/Page_main_ifsapplications_web_page_Customers/item_english', ['item_english_InternalRoleOptionName_1': item_english_InternalRoleOptionName, 'item_english_css_value_1': item_english_css_value]))

"Step 13: Click on button countryPicker"

TrueTestScripts.click(findTestObject('AI-Generated/GCS UAT Environment/Page_main_ifsapplications_web_page_Customers/button_countryPicker'))

"Step 14: Click on item english (unitedStatesOfAmerica)"

// Bind values to the variables in the locators of "AI-Generated/GCS UAT Environment/Dynamic Objects/Page_main_ifsapplications_web_page_Customers/item_english"
TrueTestScripts.click(findTestObject('AI-Generated/GCS UAT Environment/Dynamic Objects/Page_main_ifsapplications_web_page_Customers/item_english', ['item_english_InternalRoleOptionName_1': item_english_InternalRoleOptionName_1, 'item_english_css_value_1': item_english_css_value_1]))

"Step 15: Click on button customerCategoryPicker"

TrueTestScripts.click(findTestObject('AI-Generated/GCS UAT Environment/Page_main_ifsapplications_web_page_Customers/button_customerCategoryPicker'))

"Step 16: Click on item english (customer)"

// Bind values to the variables in the locators of "AI-Generated/GCS UAT Environment/Dynamic Objects/Page_main_ifsapplications_web_page_Customers/item_english"
TrueTestScripts.click(findTestObject('AI-Generated/GCS UAT Environment/Dynamic Objects/Page_main_ifsapplications_web_page_Customers/item_english', ['item_english_InternalRoleOptionName_1': item_english_InternalRoleOptionName_2, 'item_english_css_value_1': item_english_css_value_2]))

"Step 17: Click on div customerList"

TrueTestScripts.click(findTestObject('AI-Generated/GCS UAT Environment/Page_main_ifsapplications_web_page_Customers/div_customerList'))

"Step 18: Click on button save"

TrueTestScripts.click(findTestObject('AI-Generated/GCS UAT Environment/Page_main_ifsapplications_web_page_Customers/button_save'))

"Step 19: Click on button profileAndSettings"

TrueTestScripts.click(findTestObject('AI-Generated/GCS UAT Environment/Page_main_ifsapplications_web_page_Customers/button_profileAndSettings'))

"Step 20: Click on button logOut -> Navigate to page '/landing-page'"

TrueTestScripts.click(findTestObject('AI-Generated/GCS UAT Environment/Page_main_ifsapplications_web_page_Customers/button_logOut'))

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Create a customer record in IFS Cloud_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}