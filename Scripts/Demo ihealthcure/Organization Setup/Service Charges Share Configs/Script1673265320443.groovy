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

WebUI.setText(findTestObject('Object Repository/1st Month/day 14/14th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 14/14th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test1/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test1/Page_/span_Organization Setup'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test1/Page_/div_Cheque Printing Vault_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test1/Page_/div_Cheque Printing Vault_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test1/Page_/span_Service Charges Share Configs'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test1/Page_Doctor Service Charges Share Configs/button_Add New'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test1/Page_Doctor Service Charges Share Configs/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 14/14th day test1/Page_Doctor Service Charges Share Configs/input_Please Select_form-control'), 
    'Abdul Hadi')

WebUI.click(findTestObject('1st Month/day 14/14th day test1/Page_Doctor Service Charges Share Configs/span_Dr. Abdul Hadi  Postgraduate Trainee'))

WebUI.click(findTestObject('1st Month/day 14/14th day test1/Page_Doctor Service Charges Share Configs/div_Dr. Abdul Hadi  Postgraduate Trainee'))

WebUI.click(findTestObject('1st Month/day 14/14th day test1/Page_Doctor Service Charges Share Configs/div_Equipment'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test1/Page_Doctor Service Charges Share Configs/span_Equipment'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 14/14th day test1/Page_Doctor Service Charges Share Configs/select_EquipmentServicetest 01test 02'), 
    '742f6373-0452-e911-80cb-005056af7162', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test1/Page_Doctor Service Charges Share Configs/div_Equipment'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 14/14th day test1/Page_Doctor Service Charges Share Configs/input__ShareAmount'), 
    '500')

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test1/Page_Doctor Service Charges Share Configs/input_Is Update already added Share details_Submit'))

WebUI.closeBrowser()

