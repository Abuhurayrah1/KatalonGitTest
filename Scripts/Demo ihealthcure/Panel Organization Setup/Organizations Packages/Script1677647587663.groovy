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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_/span_Panel Organization Setup'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_/span_Organizations Packages'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/button_Add Organizations Packages'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/div_Select Panel Package'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/span_Sehat Card'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/select_Select Panel Package50 PaymentEntitl_6f3628'), 
    'f82486d1-45b8-41e2-b299-38b701b3302a', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/div_Select Panel Organization'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/span_Zakat'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/select_Select Panel OrganizationCat-IV By E_eb3b3e'), 
    '63dbd22a-d721-44a4-844a-1b95031f96e3', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/input__PanelValidDate'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/td_8'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/input__PanelValidDate'), 
    '08/04/2024')

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/span_Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/span_Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/button_Submit'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/a_Health Card - SSP_Action Detail btn btn-s_a5933c'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/a_Health Card - SSP_Action Update btn btn-s_a49159'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/button_Save'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test3/Page_Organizations Packages/a_Health Card - SSP_Action Delete btn btn-s_36ea9b'))

WebUI.closeBrowser()

