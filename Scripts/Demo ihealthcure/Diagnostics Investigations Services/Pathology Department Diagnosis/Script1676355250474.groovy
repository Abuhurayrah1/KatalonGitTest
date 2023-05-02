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

WebUI.setText(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_/span_Diagnostics Investigations Services'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_/span_Pathology Department Diagnosis'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_Department Diagnosis/button_Add Department Diagnosis'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_Department Diagnosis/div_Select Department'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_Department Diagnosis/span_Cath Lab'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_Department Diagnosis/select_Select DepartmentAccountsAdmin  Secu_d21bb3'), 
    '498135ee-096a-4a2c-b843-a8d477f199f6', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_Department Diagnosis/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_Department Diagnosis/span_Cathlab Pro'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_Department Diagnosis/select_Cath LabCathlab Pro'), 
    '14d6c869-d473-41ab-be01-47b73a7f1683', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_Department Diagnosis/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_Department Diagnosis/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test17/Page_Department Diagnosis/input_Please Select Sub Department_SubmitId'))

WebUI.closeBrowser()

