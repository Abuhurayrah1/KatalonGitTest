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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_/span_Statistics'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_/span_Staff Performance Detail'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_Staff Performance Details/input__DateRange'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_Staff Performance Details/li_Last 30 Days'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_Staff Performance Details/button_Select User'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_Staff Performance Details/span_Mr. Muhammad Mudassar'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_Staff Performance Details/select_Select UserMr. Muhammad MudassarMiss_cffc88'), 
    '2654a4df-df02-476e-88aa-cc2c7e592cfb', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_Staff Performance Details/div_All'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_Staff Performance Details/span_All'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_Staff Performance Details/input_Registered and visited_GenerateReport'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_Staff Performance Details/a_2'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test16/Page_Staff Performance Details/a_1'))

WebUI.closeBrowser()

