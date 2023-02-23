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

WebUI.navigateToUrl('http://demo.ihealthcure.com/Account/LogIn?ReturnUrl=%2f')

WebUI.setText(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_/span_Doctor Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_/span_Patients Queue'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_Patients Queue/button_Appointment Patients'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_Patients Queue/button_Appointment Patients_close'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_Patients Queue/button_Add Patients'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_Patients Queue/div_Select Title'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_Patients Queue/span_Mr'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_Patients Queue/select_Select TitleMr.Mrs.MissDr.Prof.Not A_e0dd14'), 
    'c1b03d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_Patients Queue/input__FirstName'), 'asd')

WebUI.setText(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_Patients Queue/input__CNICNumber'), '32132-6549765-2')

WebUI.setText(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_Patients Queue/input__yb'), '52')

WebUI.setText(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_Patients Queue/input__Address'), 'asd')

WebUI.setText(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_Patients Queue/input__CellNumber'), '03123213212')

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_Patients Queue/button_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_Patients Queue/button_Save'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test1/Page_Patients Queue/button_Appointment Patients_close'))

WebUI.closeBrowser()

