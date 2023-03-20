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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_/span_Revenue Management Cycle'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_/span_Panel Services Claims'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_Panel Services Claims/input_Date Range_CustomRangeCalenderr'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_Panel Services Claims/li_Last 30 Days'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_Panel Services Claims/div_Please Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_Panel Services Claims/span_Zakat'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_Panel Services Claims/label_Organization'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_Panel Services Claims/input_Objected Claims_GenerateReport'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_Panel Services Claims/input_Objected Claims_SearchReport'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_Panel Services Claims/span_Select Status'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_Panel Services Claims/span_Select StatusPendingCompletedPartial R_84624a'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_Panel Services Claims/button_Submit'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test9/Page_Panel Services Claims/button_Yes'))

WebUI.closeBrowser()

