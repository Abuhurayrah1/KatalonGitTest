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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_/span_Category Discounts'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_/span_Patient Category'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_Patient Category/button_New Record'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_Patient Category/input__name'), 'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_Patient Category/input_Card Validity_CardValidityValue'), 
    '5')

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_Patient Category/div_Please Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_Patient Category/a_Month'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_Patient Category/select_Please SelectDayMonthYear'), 
    '95ac3d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_Patient Category/input__ObtainedMinMarks'), 
    '0')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_Patient Category/input_Please enter less than 3 characters_O_297abb'), 
    '5')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_Patient Category/textarea_Description_Description'), 
    'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_Patient Category/button_Submit'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_Patient Category/a_asd_Action Update btn btn-sm btn-clean bt_303932'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_Patient Category/button_Update'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test1/Page_Patient Category/a_asd_Action Delete btn btn-sm btn-clean bt_597cbe'))

WebUI.closeBrowser()

