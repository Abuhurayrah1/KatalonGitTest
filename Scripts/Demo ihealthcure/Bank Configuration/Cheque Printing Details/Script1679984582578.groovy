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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_/span_Bank Configuration'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_/span_Cheque Printing Details'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_Cheque Printing Details/div_Select Bank'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_Cheque Printing Details/span_Meezan Bank'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_Cheque Printing Details/select_Select Bank                         _f2bbbf'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_Cheque Printing Details/div_Select Pay To'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_Cheque Printing Details/span_AM System'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_Cheque Printing Details/select_Select Pay To AM SystemxgcbnHassanMS_60ed1f'), 
    '4b4053ab-2e5b-ed11-80fa-005056af756c', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_Cheque Printing Details/input__ChequeNo'), 
    '555555')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_Cheque Printing Details/input__Amount'), 
    '500')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_Cheque Printing Details/textarea_Remarks_Remarks'), 
    'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test6/Page_Cheque Printing Details/button_Print Cheque'))

WebUI.closeBrowser()

