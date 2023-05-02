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

WebUI.setText(findTestObject('Object Repository/1st Month/day 28/28th day test8/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 28/28th day test8/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test8/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test8/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test8/Page_/span_Procedure Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test8/Page_/span_Patient Procedure List'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test8/Page_Patient Procedure List/i_Feb 13, 2023 1300_glyphicon glyphicon-play'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test8/Page_Patient Procedure List/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test8/Page_Patient Procedure List/input_PKR. 2.88_btnMedicine'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test8/Page_Patient Procedure List/i_Feb 13, 2023 1502_icon-syringe'))

WebUI.click(findTestObject('1st Month/day 28/28th day test8/Page_Patient Procedure List (1)/div_Mr. Surgical Booking  Virtual Accounts'))

WebUI.click(findTestObject('1st Month/day 28/28th day test8/Page_Patient Procedure List (1)/span_Mr. Surgical Booking  Virtual Accounts'))

WebUI.click(findTestObject('1st Month/day 28/28th day test8/Page_Patient Procedure List (1)/div_Mr. Surgical Booking  Virtual Accounts'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test8/Page_Patient Procedure List/button_Submit'))

WebUI.click(findTestObject('1st Month/day 28/28th day test8/Page_Patient Procedure List (1)/Page_Patient Procedure List/div_Miss Samina Kousar  Charge Nurse'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test8/Page_Patient Procedure List/span_Miss Samina Kousar  Charge Nurse'))

WebUI.click(findTestObject('1st Month/day 28/28th day test8/Page_Patient Procedure List (1)/Page_Patient Procedure List/div_Miss Samina Kousar  Charge Nurse'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test8/Page_Patient Procedure List/button_Submit_1'))

WebUI.closeBrowser()

