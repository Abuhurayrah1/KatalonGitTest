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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 6/6th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 6/6th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test7/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test7/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test6/Page_/span_Panel Organization Setup'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test7/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('2nd Month/day 6/6th day test7/Page_/span_Misc Services Packages'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test7/Page_Misc Services Packages/button_Add Misc Services Packages'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test7/Page_Misc Services Packages/div_Select PanelEntitle Package'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test7/Page_Misc Services Packages/span_Sehat Card'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 6/6th day test7/Page_Misc Services Packages/select_Select PanelEntitle Package50 Paymen_48cd31'), 
    'f82486d1-45b8-41e2-b299-38b701b3302a', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test7/Page_Misc Services Packages/div_Please Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test7/Page_Misc Services Packages/span_Donor Screening'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test7/Page_Misc Services Packages/div_Misc Services'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test7/Page_Misc Services Packages/div_All'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test7/Page_Misc Services Packages/div_All'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test7/Page_Misc Services Packages/button_Submit'))

WebUI.closeBrowser()

