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

WebUI.setText(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_/span_Admin  HR'))

WebUI.click(findTestObject('1st Month/day 19/19th day test7/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_/span_Access Control'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_Access Control/button_Add Access Control'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_Access Control/div_Select Role'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_Access Control/span_AC Mechanic'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_Access Control/select_Select RoleAC MechanicAccount Assist_b568e4'), 
    '067315ca-2f00-e911-80c4-005056af7162', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_Access Control/div_Select Module'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_Access Control/span_Accounts'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_Access Control/select_Select ModuleAccountsAccounts  Payro_9ff0dd'), 
    'd4ff0799-e5dc-425d-a5d4-99188cb240e1', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_Access Control/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_Access Control/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_Access Control/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_Access Control/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_Access Control/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 19/19th day test7/Page_Access Control/input_Working Sessions_SubmitRole'))

WebUI.closeBrowser()

