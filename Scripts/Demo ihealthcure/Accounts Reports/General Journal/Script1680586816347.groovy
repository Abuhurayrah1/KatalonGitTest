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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_/span_Accounts Reports'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_/span_General Journal'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_General Journal/span_Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_General Journal/ul_SearchingSelect.1-04-01-01 - Hassan ( 0 _075362'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_General Journal/span_All Voucher Types'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_General Journal/ul_All Voucher TypesADJ - Petty Cash Advanc_dac508'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_General Journal/span_All Reference Types'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_General Journal/span_All Reference Types'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_General Journal/button_PDF'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_General Journal/button_EXCEL'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test2/Page_General Journal/button_CSV'))

WebUI.closeBrowser()

