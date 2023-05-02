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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 2/2nd day test18/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 2/2nd day test18/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test18/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test18/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test18/Page_/span_Stores Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test18/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test18/Page_/span_Stock Type Associations'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test18/Page_Stock Type Association/button_Add New'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test18/Page_Stock Type Association/div_Select Store'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test18/Page_Stock Type Association/span_Accounts Store'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 2/2nd day test18/Page_Stock Type Association/select_Select StoreAcademic Affair StoreAcc_e4c95c'), 
    'f8941dca-23f4-eb11-80f4-005056af756c', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test18/Page_Stock Type Association/div_Select Stock Type'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test18/Page_Stock Type Association/span_Regular'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 2/2nd day test18/Page_Stock Type Association/select_Select Stock TypeRegularDonationCNEf_ef91d1'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test18/Page_Stock Type Association/button_Submit'))

WebUI.closeBrowser()

