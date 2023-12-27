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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_/span_Finance'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_/span_Account Heads'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_Account Heads/button_Add Account Heads'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_Account Heads/input__Name'), 'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_Account Heads/input_Code_Code'), '0101')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_Account Heads/input_Description_Discription'), 
    'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_Account Heads/button_Select Account Type'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_Account Heads/span_Expense'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_Account Heads/select_Select Account TypeExpenseIncome'), 
    '9b2ed686-5ab9-ec11-8130-ac162d7327a7', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_Account Heads/input_Income_SubmitId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_Account Heads/a_Expense_Action Update btn btn-sm btn-clea_885a1d'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_Account Heads/input_Income_UpdateSubmitId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_Account Heads/a_Expense_Action Delete btn btn-sm btn-clea_36cf2e'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 9/9th day test16/Page_Account Heads/button_Yes'))

WebUI.closeBrowser()

