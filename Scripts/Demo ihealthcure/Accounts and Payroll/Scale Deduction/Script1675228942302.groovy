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

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 24/24th day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test5/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test5/Page_/span_Accounts  Payroll'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test5/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test5/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test5/Page_/span_Scale Deduction'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test5/Page_Scale Deduction/button_Add Scale Deduction'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test5/Page_Scale Deduction/button_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test5/Page_Scale Deduction/input_Please Select_form-control'), 
    'bps')

WebUI.click(findTestObject('1st Month/day 24/24th day test5/Page_Scale Deduction/span_BPS-13'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test5/Page_Scale Deduction/div_Please Select'))

WebUI.click(findTestObject('1st Month/day 24/24th day test5/Page_Scale Deduction/div_PLA'))

WebUI.click(findTestObject('1st Month/day 24/24th day test5/Page_Scale Deduction/span_PLA'))

WebUI.click(findTestObject('1st Month/day 24/24th day test5/Page_Scale Deduction/div_PLA'))

WebUI.click(findTestObject('1st Month/day 24/24th day test5/Page_Scale Deduction/div_Accountant'))

WebUI.click(findTestObject('1st Month/day 24/24th day test5/Page_Scale Deduction/span_Accountant'))

WebUI.click(findTestObject('1st Month/day 24/24th day test5/Page_Scale Deduction/div_Accountant'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test5/Page_Scale Deduction/span_Select Deduction'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test5/Page_Scale Deduction/ul_Select DeductionGI(Over All)Trade Tax (R_0d46e8'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test5/Page_Scale Deduction/input__Percentage'), 
    '5')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test5/Page_Scale Deduction/input_Please Enter Amount_btn btn-primary'))

WebUI.closeBrowser()

