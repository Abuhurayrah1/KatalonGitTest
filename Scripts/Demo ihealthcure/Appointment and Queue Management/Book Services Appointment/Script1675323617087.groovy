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

WebUI.setText(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_/span_Appointment  Queue Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_/span_Book Services Appointment'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_Book Services Appointment/input_CNICMR No_SearchMRNo'), 
    '0401-23-004870')

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_Book Services Appointment/input_CNICMR No_SearchBtn'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_Book Services Appointment/i_Feb 02, 2023 1003_glyphicon glyphicon-cal_36146f'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_Book Services Appointment/div_Select Service'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_Book Services Appointment/a_01 Unit Fresh Frozen Plasma with Screening'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_Book Services Appointment/select_Select Service01 Unit Fresh Frozen P_22c4fd'), 
    'f094619c-383a-4d23-a84c-986d8ea45ea4', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_Book Services Appointment/div_Please select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_Book Services Appointment/span_Dr. Aasifa Siddiqa  Assist.Prof.Pathal_4169ab'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_Book Services Appointment/select_Please selectDr. Aasifa Siddiqa  Ass_acd57f'), 
    '34184748-6b14-4493-b3a2-07988607484c', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test17/Page_Book Services Appointment/input_Clinical History_BookServiceButton'))

WebUI.closeBrowser()

