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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_/span_Inventory Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_/span_Surgical Group'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_Multiple Surgical Group/button_Add Surgical Group'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_Multiple Surgical Group/input__SurgicalGroupName'), 
    'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_Multiple Surgical Group/div_Select Service'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_Multiple Surgical Group/span_CT.BT'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_Multiple Surgical Group/select_Select ServiceCT Scan Cardiac Angio0_0c396a'), 
    '81593edc-cfbd-44ca-92cc-0133a4e6c5da', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_Multiple Surgical Group/textarea_Description_SurgicalGroupDescription'), 
    'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_Multiple Surgical Group/input_Description_SaveData'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_Multiple Surgical Group/a_asd_Action Update btn btn-sm btn-clean bt_303932'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_Multiple Surgical Group/input_Description_UpdateSubmit'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_Multiple Surgical Group/a_asd_Action Delete btn btn-sm btn-clean bt_597cbe'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 5/5th day test4/Page_Multiple Surgical Group/button_Yes'))

WebUI.closeBrowser()

