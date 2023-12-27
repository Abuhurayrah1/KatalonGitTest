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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_/span_Accounts'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_/span_Accounts'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_Accounts/button_Add Account'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_Accounts/input__Name'), 'Testing')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_Accounts/input_Short Desc_ShortDesc'), 
    'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_Accounts/span_Select Account Category'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_Accounts/ul_Select Account CategoryPROPERTY, PLANT A_7b16de'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_Accounts/span_Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_Accounts/li_6-25-01-01 - A01 - Total Employees Relat_ff3e78'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_Accounts/span_Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_Accounts/button_Please Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_Accounts/span_ADJ - Petty Cash Advance Adjustment Employee'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_Accounts/div_Please Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test2/Page_Accounts/input_All Companies_SubmitId'))

WebUI.closeBrowser()

