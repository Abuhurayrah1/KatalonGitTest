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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 13/13th day test12/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 13/13th day test12/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test12/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test12/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test12/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test12/Page_/span_Session Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test12/Page_/span_Reception Counter'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test12/Page_Reception Counter/button_Add Reception Counter'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 13/13th day test12/Page_Reception Counter/input__ReceptionCounterName'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 13/13th day test12/Page_Reception Counter/input_Description_Description'), 
    'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test12/Page_Reception Counter/input_Please enter less than 100 characters_434fc2'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test12/Page_Reception Counter/a_Test_Action Update btn btn-sm btn-clean b_dbf6af'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test12/Page_Reception Counter/input_Please enter a value with valid lengt_18a3d1'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test12/Page_Reception Counter/a_Test_Action Delete btn btn-sm btn-clean b_38e08e'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test12/Page_Reception Counter/button_Yes'))

WebUI.closeBrowser()
