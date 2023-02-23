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

WebUI.navigateToUrl('http://192.168.88.254:399/Account/LogIn?ReturnUrl=%2f')

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'afipadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 6/6th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test4/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test4/Page_/a_Clinical Support System'))

WebUI.click(findTestObject('1st Month/day 3/3rdday test1/Page_/div_Cheque Printing Vault_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test4/Page_/span_Patient Reports'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test4/Page_Lab Reports/i_CNE_fa fa-print eys'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test4/Page_Lab Reports/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test4/Page_Lab Reports/div_Print A4 Half                          _0382a0'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test4/Page_Lab Reports/span_1'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test4/Page_Lab Reports/input_Print A4 Full_OptionPrintButton'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test4/Page_Lab Reports/a_CNE_PrintLabOrder service-grid btn btn-sm_9735b2'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test4/Page_Lab Reports/a_CNE_PatientIDRDetail service-grid btn btn_9daf73'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test4/Page_Lab Reports/button_Lab Reports Detail_close'))

