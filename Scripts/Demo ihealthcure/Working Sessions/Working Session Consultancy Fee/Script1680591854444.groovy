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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_/span_Working Sessions'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_/span_Working Session Consultancy Fee'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_Working Session Consultancy Fee/button_Add Working Session Consultancy Fee'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_Working Session Consultancy Fee/div_Select Working Session'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_Working Session Consultancy Fee/span_Testing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_Working Session Consultancy Fee/select_Select Working SessionTestingMorningEvening'), 
    'fb25f232-aed2-ed11-80e7-005056af7c10', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_Working Session Consultancy Fee/div_Please Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_Working Session Consultancy Fee/span_Prof. Dr Tahir Naveed'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_Working Session Consultancy Fee/label_ConsultancyFee'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_Working Session Consultancy Fee/input__Share'), 
    '10')

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test10/Page_Working Session Consultancy Fee/button_Submit'))

WebUI.closeBrowser()

