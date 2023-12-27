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

WebUI.setText(findTestObject('Object Repository/1st Month/day 19/19th day test20/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 19/19th day test20/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test20/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test20/Page_/span_HR Attendance'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test20/Page_/span_Attachment Duty'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test20/Page_Attachment Duty/button_Attachment Duty'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test20/Page_Attachment Duty/span_Select Employee'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test20/Page_Attachment Duty/span_Select Employee82401-2464218-9Mr. Saji_a4f27f'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 19/19th day test20/Page_Attachment Duty/input__Remarks'), 
    'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test20/Page_Attachment Duty/input__FromDate'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test20/Page_Attachment Duty/td_1'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test20/Page_Attachment Duty/input__ToDate'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test20/Page_Attachment Duty/td_1'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 19/19th day test20/Page_Attachment Duty/textarea_Description_Description'), 
    'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test20/Page_Attachment Duty/input_Description_SubmitId'))

WebUI.closeBrowser()

