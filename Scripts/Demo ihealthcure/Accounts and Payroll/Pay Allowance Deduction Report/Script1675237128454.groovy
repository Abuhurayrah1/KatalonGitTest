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

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('1st Month/day 24/24th day test18/Page_/span_Accounts  Payroll'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_/span_Pay Allowance Deduction Report'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/span_2023'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/ul_2004200520062007200820092010201120122013_b6a159'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/span_January'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/ul_JanuaryFebruaryMarchAprilMayJuneJulyAugu_82c9f6'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/span_Deduction'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/span_Select Deduction'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/ul_Select DeductionGI(Over All)Trade Tax (R_0d46e8'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/div_Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/span_Honorary'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/select_SelectPostgraduate TraineeAdditional_d29e9c'), 
    '3ede674c-70ab-4331-adef-1b52dda297dd', true)

WebUI.click(findTestObject('1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/div_BPS-13'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/span_BPS-13'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/select_SelectBPS-1BPS-10BPS-11BPS-12BPS-13B_5755d2'), 
    '1f310b33-6d67-4f72-87b0-e10eee3e4272', true)

WebUI.click(findTestObject('1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/div_Accountant'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/span_Accountant'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/select_SelectAC MechanicAccount Assistant A_85222a'), 
    '79d39d90-c934-4aed-9ca3-c7bd27047ce8', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test18/Page_Pay Allowance Deduction Report/button_Generate PDF Report'))

WebUI.closeBrowser()

