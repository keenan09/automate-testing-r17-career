import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/cms')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Filtering Dashboard/input_Email_formAdminEmail'), 
    'admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Filtering Dashboard/input_Password_formAdminPassword'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Filtering Dashboard/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Filtering Dashboard/input_Start Date_filter-input form-control _e5df8f'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Filtering Dashboard/div_12'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_R17 Career/HCD Side Object/Dashboard/Filtering Dashboard/input_End Date_filter-input form-control _e5df8f'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Filtering Dashboard/div_14'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Filtering Dashboard/button_Reset'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Filtering Dashboard/select_All PositionsIT Business AnalystDigi_8111a1'), 
    'IT Business Analyst', true)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Filtering Dashboard/button_Reset'))

WebUI.closeBrowser()

