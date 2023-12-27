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

WebUI.setText(findTestObject('Object Repository/1st Month/day 19/19th day test9/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 19/19th day test9/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test9/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test9/Page_/span_Admin  HR'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test9/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test9/Page_/span_Two Factor Authentication'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test9/Page_Two Factor Authentication/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 19/19th day test9/Page_Two Factor Authentication/input_Please Select_form-control'), 
    'ambar')

WebUI.click(findTestObject('1st Month/day 19/19th day test8/Page_User Discount Restriction/span_Miss Ambar Sultan  Charge Nurse'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test9/Page_Two Factor Authentication/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 19/19th day test9/Page_Two Factor Authentication/input_Contact Number_ContactNo'), 
    '03000000000')

WebUI.setText(findTestObject('Object Repository/1st Month/day 19/19th day test9/Page_Two Factor Authentication/input_Email_Email'), 
    'abc@gmail.com')

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test9/Page_Two Factor Authentication/button_Add'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test9/Page_Two Factor Authentication/button_Submit'))

WebUI.closeBrowser()

