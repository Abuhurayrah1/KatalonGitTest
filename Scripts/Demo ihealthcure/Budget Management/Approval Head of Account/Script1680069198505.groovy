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

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_iHealthCure  Hospital Management and I_3c5153/div_Warning Notification are not enabled in_9dfad1'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_/span_Budget Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_/span_Approval Head of Account'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/button_Add Approved Head Of Account'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/input__ReferrenceLetterNumber'), 
    '123')

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/input__DateofLetterIssuance'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/td_25'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/div_Select Available Financial Years'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/span_2022-2023'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/select_Select Available Financial Years2019_26e424'), 
    '5e49dd1b-b07b-e911-80c3-005056af756c', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/div_Select Parent Head of Accounts'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/span_244354-SDFGN ( 0.00)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/select_Select Parent Head of Accounts      _19480b'), 
    '95fe4a81-5799-ed11-80e6-005056af7c10', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/input_Please Select_form-control'), 
    'a')

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/input__ApprovedBudgetSetupAmount'), 
    '500')

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/div_244354-SDFGN ( 0.00)'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/input_Please enter less than 100 characters_add'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/a_Jan 16, 2023_Action Update btn btn-sm btn_cd7c01'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test4/Page_Approved Head of Accounts/input_Close_UpdateSubmit'))

WebUI.closeBrowser()

