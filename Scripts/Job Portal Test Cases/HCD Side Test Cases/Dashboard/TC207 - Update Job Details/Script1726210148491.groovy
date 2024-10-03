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

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Update Job Details/input_Email_formAdminEmail'), 
    'admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Update Job Details/input_Password_formAdminPassword'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Update Job Details/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Update Job Details/button_Jobs'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Update Job Details/a_Manage Jobs'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Update Job Details/button_Update'))

'unchecked'
WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Update Job Details/input_Languages_mandarin'))

WebUI.takeFullPageScreenshot()

'check'
WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Update Job Details/input_Languages_mandarin'))

WebUI.delay(1)

'unchecked'
WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Update Job Details/input_Languages_english'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Update Job Details/button_Update Job'))

WebUI.findWebElement(findTestObject('Page_R17 Career/HCD Side Object/Dashboard/Update Job Details/div_Success'))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Page_R17 Career/HCD Side Object/Dashboard/Update Job Details/button_Close'))

WebUI.takeFullPageScreenshot()

