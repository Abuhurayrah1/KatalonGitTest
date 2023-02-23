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

WebUI.setText(findTestObject('Object Repository/1st Month/day 14/14th day test6/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 14/14th day test6/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test6/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test6/Page_/span_Share Setup'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test6/Page_/span_Dr Services Booking Share Configs'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/button_Add New'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/button_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/input_Please Select_form-control'), 
    'abdul hadi')

WebUI.click(findTestObject('1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/span_Dr. Abdul Hadi  Postgraduate Trainee'))

WebUI.click(findTestObject('1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/div_Dr. Abdul Hadi  Postgraduate Trainee'))

WebUI.click(findTestObject('1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/div_Echocardiography'))

WebUI.click(findTestObject('1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/span_Echocardiography'))

WebUI.click(findTestObject('1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/div_Echocardiography'))

WebUI.click(findTestObject('1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/div_Adult Echocardiography'))

WebUI.click(findTestObject('1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/span_Adult Echocardiography'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/div_Adult Echocardiography'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/div_Please Select'))

WebUI.click(findTestObject('1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/span_Echo'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/input__ShareAmount'), 
    '500')

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test6/Page_Dr Services Booking Share Configs/input_Is Update already added Share details_Submit'))

WebUI.closeBrowser()

