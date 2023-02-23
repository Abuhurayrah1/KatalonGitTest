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

WebUI.setText(findTestObject('Object Repository/1st Month/day 12/12th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 12/12th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test4/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test4/Page_/span_Organization Setup'))

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test4/Page_/div_Cheque Printing Vault_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test4/Page_/span_Clinical Notes Restrict Designations'))

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test4/Page_Clinical Notes Restrict Designations/button_Add Designation Decision'))

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test4/Page_Clinical Notes Restrict Designations/button_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 12/12th day test4/Page_Clinical Notes Restrict Designations/input_Please Select_form-control'), 
    'AC mechanic')

WebUI.click(findTestObject('1st Month/day 12/12th day test4/Page_Clinical Notes Restrict Designations/a_AC Mechanic'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 12/12th day test4/Page_Clinical Notes Restrict Designations/select_Select Designation FirstAC MechanicA_945eec'), 
    'f77115ca-2f00-e911-80c4-005056af7162', true)

WebUI.click(findTestObject('1st Month/day 12/12th day test4/Page_Clinical Notes Restrict Designations/div_AC Mechanic'))

WebUI.setText(findTestObject('1st Month/day 12/12th day test4/Page_Clinical Notes Restrict Designations/input_AC Mechanic_form-control'), 
    'AC mechanic')

WebUI.click(findTestObject('1st Month/day 12/12th day test4/Page_Clinical Notes Restrict Designations/span_AC Mechanic'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1st Month/day 12/12th day test4/Page_Clinical Notes Restrict Designations/div_AC Mechanic'))

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test4/Page_Clinical Notes Restrict Designations/span'))

WebUI.click(findTestObject('1st Month/day 12/12th day test4/Page_Clinical Notes Restrict Designations/label_Primary Diagnosis'))

WebUI.click(findTestObject('1st Month/day 12/12th day test4/Page_Clinical Notes Restrict Designations/label_Exam Findings'))

WebUI.click(findTestObject('1st Month/day 12/12th day test4/Page_Clinical Notes Restrict Designations/label_Secondary Diagnosis'))

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test4/Page_Clinical Notes Restrict Designations/input_Please Select atleast one checkbox_Su_c11427'))

WebUI.closeBrowser()

