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

WebUI.setText(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_/span_Procedure Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_/span_Procedure Appointment Queue'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/i_Feb 13, 2023 0730_glyphicon glyphicon-ok-circle'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/div_Zakat'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/span_Zakat'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/input_Total_TotalChargesPC'), 
    '500')

WebUI.setText(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/input_Status_Status'), 
    '500')

WebUI.setText(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/input_Cell No_CellNo'), 
    '500')

WebUI.setText(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/input_Amount_CashAmountPC'), 
    '500')

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/input_Zakat_ConfirmProcedureButton'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/i_Feb 13, 2023 0730_glyphicon glyphicon-usd'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/input__AdvanceAmount'), 
    '500')

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/button_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/i_Feb 13, 2023 0730_glyphicon glyphicon-ok-circle'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/input_Zakat_ConfirmProcedureButton'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/i_Feb 13, 2023 0730_icon-medical-i-billing icon-2x'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/button_Update'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/i_Feb 13, 2023 0730_glyphicon glyphicon-menu-right'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test7/Page_Procedure Appointment Queue/button_Move'))

WebUI.closeBrowser()

