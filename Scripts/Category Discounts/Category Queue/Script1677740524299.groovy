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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_/span_Category Discounts'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_/span_Category Queue'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_Category Queue/a_-_CategorizePatient service-grid btn btn-_4c021e'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_CategoryApplicationDetail/input_Age_1'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_CategoryApplicationDetail/input_36,000 to 45,000_3'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_CategoryApplicationDetail/input_15,000_6'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_CategoryApplicationDetail/input_Up to 3 persons_8'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_CategoryApplicationDetail/input_No of Earning  Support Members_9'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_CategoryApplicationDetail/input_Dual Valve Replacement Surgery_10'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_CategoryApplicationDetail/input_Motercycle  Rickshaw_11'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_CategoryApplicationDetail/input_Rented House_13'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_CategoryApplicationDetail/input_Middle Social Economic Status_12'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_CategoryApplicationDetail/input_20,000_5'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_CategoryApplicationDetail/input_10,000_4'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_CategoryApplicationDetail/input_Job less_2'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_CategoryApplicationDetail/input_60 years_1'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_CategoryApplicationDetail/input__ReferedFor'), 
    'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_CategoryApplicationDetail/input_Please enter referred for_Submit'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test16/Page_Category Queue/a_-_VerificationDMSInModal service-grid btn_166ecc'))

WebUI.closeBrowser()

