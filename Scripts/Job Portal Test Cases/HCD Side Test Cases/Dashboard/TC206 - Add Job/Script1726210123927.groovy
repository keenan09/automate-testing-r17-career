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

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Email_formAdminEmail'), 
    'admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Password_formAdminPassword'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/button_Jobs'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/a_Add Jobs'))

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Job Name_jobName'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Professional Hire_jobAimed'))

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Job Division_jobType'), 
    'operation')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Start Date_filter-input form-control'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Start Date_filter-input form-control'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/div_13'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Start Date_filter-input form-control'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/div_27'))

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/textarea_1'), '1')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Minimum Position Experience Needed_mi_0426d8'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Maximum Position Experience Needed_ma_1ac951'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Minimum Industry Experience Needed_mi_41a582'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Maximum Industry Experience Needed_ma_d5a60e'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Minimum Salary Needed_minSalary'), 
    '100000')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Maximum Salary Needed_maxSalary'), 
    '200000')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Languages Needed_english'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Languages Needed__mandarin'))

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_First Skill Needed_firstHardSkill'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Second Skill Needed_secondHardSkill'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/input_Third Skill Needed_thirdHardSkill'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/button_Submit'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_R17 Career/HCD Side Object/Dashboard/Add Job/div_Success'))

WebUI.click(findTestObject('Object Repository/Page_R17 Career/HCD Side Object/Dashboard/Add Job/button_OK'))

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

