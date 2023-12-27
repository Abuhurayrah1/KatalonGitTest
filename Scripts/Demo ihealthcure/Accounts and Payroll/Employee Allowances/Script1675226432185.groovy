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

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_/span_Accounts  Payroll'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_/span_Employee Allowances'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_Employee Allowances/button_Add Employee Allowances'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_Employee Allowances/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_Employee Allowances/input_Please Select_form-control'), 
    'bps')

WebUI.click(findTestObject('1st Month/day 24/24th day test2/Page_Scale Allowances/span_BPS-11'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_Employee Allowances/div_Please Select'))

WebUI.click(findTestObject('1st Month/day 24/24th day test2/Page_Employee Allowances/div_PLA'))

WebUI.click(findTestObject('1st Month/day 24/24th day test2/Page_Scale Allowances/span_PLA'))

WebUI.click(findTestObject('1st Month/day 24/24th day test2/Page_Employee Allowances/div_PLA'))

WebUI.click(findTestObject('1st Month/day 24/24th day test2/Page_Employee Allowances/div_Accountant'))

WebUI.click(findTestObject('1st Month/day 24/24th day test2/Page_Scale Allowances/span_Accountant'))

WebUI.click(findTestObject('1st Month/day 24/24th day test2/Page_Employee Allowances/div_Accountant'))

WebUI.click(findTestObject('1st Month/day 24/24th day test2/Page_Employee Allowances/div_Accounts'))

WebUI.click(findTestObject('1st Month/day 24/24th day test2/Page_Employee Allowances/span_Accounts'))

WebUI.click(findTestObject('1st Month/day 24/24th day test2/Page_Employee Allowances/div_Accounts'))

WebUI.click(findTestObject('1st Month/day 24/24th day test2/Page_Employee Allowances/div_82401-2464218-9Mr. Sajid Mehmoodd'))

WebUI.click(findTestObject('1st Month/day 24/24th day test2/Page_Employee Allowances/span_82401-2464218-9Mr. Sajid Mehmoodd'))

WebUI.click(findTestObject('1st Month/day 24/24th day test2/Page_Employee Allowances/div_82401-2464218-9Mr. Sajid Mehmoodd'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_Employee Allowances/input_Salary Stage_OnStage'), 
    '1')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_Employee Allowances/input_Stage Month_OnMonthForStage'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_Employee Allowances/td_1'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_Employee Allowances/span_Current'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_Employee Allowances/ul_Current202320222017201620152011'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_Employee Allowances/span_Select Allowance'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_Employee Allowances/ul_Select AllowanceMobile  Telephone Charge_cedab9'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_Employee Allowances/span_Regular Allowance'))

WebUI.click(findTestObject('1st Month/day 24/24th day test2/Page_Employee Allowances/span_Regular Allowance'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test2/Page_Employee Allowances/input_Showing 1 to 10 of 1,017 entries_SubmitId'))

WebUI.closeBrowser()

