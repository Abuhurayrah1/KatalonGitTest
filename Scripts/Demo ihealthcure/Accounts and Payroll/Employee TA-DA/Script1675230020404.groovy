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

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 24/24th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test7/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('1st Month/day 24/24th day test6/Page_/span_Accounts  Payroll'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test7/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('1st Month/day 24/24th day test6/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test7/Page_/span_Employee TADA'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test7/Page_Employee TADA/button_Add Employee TADA'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test7/Page_Employee TADA/span_Select Employee'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test7/Page_Employee TADA/ul_Select Employee82401-2464218-9Mr. Sajid _9d8e0c'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test7/Page_Employee TADA/input__Title'), 'asd')

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test7/Page_Employee TADA/input_TA Amount_TA'), 
    '1')

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test7/Page_Employee TADA/input_DA Amount_DA'), 
    '2')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test7/Page_Employee TADA/input__Month'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test7/Page_Employee TADA/td_1'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test7/Page_Employee TADA/textarea_Description_Description'), 
    'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test7/Page_Employee TADA/input_Remarks_btn btn-primary'))

WebUI.closeBrowser()

