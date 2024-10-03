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

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Landing Page/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Landing Page/input_Name_formBasicName'), 'reyhan')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Landing Page/input_Email_formBasicEmail'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_R17 Career/Landing Page/input_Password_formBasicPassword'), 'BiXHs0vd74kHNayeCcaY2w==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_R17 Career/Landing Page/input_Confirm Password_formBasicConfirmPassword'), 
    'BiXHs0vd74kHNayeCcaY2w==')

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Landing Page/button_Sign Up'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Landing Page/div_Please fill in all required fields'))

WebUI.closeBrowser()

