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

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_/span_Imaging  Diagnostics'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_/span_Diagnostics Queue'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_Diagnostics Queue/a_Echo_DataEntryInModal service-grid barcod_4e7952'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_Enter Test Result/input_(20 - 37) mm_numeric0'), 
    '20')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_Enter Test Result/div_Select Doctor'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_Enter Test Result/span_Dr. Aasifa Siddiqa  Assist.Prof.Pathal_4169ab'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_Enter Test Result/select_Select DoctorDr. Aasifa Siddiqa  Ass_56dbc1'), 
    '34184748-6b14-4493-b3a2-07988607484c', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_Enter Test Result/input_Report Preview_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_Diagnostics Queue/a_Echo_CallBackInModal service-grid btn btn_1b5e63'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_Diagnostics Queue/select_Select Previous Status              _e45682'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_Diagnostics Queue/textarea__Description'), 
    'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test2/Page_Diagnostics Queue/input_Call Back Remarks_CallBackButton'))

WebUI.closeBrowser()

