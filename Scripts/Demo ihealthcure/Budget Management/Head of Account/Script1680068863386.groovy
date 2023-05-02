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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_/span_Budget Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_/span_Head of Account'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_Head of Account/button_Add Head Of Account'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_Head of Account/div_Select Head Of Account Category'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_Head of Account/span_23456-sDZFX'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_Head of Account/select_Select Head Of Account Category23456_18e68c'), 
    '08be2d65-5799-ed11-80e6-005056af7c10', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_Head of Account/input__Code'), 'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_Head of Account/input__Name'), 'asdqwe')

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_Head of Account/div_Select Parent Head Of Account'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_Head of Account/span_244354-SDFGN'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_Head of Account/select_Select Parent Head Of Account244354-_6416fe'), 
    '95fe4a81-5799-ed11-80e6-005056af7c10', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_Head of Account/input_Enter Preference_Preference'), 
    '5')

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_Head of Account/input_Subsidiary Allowed_SubmitId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_Head of Account/a_asdqwe_Action Update btn btn-sm btn-clean_eb789d'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_Head of Account/input_Subsidiary Allowed_UpdateSubmitId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_Head of Account/a_asdqwe_Action Delete btn btn-sm btn-clean_78912e'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test3/Page_Head of Account/button_Yes'))

WebUI.closeBrowser()

