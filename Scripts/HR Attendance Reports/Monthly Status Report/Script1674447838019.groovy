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

WebUI.setText(findTestObject('Object Repository/1st Month/day 21/21st day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 21/21st day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 21/21st day test1/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 21/21st day test1/Page_/span_HR Attendance Reports'))

WebUI.click(findTestObject('Object Repository/1st Month/day 21/21st day test1/Page_/span_Monthly Status Report'))

WebUI.click(findTestObject('Object Repository/1st Month/day 21/21st day test1/Page_Monthly Status Report/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 21/21st day test1/Page_Monthly Status Report/input_Please Select_form-control'), 'ot')

WebUI.click(findTestObject('1st Month/day 20/20th day test4/Page_Attendence Report/span_OT'))

WebUI.click(findTestObject('Object Repository/1st Month/day 21/21st day test1/Page_Monthly Status Report/div_Please Select'))

WebUI.click(findTestObject('1st Month/day 21/21st day test1/Page_Monthly Status Report/Page_Monthly Status Report/div_Testing M'))

WebUI.click(findTestObject('1st Month/day 21/21st day test1/Page_Monthly Status Report/Page_Monthly Status Report/span_Testing M'))

WebUI.click(findTestObject('1st Month/day 21/21st day test1/Page_Monthly Status Report/Page_Monthly Status Report/div_Testing M'))

WebUI.click(findTestObject('Object Repository/1st Month/day 21/21st day test1/Page_Monthly Status Report/button_Generate Report'))

WebUI.closeBrowser()

