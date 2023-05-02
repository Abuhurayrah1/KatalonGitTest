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

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_/span_Medicines  Disposables'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_/span_Type'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_MedicineTypes/button_Add Medicine Types'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_MedicineTypes/input__Abbreviation'), 'asd')

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_MedicineTypes/input__EnglishDefinition'), 'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_MedicineTypes/input_Urdu Definition_UrduDefinition'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_MedicineTypes/span_'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_MedicineTypes/span_Enter'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_MedicineTypes/input_Urdu Definition_UrduDefinition'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_MedicineTypes/input_Intake English Definition_IntakeEngli_8a5a99'), 
    'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_MedicineTypes/input_Intake Urdu Definition_IntakeUrduDefinition'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_MedicineTypes/span_'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_MedicineTypes/input_Description_Description'), 
    'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test20/Page_MedicineTypes/input_Description_Create'))

WebUI.closeBrowser()

