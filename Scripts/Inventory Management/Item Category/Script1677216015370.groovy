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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 3/3rd day test10/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 3/3rd day test10/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test10/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test10/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test10/Page_/span_Inventory Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test10/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test10/Page_/span_Item Category'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test10/Page_Item Category/button_Add Item Category'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 3/3rd day test10/Page_Item Category/input__CategoryName'), 
    'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 3/3rd day test10/Page_Item Category/textarea_Description_CategoryDescription'), 
    'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test10/Page_Item Category/input_Description_SubmitId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test10/Page_Item Category/a_asd_Action Update btn btn-sm btn-clean bt_303932'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test10/Page_Item Category/input_Description_UpdateSubmitId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test10/Page_Item Category/a_asd_Action Delete btn btn-sm btn-clean bt_597cbe'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test10/Page_Item Category/button_Yes'))

WebUI.closeBrowser()

