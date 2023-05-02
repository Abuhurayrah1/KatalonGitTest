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

WebUI.setText(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_/div_Cheque Printing Vault_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_/span_Lab Investigations'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_/span_Investigations Queue'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_Investigations Queue/a_Mr. Branch  Administrator_BloodSampleInMo_5c6802'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_Investigations Queue/button_Collect'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_Investigations Queue/a_Result Entry'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_Investigations Queue/a_Mr. Branch  Administrator_DataEntryInModa_21ad56'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_Enter Test Result/div_CK-MB                                  _791338'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_Enter Test Result/input_(0 - 25) UL_numeric0'), '25')

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_Enter Test Result/input_Report Preview_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_Investigations Queue/a_On Verification'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_Investigations Queue/a_Mr. Branch  Administrator_ReviewInModal b_7da815'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_Review Test Result/input_Report Preview_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_Investigations Queue/a_Verified'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_Investigations Queue/a_Mr. Branch  Administrator_PrintInModal'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_Investigations Queue/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 3/3rdday test1/Page_Investigations Queue/input_Print Footer_OptionPrintButton'))

WebUI.closeBrowser()

