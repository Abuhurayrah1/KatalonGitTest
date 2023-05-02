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

WebUI.setText(findTestObject('Object Repository/1st Month/day 29/29th day test13/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 29/29th day test13/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test13/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test13/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test13/Page_/span_Diagnostics Investigations Services'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test13/Page_/span_Service Test Method Associations'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test13/Page_Service Test Method Associations/button_Add Service Test Method Associations'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test13/Page_Service Test Method Associations/div_Select Service'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test13/Page_Service Test Method Associations/span_01 Unit Fresh Frozen Plasma with Screening'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 29/29th day test13/Page_Service Test Method Associations/select_Select Service01 Unit Fresh Frozen P_22c4fd'), 
    'f094619c-383a-4d23-a84c-986d8ea45ea4', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test13/Page_Service Test Method Associations/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test13/Page_Service Test Method Associations/span_24 hrs. creatinine clearance'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test13/Page_Service Test Method Associations/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test13/Page_Service Test Method Associations/button_Submit'))

WebUI.closeBrowser()

