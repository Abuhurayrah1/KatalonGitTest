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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_/span_Bank Configuration'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_/span_Branch Banks Acct No'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_Branch Banks Acct No/button_Add Branch Bank Acct No'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_Branch Banks Acct No/div_Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_Branch Banks Acct No/span_Govt Of Punjab'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_Branch Banks Acct No/select_Select Askari CMH Branch, Rwp.Rawalp_9aa75a'), 
    '1613aae6-2f5b-ed11-80fa-005056af756c', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_Branch Banks Acct No/input__Title'), 
    'Testing')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_Branch Banks Acct No/input__AccountNumber'), 
    '5')

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_Branch Banks Acct No/span_Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_Branch Banks Acct No/input__SubmitId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_Branch Banks Acct No/a_Mar 28, 2023 1101 AM_Action Update btn bt_353d2e'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_Branch Banks Acct No/input__UpdateSubmitBranchBank'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test3/Page_Branch Banks Acct No/a_Mar 28, 2023 1101 AM_Action Delete btn bt_6b8dcc'))

WebUI.closeBrowser()

