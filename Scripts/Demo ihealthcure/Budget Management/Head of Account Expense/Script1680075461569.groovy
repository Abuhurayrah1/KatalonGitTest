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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_/span_Budget Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_/span_Head of Account Expense'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/button_Add Head Of Account Expense'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/div_Select Parent Head of Accounts'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/span_244354-SDFGN ( 0.00)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/select_Select Parent Head of Accounts      _472b1c'), 
    '95fe4a81-5799-ed11-80e6-005056af7c10', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/div_Please Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/div_Please Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/div_Select Expense Category'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/span_2345-zxcvbnb'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/select_Select Expense Category2345-zxcvbnbG_939d5c'), 
    '83a0ff82-5899-ed11-80e6-005056af7c10', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/input__ExpenseDate'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/td_25'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/input__ExpenseAmount'), 
    '500')

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/div_Select Available Financial Years'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/span_2023-2024'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/select_Select Available Financial Years2019_26e424'), 
    '5f49dd1b-b07b-e911-80c3-005056af756c', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/input_GST Amount_GSTRemarks'), 
    '456')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/input_IncomeTax Amount_IncomeTaxRemarks'), 
    '456')

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/button_Select GST Type'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/span_17'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/select_Select GST Type                     _8054a2'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/div_Select Income Tax Type'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/span_8'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/select_Select Income Tax Type              _4b00db'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/div_Select Late Delivery'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/span_0.067'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/select_Select Late Delivery                _345904'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/div_Select GST Deduction'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/a_Full'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/select_Select GST Deduction                _2d6328'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/button_Select Shelf Life Deduction'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/span_Open Field'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/select_Select Shelf Life Deduction         _6f7dab'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/button_Select Risk Purchase Deduction'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/select_Select Risk Purchase Deduction      _246e53'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/div_Select Other Deduction'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/select_Select Other Deduction              _b254b1'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/div_Select Discount Type'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/select_Select Discount Type                _403dd2'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test7/Page_Head of Account Expense/input_Net Amount_SubmitId'))

WebUI.closeBrowser()

