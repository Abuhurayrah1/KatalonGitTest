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

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'afipadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_/span_Patient Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_/span_Add Patient'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_Add Patient/label_Panel'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_Add Patient/span_Select Organization'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_Add Patient/ul_Select OrganizationPAEC (C-3) PAEC (KCI)_ce730f'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_Add Patient/input__OnPanelEmployeeNo'), '9095')

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_Add Patient/input__OnPanelValidDate'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_Add Patient/td_7'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_Add Patient/input__FirstName'), 'testthree')

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_Add Patient/input__CNICNumber'), '37410-5821212-4')

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_Add Patient/input__yb'), '36')

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_Add Patient/input__Address'), 'rwp')

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_Add Patient/input__CellNumber'), '03125215211')

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_Add Patient/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_Add Patient/button_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_Add Patient/button_Check In Mr. Testthree  (Panel - PAE_606a51'))

WebUI.click(findTestObject('1st Month/day 5/5th day test5/Page_Add Patient/div_Collective Share Summary_ps__thumb-y'))

WebUI.click(findTestObject('1st Month/day 5/5th day test5/Page_Add Patient/span_Panel Vault'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_PanelVault/a_Dec 27, 2022 0957_UpdateModalForArmedForc_0af94d'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_PanelVault/span'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_PanelVault/input__OnEmployeeCardNoDependent'), '31478-6314782-1')

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_PanelVault/button_Search'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_PanelVault/div_Select Relation'))

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_PanelVault/span_Father'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_PanelVault/select_Select RelationDaughterFatherHusband_0b343e'), 
    '83a169d6-df16-e811-80c1-a0b3cce147ba', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 6/6th day test3/Page_PanelVault/button_Submit'))

WebUI.closeBrowser()

