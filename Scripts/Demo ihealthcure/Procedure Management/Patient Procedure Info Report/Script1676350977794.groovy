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

WebUI.setText(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_/span_Procedure Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_/span_Patient Procedure Info Report'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/span_Mr. Muhammad Mudassar'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/button_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/div_All'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/a_Pending For Booking'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/select_All                                 _8afebe'), 
    '25', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/div_Select Procedure'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/a_Acute Limbs Ischemia Intervention'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/select_Select ProcedureAcute Limbs Ischemia_dc8cd6'), 
    'a4b73e52-a2aa-47cd-9093-eec51475a5d2', true)

WebUI.click(findTestObject('1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/div_Accounts'))

WebUI.click(findTestObject('1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/span_Accounts'))

WebUI.click(findTestObject('1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/div_Accounts'))

WebUI.click(findTestObject('1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/div_Mr. Surgical Booking  Virtual Accounts'))

WebUI.click(findTestObject('1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/span_Mr. Surgical Booking  Virtual Accounts'))

WebUI.click(findTestObject('1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/div_Mr. Surgical Booking  Virtual Accounts'))

WebUI.click(findTestObject('1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/div_Zakat'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/span_Zakat'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/select_AllZakatBait-ul-MalHealth CardFull P_c714bc'), 
    '702f6373-0452-e911-80cb-005056af7162', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/label_Not Canceled'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test5/Page_Patient Procedure Info Report/input_Canceled_GenerateReport'))

WebUI.closeBrowser()

