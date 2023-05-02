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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_/span_Customer Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_/span_Customers'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_Customer/button_Add Customer'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_Customer/input__Name'), 'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_Customer/input_Code_Code'), '0101')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_Customer/input_Company Name_CompanyName'), 
    'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_Customer/input__ContactNumber'), '0310000000000')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_Customer/textarea__Address'), 'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_Customer/input_CNIC_CNIC'), '03030-0303033-0')

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_Customer/input_Please enter a valid float number_Sub_92bc7f'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_Customer/a_asd_Action Update btn btn-sm btn-clean bt_303932'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_Customer/a_asd_Action Update btn btn-sm btn-clean bt_303932'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_Customer/input__btnSubmitAddress'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test9/Page_Customer/input_Please enter a valid float number_Upd_259f4e'))

WebUI.closeBrowser()

