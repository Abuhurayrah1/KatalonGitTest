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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test13/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test13/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_/span_Accounts'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test13/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_/span_Voucher Entry'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_Voucher Entry/button_Add Voucher Entry'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_Voucher Entry/span_Select Voucher Type'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_Voucher Entry/ul_Select Voucher TypeADJ - Petty Cash Adva_2657e3'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_Voucher Entry/input__VoucherDate'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_Voucher Entry/td_31'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_Voucher Entry/textarea_Voucher Description_VoucherDescription'), 
    'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_Voucher Entry/span_Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_Voucher Entry/ul_1-04-01-01 - Hassan ( 0 )  3-28-01-01 - _8690d8'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_Voucher Entry/input_Debit_FormDebitAmount'), 
    '500')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_Voucher Entry/input_Credit_FormCreditAmount'), 
    '500')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_Voucher Entry/input_Description_Description'), 
    'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_Voucher Entry/input_Description_SubmitId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_Voucher Entry/input_Action_center  datatable_amount Debit_895142'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test1/Page_Voucher Entry/button_Submit'))

WebUI.closeBrowser()

