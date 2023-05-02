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

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test13/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 24/24th day test13/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test13/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('1st Month/day 24/24th day test10/Page_/span_Accounts  Payroll'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test13/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test13/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test13/Page_/span_Partial Facility'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test13/Page_Partial Facility/button_Add Partial Facility'))

WebUI.click(findTestObject('1st Month/day 24/24th day test13/Page_Partial Facility/span_37104-0961337-7Mr. Noor Hussain'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test13/Page_Partial Facility/ul_Select 82401-2464218-9Mr. Sajid Mehmoodd_a291c0'))

WebUI.click(findTestObject('1st Month/day 24/24th day test13/Page_Partial Facility/span_asd'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test13/Page_Partial Facility/ul_Select asdHassanHostel FacilityPvt Pract_13c2f2'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 24/24th day test13/Page_Partial Facility/input__NumberOfDays'), '5')

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test13/Page_Partial Facility/input__MonthDate'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test13/Page_Partial Facility/td_1'))

WebUI.click(findTestObject('Object Repository/1st Month/day 24/24th day test13/Page_Partial Facility/input_Please Enter Month_SubmitId'))

WebUI.closeBrowser()

