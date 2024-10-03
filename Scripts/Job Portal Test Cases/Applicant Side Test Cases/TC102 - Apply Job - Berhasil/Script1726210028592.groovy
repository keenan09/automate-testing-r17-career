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

WebUI.navigateToUrl('http://localhost:3000/r17-career')

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/button_Apply Job'))

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_Name_applicantName'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_Email_applicantEmail'), 
    '1@1')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_Phone Number_phoneNumber'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_Relevance of Major to Position_compatibility'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_GPA_ipk'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_How Long Have You Been Involved in Th_a6d4d9'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_How Long Have You Been Involved in Th_795ed3'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_How Much is Your Expected Salary_sala_954421'), 
    '50000')

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/button_Continue'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_How many years of experience do you h_883aab'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_How many years of experience do you h_916e13'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_How many years of experience do you h_c362bb'), 
    '1')

WebUI.check(findTestObject('Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_english_languages'))

WebUI.verifyElementChecked(findTestObject('Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_english_languages'), 
    2)

WebUI.check(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_mandarin_languages'))

WebUI.verifyElementChecked(findTestObject('Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_mandarin_languages'), 
    2)

WebUI.uploadFile(findTestObject('Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/input_Unggah CV anda_resume'), 
    file)

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/button_Submit'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Job/button_Back to Career'))

