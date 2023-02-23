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

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'afipadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_/span_Patient Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_/span_Add Patient'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Add Patient/input__FirstName'), 'testthree')

WebUI.setText(findTestObject('1st Month/day 5/5th day test2/Page_Add Patient/input__CNICNumber'), '37410-5312521-5')

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Add Patient/input__yb'), '36')

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Add Patient/input__Address'), 'rwp')

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Add Patient/input__CellNumber'), '03121212125')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Add Patient/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Add Patient/button_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Add Patient/button_Check In Mr. Testthree  (CNE)_close _9e92d2'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Add Patient/div_Collective Share Summary_ps__thumb-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Add Patient/span_Patient Vault'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Vault/a_Dec 26, 2022 1244_UpdateModalForArmedForc_6694eb'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Vault/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Vault/span_Select Organization'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Vault/ul_Select OrganizationPAEC (C-3) PAEC (KCI)_ce730f'))

WebUI.setText(findTestObject('1st Month/day 5/5thday test3/Page_Vault/input__OnPanelEmployeeNo'), '0102031')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Vault/input__OnPanelValidDate'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Vault/td_3'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5thday test3/Page_Vault/button_Submit'))

