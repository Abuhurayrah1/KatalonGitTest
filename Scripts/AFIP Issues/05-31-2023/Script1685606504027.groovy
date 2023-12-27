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

WebUI.navigateToUrl('http://192.168.88.254:325/Account/LogIn?ReturnUrl=%2f')

WebUI.setText(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_/div_Blood Bag Issuance_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_/span_Lab Investigations'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_/span_Lab Investigation Vault'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/input__DateRange'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/li_Last 7 Days'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/button_Search'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/input__DateRange'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/li_Last 30 Days'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/button_Search'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/input__DateRange'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/li_Last 7 Days'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/button_Search'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/input__DateRange'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/li_Custom Range'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/button_Apply'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/button_Search'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/td_May 26, 2023 1120'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/div_Show 102550100 entriesSearch           _f9b8dd'))

WebUI.click(findTestObject('Object Repository/AFIP Issue/05-31-2023/Page_Lab Investigation Vault/td_Mr. Sameer  (Private)'))

WebUI.closeBrowser()

