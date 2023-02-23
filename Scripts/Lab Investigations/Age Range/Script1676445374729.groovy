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

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_/span_Lab Investigations'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_/span_Age Range'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_Age Range/button_Add Age Range'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_Age Range/input__Name'), 'asd')

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_Age Range/input_Title_Title'), 'asd')

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_Age Range/input__Label'), 'asd')

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_Age Range/input_Description_Description'), 'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_Age Range/div_Select Gender'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_Age Range/span_Both'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_Age Range/select_Select GenderBothMaleFemale'), 
    '1d94f41e-011d-e811-80ff-001517791069', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_Age Range/div_Select Age Type'))

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_Age Range/span_Month'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_Age Range/select_Select Age TypeSecondMinuteHourDayMonthYear'), 
    '95ac3d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_Age Range/input_Age Range_MinAge'), '5')

WebUI.setText(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_Age Range/input_Please enter age  greater than 0_MaxAge'), 
    '10')

WebUI.click(findTestObject('Object Repository/1st Month/day 30/30th day test16/Page_Age Range/input_Please enter age greater than 0_Submi_26c683'))

WebUI.closeBrowser()

