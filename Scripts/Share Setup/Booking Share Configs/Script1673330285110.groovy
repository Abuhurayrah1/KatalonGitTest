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

WebUI.setText(findTestObject('Object Repository/1st Month/day 14/14th day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 14/14th day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test5/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test5/Page_/span_Share Setup'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test5/Page_/span_Booking Share Configs'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test5/Page_Booking Share Configs/button_Add New'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test5/Page_Booking Share Configs/div_Select Doctor'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test5/Page_Booking Share Configs/a_Dr. Abdul Hadi  Postgraduate Trainee'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 14/14th day test5/Page_Booking Share Configs/select_Select DoctorDr. Abdul Hadi  Postgra_1b5be0'), 
    '30db4835-211d-4a39-a604-1744bfadcadd', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 14/14th day test5/Page_Booking Share Configs/input_Share Amount_ShareAmount'), 
    '100')

WebUI.setText(findTestObject('Object Repository/1st Month/day 14/14th day test5/Page_Booking Share Configs/input_Share Amount (IPD)_ShareAmountIPD'), 
    '100')

WebUI.setText(findTestObject('Object Repository/1st Month/day 14/14th day test5/Page_Booking Share Configs/textarea_Description_EntityDescription'), 
    'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test5/Page_Booking Share Configs/input_Select_Submit'))

WebUI.closeBrowser()

