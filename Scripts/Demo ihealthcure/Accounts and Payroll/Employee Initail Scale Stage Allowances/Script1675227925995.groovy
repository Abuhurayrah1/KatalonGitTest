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

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 24/24th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test3/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test3/Page_/span_Accounts  Payroll'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test3/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test3/Page_/span_Employee Initial Scale Stage Allowances'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test3/Page_Employee Initial Scale Stage And Year/button_Add New'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test3/Page_Employee Initial Scale Stage And Year/span_Select Employee'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test3/Page_Employee Initial Scale Stage And Year/ul_Select Employee82401-2464218-9Mr. Sajid _9d8e0c'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test3/Page_Employee Initial Scale Stage And Year/span_Select Scales'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test3/Page_Employee Initial Scale Stage And Year/ul_Select ScalesBPS-1BPS-10BPS-11BPS-12BPS-_f72f2c'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test3/Page_Employee Initial Scale Stage And Year/span_Select Year'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test3/Page_Employee Initial Scale Stage And Year/ul_Select Year202320222017201620152011'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test3/Page_Employee Initial Scale Stage And Year/input__SalaryStage'), 
    '1')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test3/Page_Employee Initial Scale Stage And Year/input_Please enter less than 100 characters_b4a27f'))

WebUI.closeBrowser()

