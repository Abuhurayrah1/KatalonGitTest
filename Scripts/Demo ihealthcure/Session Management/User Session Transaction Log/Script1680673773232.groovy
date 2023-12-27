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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_/span_Session Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_/span_User Session Transaction Log'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_User Session Transaction Log/input__DateRange'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_User Session Transaction Log/li_Last 7 Days'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_User Session Transaction Log/div_Select Users'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_User Session Transaction Log/span_82401-2464218-9Mr. Sajid Mehmoodd'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_User Session Transaction Log/select_Select Users82401-2464218-9Mr. Sajid_031d4e'), 
    '3e7415ca-2f00-e911-80c4-005056af7162', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_User Session Transaction Log/div_Select Reception Counter'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_User Session Transaction Log/span_asdf'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_User Session Transaction Log/select_Select Reception Counterasdf'), 
    'e1f804ea-5a99-ed11-80e6-005056af7c10', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test2/Page_User Session Transaction Log/button_Search'))

WebUI.closeBrowser()

