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

WebUI.setText(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_/span_Appointment  Queue Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_/span_Booked Appointments'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_Booked Appointments/div_All Doctors'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_Booked Appointments/span_Dr. Aasifa Siddiqa  Assist.Prof.Pathal_4169ab'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_Booked Appointments/select_All DoctorsDr. Aasifa Siddiqa  Assis_dfd043'), 
    '34184748-6b14-4493-b3a2-07988607484c', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_Booked Appointments/div_All'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_Booked Appointments/span_Cancelled'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_Booked Appointments/select_AllCancelledPaidCancelledPendingConf_faafb2'), 
    '73abbd7f-1785-ea11-80ce-005056af756c', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_Booked Appointments/div_All Locations'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_Booked Appointments/div_All Locations'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_Booked Appointments/input_Date Range_DateRange'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_Booked Appointments/li_Last 7 Days'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_Booked Appointments/input_Date Range_DateRange'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_Booked Appointments/input_Date Range_DateRange'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test16/Page_Booked Appointments/li_This Month'))

WebUI.closeBrowser()

