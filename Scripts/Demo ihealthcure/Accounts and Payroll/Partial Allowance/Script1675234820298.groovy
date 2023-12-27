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

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_/span_Accounts  Payroll'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_/span_Partial Allowance'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_Partial Allowance/button_Add Partial Allowance'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_Partial Allowance/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_Partial Allowance/input_Please Select_form-control'), 
    'bps')

WebUI.click(findTestObject('1st Month/day 24/24th day test14/Page_Partial Allowance/span_BPS-13'))

WebUI.click(findTestObject('1st Month/day 24/24th day test14/Page_Partial Allowance/div_Please Select'))

WebUI.click(findTestObject('1st Month/day 24/24th day test14/Page_Partial Allowance/div_PLA'))

WebUI.click(findTestObject('1st Month/day 24/24th day test14/Page_Partial Allowance/span_PLA'))

WebUI.click(findTestObject('1st Month/day 24/24th day test14/Page_Partial Allowance/div_PLA'))

WebUI.click(findTestObject('1st Month/day 24/24th day test14/Page_Partial Allowance/div_Accountant'))

WebUI.click(findTestObject('1st Month/day 24/24th day test14/Page_Partial Allowance/span_Accountant'))

WebUI.click(findTestObject('1st Month/day 24/24th day test14/Page_Partial Allowance/div_Accountant'))

WebUI.click(findTestObject('1st Month/day 24/24th day test14/Page_Partial Allowance/div_Accounts'))

WebUI.click(findTestObject('1st Month/day 24/24th day test14/Page_Partial Allowance/span_Accounts'))

WebUI.click(findTestObject('1st Month/day 24/24th day test14/Page_Partial Allowance/div_Accounts'))

WebUI.click(findTestObject('1st Month/day 24/24th day test14/Page_Partial Allowance/div_82401-2464218-9Mr. Sajid Mehmoodd'))

WebUI.click(findTestObject('1st Month/day 24/24th day test14/Page_Partial Allowance/span_82401-2464218-9Mr. Sajid Mehmoodd'))

WebUI.click(findTestObject('1st Month/day 24/24th day test14/Page_Partial Allowance/div_82401-2464218-9Mr. Sajid Mehmoodd'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_Partial Allowance/span_Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_Partial Allowance/ul_Select Mobile  Telephone ChargesHPA15 Ad_f3a087'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_Partial Allowance/input__MonthDate'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_Partial Allowance/td_1'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_Partial Allowance/input__NumberOfDays'), 
    '28')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test14/Page_Partial Allowance/input_Please enter less than 100 characters_b4a27f'))

WebUI.closeBrowser()

