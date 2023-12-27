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

WebUI.setText(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_/span_Clinical Support System'))

WebUI.click(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_/span_EMR Search'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_Patient EMR/input_MR No_SearchMRNo'), 
    '0401-23-004874')

WebUI.click(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_Patient EMR/input_MR No_Send'))

WebUI.click(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_Patient EMR/a_Checked In_PrintInModal btn btn-sm btn-cl_7e5688'))

WebUI.click(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_Patient EMR/a_Checked In_EMRDocuments btn btn-sm btn-cl_bfba75'))

WebUI.click(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_Patient EMR/a_Checked In_PatientVisitDetailModal btn bt_aec025'))

WebUI.click(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_Patient EMR/button_View_close'))

WebUI.click(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_Patient EMR/a_Checked In_EMRPatientLifeCycle btn btn-sm_e08545'))

WebUI.click(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_Patient EMR/button_View_close'))

WebUI.click(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_Patient EMR/a_Checked In_VisitMedicalBill btn btn-sm bt_47e5e3'))

WebUI.click(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_Patient EMR/button_'))

WebUI.click(findTestObject('Object Repository/1st Month/day 27/27th day test9/Page_Patient EMR/a_Checked In_VisitExpenceSheet btn btn-sm b_bc77c2'))

WebUI.closeBrowser()

