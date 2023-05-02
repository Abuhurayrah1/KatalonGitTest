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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_/span_Pharmacy'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_/span_Pharmacy Department Store'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/div_Select Department'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/span_Cath Lab'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/select_Select DepartmentAccountsAdmin  Secu_d21bb3'), 
    '498135ee-096a-4a2c-b843-a8d477f199f6', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/div_Select Store'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/span_Cath Lab Store'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/select_Select StoreAcademic Affair StoreAcc_e4c95c'), 
    '79e4d6fd-9f7e-e811-80be-005056af7162', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/div_Select Gender'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/span_Both'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/select_Select GenderBothMaleFemale'), 
    '1d94f41e-011d-e811-80ff-001517791069', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/div_Select Visit'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/div_Select Visit'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/div_Select Stock type'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/span_Regular'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/select_Select Stock typeRegularDonationCNEfgegad'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/input_Min Age_MinAge'), 
    '1')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/input_Max Age_MaxAge'), 
    '5')

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test5/Page_Pharmacy Department Store/input_Please enter a valid number_Send'))

WebUI.closeBrowser()

