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

WebUI.navigateToUrl('https://model.ihealthcure.com/Account/Login')

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test6/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 30/30th day test6/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test6/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test6/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test6/Page_/span_Lab Investigations'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test6/Page_/span_Inactive Investigations'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test6/Page_Inactive Investigations/button_Add Inactive Investigations'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test6/Page_Inactive Investigations/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test6/Page_Inactive Investigations/span_Cardiology'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test6/Page_Inactive Investigations/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test6/Page_Inactive Investigations/input__InvestigationName'), 
    'asdasd')

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test6/Page_Inactive Investigations/input_CPT Code_InvestigationCode'), 
    '010101')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test6/Page_Inactive Investigations/input_Provisional Reports Printable_SubmitService'))

WebUI.closeBrowser()

