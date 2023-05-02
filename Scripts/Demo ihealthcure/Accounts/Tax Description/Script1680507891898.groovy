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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_/span_Accounts'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_/span_Tax Description'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_Tax Description/button_Add Tax Description'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_Tax Description/input__Title'), 'Testing')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_Tax Description/textarea_Description_Description'), 
    'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_Tax Description/input_Description_SubmitId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_Tax Description/a_Apr 03, 2023 1246_Action Update btn btn-s_66f9c1'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_Tax Description/input_Description_UpadteSubmitId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_Tax Description/a_Jan 21, 2023 1207_Action Delete btn btn-s_cf0945'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 12/12th day test13/Page_Tax Description/button_Yes'))

WebUI.closeBrowser()

