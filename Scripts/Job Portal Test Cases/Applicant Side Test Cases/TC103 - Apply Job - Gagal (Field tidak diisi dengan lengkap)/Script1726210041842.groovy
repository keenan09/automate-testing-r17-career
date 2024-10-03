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

WebUI.navigateToUrl('http://localhost:3000/r17-career/')

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Gagal/button_Apply Job'))

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Gagal/input_Name_applicantName'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Gagal/input_Email_applicantEmail'), 
    '1@1')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Gagal/input_Phone Number_phoneNumber'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Gagal/button_Next'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Gagal/form_NameEmailPhone NumberNext'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Gagal/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Gagal/form_NameEmailPhone NumberNext'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/Page_R17 Career/Job_Apply Job/Apply Gagal/button_Back to Career'))

WebUI.takeFullPageScreenshot()

