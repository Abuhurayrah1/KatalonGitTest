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

WebUI.setText(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_/span_Doctor Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_/span_Diagnosis Group'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_Diagnosis Group/button_Add Diagnostic Services Group'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_Diagnosis Group/input__Name'), 'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_Diagnosis Group/div_Select User'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_Diagnosis Group/span_Dr. Aasifa Siddiqa  Assist.Prof.Pathal_4169ab'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_Diagnosis Group/select_Select UserDr. Aasifa Siddiqa  Assis_30cc03'), 
    '34184748-6b14-4493-b3a2-07988607484c', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_Diagnosis Group/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_Diagnosis Group/span_TENS'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_Diagnosis Group/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_Diagnosis Group/textarea_Description_Description'), 
    'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test10/Page_Diagnosis Group/button_Submit'))

WebUI.closeBrowser()

