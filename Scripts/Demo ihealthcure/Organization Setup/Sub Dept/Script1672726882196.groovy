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

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_iHealthCure  Hospital Management and I_3c5153/form_(document).ready(function ()          _0c8444'))

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_/span_Organization Setup'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_/span_Sub Dept'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/button_Add Sub Department'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/div_Select Department'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/input_Select Department_form-control'), 
    'test')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/span_Test Department'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/select_Select DepartmentAccountsAdmin  Secu_13f63c'), 
    '1507d8b1-03af-4aa0-b513-54d19576bbcc', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/input__departments'), 
    'test sub department 01')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/button_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/a_Test1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/select_Rawalpindi Institute Of CardiologyMo_1e546d'), 
    'fecdd4f2-c581-ed11-80e6-005056af7c10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/select_Rawalpindi Institute Of CardiologyMo_1e546d'), 
    'fecdd4f2-c581-ed11-80e6-005056af7c10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/select_Rawalpindi Institute Of CardiologyMo_1e546d'), 
    'fecdd4f2-c581-ed11-80e6-005056af7c10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/select_Rawalpindi Institute Of CardiologyMo_1e546d'), 
    'fecdd4f2-c581-ed11-80e6-005056af7c10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/select_Rawalpindi Institute Of CardiologyMo_1e546d'), 
    'fecdd4f2-c581-ed11-80e6-005056af7c10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/select_Rawalpindi Institute Of CardiologyMo_1e546d'), 
    'fecdd4f2-c581-ed11-80e6-005056af7c10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/select_Rawalpindi Institute Of CardiologyMo_1e546d'), 
    'fecdd4f2-c581-ed11-80e6-005056af7c10', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/button_Test1'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/span_Testfloor1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/select_Testfloor1'), 
    '66736408-c681-ed11-80e6-005056af7c10', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/div_Please Select'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/select_Testroom1'), 
    'ded29614-c681-ed11-80e6-005056af7c10', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/input_Code_ManualCode'), 
    '001')

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/input_Description_description'), 
    '01/03/2023')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test7/Page_Sub Departments/input_Please enter less than 1000 character_f2264f'))

WebUI.closeBrowser()

