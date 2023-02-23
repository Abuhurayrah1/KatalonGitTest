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

WebUI.navigateToUrl('http://192.168.88.254:399/Account/LogIn?ReturnUrl=%2f')

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'afipadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 6/6th day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test5/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test5/Page_/span_Clinical Support System'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test5/Page_/span_DiagnosticsInvestigations Reports'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test5/Page_Investigations Diagnostics Reports/input_Lab No. MR No. CNIC Passport PNR_Search'), 
    '0299-22-004572')

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test5/Page_Investigations Diagnostics Reports/input_Lab No. MR No. CNIC Passport PNR_Send'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test5/Page_Investigations Diagnostics Reports/i_Ready for Print_fa fa-print eys'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test5/Page_Investigations Diagnostics Reports/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test5/Page_Investigations Diagnostics Reports/span_1'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test5/Page_Investigations Diagnostics Reports/input_Print A4 Full_OptionPrintButton'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test5/Page_Investigations Diagnostics Reports/a_Ready for Print_BarCodeInModal service-gr_4667ab'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test5/Page_Investigations Diagnostics Reports/a_Ready for Print_PrintLabOrder service-gri_090873'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test5/Page_Investigations Diagnostics Reports/a_Ready for Print_PatientIDRDetail service-_35662f'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test5/Page_Investigations Diagnostics Reports/button_Investigation Diagnostic Detail_close'))

