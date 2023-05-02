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

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'afipadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_/span_Patient Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_/span_Add Patient'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Add Patient/input__FirstName'), 'testtwo')

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Add Patient/input__CNICNumber'), '37410-3210258-4')

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Add Patient/input__yb'), '36')

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Add Patient/input__Address'), 'rwp')

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Add Patient/input__CellNumber'), '03121212121')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Add Patient/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Add Patient/button_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Add Patient/ul__select2-selection__rendered'))

WebUI.sendKeys(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Add Patient/input__select2-search__field'), 'ck-mb')

WebUI.waitForElementClickable(findTestObject('1st Month/day 4/4thday test2/Page_Vault/li_CK-MB (Mass), Serum Or Clotted  EDTA , 700'), 10)

WebUI.click(findTestObject('1st Month/day 4/4thday test2/Page_Vault/li_CK-MB (Mass), Serum Or Clotted  EDTA , 700'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Add Patient/input_Please enter a value with valid lengt_bf4d4b'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Add Patient/div_Collective Share Summary_ps__thumb-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Add Patient/span_Patient Vault'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Vault/a_Dec 26, 2022 1229_UpdateModalForArmedForc_0d73d3'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Vault/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Vault/span__select2-PanelOrganizationId-container'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Vault/input_concat(id(, , select2-PanelOrganizati_b26c3f'), 
    'pakistan army')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Vault/ul_Pakistan Military Accounts Department (C_d36326'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Vault/div_Select Service Type'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Vault/span_AAO'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Vault/select_Select Service TypeANOAAAAOABACCACOA_146884'), 
    '659ff6e0-b76f-ed11-80d3-a4badb2cfa6c', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Vault/input_ZB_ArmedForcesServiceNumber'), '01030')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Vault/span_Select Name'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Vault/input_concat(id(, , select2-PanelOrganizati_b26c3f'), 
    '(a) S/ctr')

WebUI.waitForElementClickable(findTestObject('1st Month/day 5/5th day test2/Page_Vault/li_(A) Sctr'), 10)

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Vault/li_(A) Sctr'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test2/Page_Vault/button_Submit'))

