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

WebUI.setText(findTestObject('Object Repository/1st Month/day 23/23rd day test9/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 23/23rd day test9/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test9/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test9/Page_/span_Accounts  Payroll'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test9/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test9/Page_/span_Advance Salary Request'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test9/Page_Advance Salary Request/button_Add Advance Salary Request'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test9/Page_Advance Salary Request/span_Select Employee'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test9/Page_Advance Salary Request/ul_Select Employee82401-2464218-9Mr. Sajid _9d8e0c'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 23/23rd day test9/Page_Advance Salary Request/input__Title'), 
    'asd')

WebUI.setText(findTestObject('Object Repository/1st Month/day 23/23rd day test9/Page_Advance Salary Request/input__AdvanceSalaryAmount'), 
    '500')

WebUI.setText(findTestObject('Object Repository/1st Month/day 23/23rd day test9/Page_Advance Salary Request/input__InstallmentPercentage'), 
    '5')

WebUI.setText(findTestObject('Object Repository/1st Month/day 23/23rd day test9/Page_Advance Salary Request/textarea_Description_Description'), 
    'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test9/Page_Advance Salary Request/input_Remarks_LoanId'))

WebUI.closeBrowser()

