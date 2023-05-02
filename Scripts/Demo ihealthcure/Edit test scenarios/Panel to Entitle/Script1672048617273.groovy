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

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'afipadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_/span_Patient Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_/span_Add Patient'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_Add Patient/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_Add Patient/span_Select Organization'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_Add Patient/ul_Select OrganizationPAEC (C-3) PAEC (KCI)_ce730f'))

WebUI.setText(findTestObject('1st Month/day 5/5th day test5/Page_Add Patient/input__OnPanelEmployeeNo'), '012315')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_Add Patient/input__OnPanelValidDate'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_Add Patient/td_5'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_Add Patient/input__FirstName'), 'testsix')

WebUI.setText(findTestObject('1st Month/day 5/5th day test5/Page_Add Patient/input__CNICNumber'), '31478-6314782-6')

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_Add Patient/input__yb'), '63')

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_Add Patient/input__Address'), 'rwp')

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_Add Patient/input__CellNumber'), '03125621521')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_Add Patient/span_1'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_Add Patient/button_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_Add Patient/button_Check In Mr. Testsix  (Panel - PAEC _289ec8'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_Add Patient/div_Collective Share Summary_ps__thumb-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_Add Patient/span_Panel Vault'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_PanelVault/a_Dec 26, 2022 1458_UpdateModalForArmedForc_5a679c'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_PanelVault/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_PanelVault/span__select2-PanelOrganizationId-container'))

WebUI.setText(findTestObject('1st Month/day 5/5th day test6/Page_Vault/input__select2-search__field'), 'pakistan army')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_PanelVault/ul_Pakistan Military Accounts Department (C_d36326'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_PanelVault/div_Select Service Type'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_PanelVault/a_ACO'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_PanelVault/select_Select Service TypeANOAAAAOABACCACOA_146884'), 
    'b4a915a4-b76f-ed11-80d3-a4badb2cfa6c', true)

WebUI.setText(findTestObject('1st Month/day 5/5th day test3/Page_Add Patient/input_ZB_ArmedForcesServiceNumber'), '01233')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_PanelVault/span_Select Name'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_PanelVault/input_Set Waiting Time_select2-search__field'), 
    '01 PDC')

WebUI.waitForElementClickable(findTestObject('1st Month/day 5/5th day test6/Page_PanelVault/li_01 PDC'), 10)

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_PanelVault/li_01 PDC'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_PanelVault/button_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test6/Page_PanelVault/button_Check In Mr. Testsix  (Panel - PAEC _289ec8'))

WebUI.closeBrowser()

