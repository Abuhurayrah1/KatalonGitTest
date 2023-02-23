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

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_/span_Lab Investigations'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_/span_Test Methods'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/button_Add Test Method'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/input__MethodName'), 'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/div_Select Name'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/span_Malarial Parasite Thin Smear'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/select_Select NameMalarial Parasite Thin Sm_66c78c'), 
    'b0317d57-b1a6-412f-937b-a8aec0628229', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/div_Select Type'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/span_Check Box'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/select_Select TypeCheck BoxCultureSensitivi_e3f074'), 
    'fe3bc6d6-07a7-4676-921f-de0428b5850f', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/div_Select Unit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/span_Saline( Saline)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/select_Select Unit ( ) Saline( Saline)()-(-_ceba51'), 
    '3e80f692-4eb5-4805-b740-b7b5d544c353', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/div_Select Age Group'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/span_All (All Age)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/select_Select Age GroupNewborn1 (1st Day)Re_cff90a'), 
    'ee5ef8e7-2064-4c49-a43c-0b9aabab5612', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/input_Max_MinVal'), '0')

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/input_Please enter numeric character_MaxVal'), 
    '5')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test13/Page_Test Methods/button_Submit'))

WebUI.closeBrowser()

