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

WebUI.setText(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_/span_Admin  HR'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_/span_Show Causes'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_Show Cause/button_Add Show Cause'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_Show Cause/div_Select User'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_Show Cause/input_Select User_form-control'), 
    'ambar')

WebUI.click(findTestObject('1st Month/day 19/19th day test11/Page_Explanation/span_37201-5892405-0Miss Ambar Sultan'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_Show Cause/div_Select User'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_Show Cause/div_Select Users'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_Show Cause/div_Select Users'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_Show Cause/input__Subject'), 'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_Show Cause/input__Date'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_Show Cause/td_1'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_Show Cause/button_Please Select'))

WebUI.setText(findTestObject('1st Month/day 19/19th day test11/Page_Explanation/input_CC_form-control'), 'ambar')

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_Show Cause/button_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test12/Page_Show Cause/button_Submit'))

WebUI.closeBrowser()
