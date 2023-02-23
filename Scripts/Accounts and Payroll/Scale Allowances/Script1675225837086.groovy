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

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_/span_Accounts  Payroll'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_/span_Scale Allowances'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_Scale Allowances/button_Add Scale Allownce'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_Scale Allowances/button_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_Scale Allowances/input_Please Select_form-control'), 
    'bps')

WebUI.click(findTestObject('1st Month/day 24/24th day test1/Page_Scale Allowances/span_BPS-11'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_Scale Allowances/div_Please Select'))

WebUI.click(findTestObject('1st Month/day 24/24th day test1/Page_Scale Allowances/div_PLA'))

WebUI.click(findTestObject('1st Month/day 24/24th day test1/Page_Scale Allowances/span_PLA'))

WebUI.click(findTestObject('1st Month/day 24/24th day test1/Page_Scale Allowances/div_PLA'))

WebUI.click(findTestObject('1st Month/day 24/24th day test1/Page_Scale Allowances/div_Accountant'))

WebUI.click(findTestObject('1st Month/day 24/24th day test1/Page_Scale Allowances/span_Accountant'))

WebUI.click(findTestObject('1st Month/day 24/24th day test1/Page_Scale Allowances/div_Accountant'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_Scale Allowances/span_Select Allowance'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_Scale Allowances/ul_Select AllowanceMobile  Telephone Charge_cedab9'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_Scale Allowances/input_Stage Month_OnMonthForStage'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_Scale Allowances/td_1'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_Scale Allowances/span_Current'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_Scale Allowances/ul_Current202320222017201620152011'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_Scale Allowances/input_Salary Stage_OnStage'), 
    '1')

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_Scale Allowances/input__Percentage'), '5')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test1/Page_Scale Allowances/input_Please Enter Amount_btn btn-primary'))

WebUI.closeBrowser()

