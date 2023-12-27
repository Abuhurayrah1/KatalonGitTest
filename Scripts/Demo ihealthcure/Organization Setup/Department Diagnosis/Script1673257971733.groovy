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

WebUI.setText(findTestObject('Object Repository/1st Month/day 13/13th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 13/13th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 13/13th day test4/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 13/13th day test4/Page_/span_Organization Setup'))

WebUI.click(findTestObject('Object Repository/1st Month/day 13/13th day test4/Page_/div_Cheque Printing Vault_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 13/13th day test4/Page_/div_Cheque Printing Vault_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 13/13th day test4/Page_/span_Department Diagnosis'))

WebUI.click(findTestObject('Object Repository/1st Month/day 13/13th day test4/Page_Department Diagnosis/button_Add Department Diagnosis'))

WebUI.click(findTestObject('Object Repository/1st Month/day 13/13th day test4/Page_Department Diagnosis/div_Accounts'))

WebUI.click(findTestObject('Object Repository/1st Month/day 13/13th day test4/Page_Department Diagnosis/span_Cath Lab'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 13/13th day test4/Page_Department Diagnosis/select_Select DepartmentAccountsAdmin  Secu_13f63c'), 
    '498135ee-096a-4a2c-b843-a8d477f199f6', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 13/13th day test4/Page_Department Diagnosis/div_Please Select'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 13/13th day test4/Page_Department Diagnosis/select_Cath Lab'), 
    '32a7b6ce-1408-497b-9412-132d17ecad1d', true)

WebUI.click(findTestObject('1st Month/day 13/13th day test4/Page_Department Diagnosis/div_RO CLD'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 13/13th day test4/Page_Department Diagnosis/input_Please Select_form-control'), 
    'R/o CLD')

WebUI.click(findTestObject('1st Month/day 13/13th day test4/Page_Department Diagnosis/span_RO CLD'))

WebUI.click(findTestObject('1st Month/day 13/13th day test4/Page_Department Diagnosis/div_RO CLD'))

WebUI.click(findTestObject('Object Repository/1st Month/day 13/13th day test4/Page_Department Diagnosis/input_Please Select Sub Department_SubmitId'))

WebUI.closeBrowser()

