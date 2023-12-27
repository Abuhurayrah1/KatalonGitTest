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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_/span_Statistics'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_/span_Dead Patients Stats'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_Dead Patients Stats/input__DateRange'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_Dead Patients Stats/div_Select Department'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_Dead Patients Stats/span_Accounts'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_Dead Patients Stats/select_Select DepartmentAccountsAdmin  Secu_d21bb3'), 
    '6fae4466-fe2a-4851-a61a-cb868d89b549', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_Dead Patients Stats/div_Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_Dead Patients Stats/div_Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_Dead Patients Stats/div_Select Primary Reason'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_Dead Patients Stats/span_severe lv systolic dysfunction, EF 15-20'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_Dead Patients Stats/div_Select Secondary Reason'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_Dead Patients Stats/span_severe lv systolic dysfunction, EF 15-20'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test1/Page_Dead Patients Stats/a_Generate Report'))

WebUI.closeBrowser()

