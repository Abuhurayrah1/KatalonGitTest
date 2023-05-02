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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 13/13th day test14/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 13/13th day test14/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test14/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test14/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test14/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test14/Page_/span_Session Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test14/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test14/Page_/span_User Cash Collection Point'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test14/Page_User Cash Collection Point/button_Add User Cash Collection Point'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test14/Page_User Cash Collection Point/div_Select Users'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test14/Page_User Cash Collection Point/span_82401-2464218-9Mr. Sajid Mehmoodd'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 13/13th day test14/Page_User Cash Collection Point/select_Select Users82401-2464218-9Mr. Sajid_031d4e'), 
    '3e7415ca-2f00-e911-80c4-005056af7162', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test14/Page_User Cash Collection Point/div_Select Cash Collection Point'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test14/Page_User Cash Collection Point/div_Select Cash Collection Point'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 13/13th day test14/Page_User Cash Collection Point/input_Select Cash Collection Point_SubmitId'))

WebUI.closeBrowser()

