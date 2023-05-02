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

WebUI.setText(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_/span_Doctor Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_/span_Diagnosis'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_Diagnosis/button_Add Diagnosis'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_Diagnosis/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_Diagnosis/input_Please Select_form-control'), 
    'CAR')

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_Diagnosis/span_Cardiology'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_Diagnosis/input_Please Select_form-control'), 
    'CAR')

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_Diagnosis/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_Diagnosis/input__FullName'), 'ASD')

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_Diagnosis/div_Select Diagnosis Category'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_Diagnosis/span_Normal'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_Diagnosis/select_Select Diagnosis CategoryNormaltesti_54eab1'), 
    '1afbe116-388e-e811-80be-005056af7162', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_Diagnosis/input_Code_Code'), 'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test6/Page_Diagnosis/input_body_Send'))

WebUI.closeBrowser()

