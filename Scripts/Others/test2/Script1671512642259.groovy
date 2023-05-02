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

WebUI.setText(findTestObject('Object Repository/1st Month/day 1/testthree/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'afipadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 1/testthree/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testthree/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testthree/Page_/span_Patient Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testthree/Page_/span_Patient Vault'))

WebUI.click(findTestObject('1st Month/day 1/testthree/Page_Vault/i_Dec 19, 2022 1731_glyphicon glyphicon-edit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testthree/Page_Vault/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testthree/Page_Vault/span__select2-PanelOrganizationId-container'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 1/testthree/Page_Vault/input_concat(id(, , select2-PanelOrganizati_b26c3f'), 
    'pakis')

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testthree/Page_Vault/div_Select Service Type'))

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testthree/Page_Vault/a_PA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 1/testthree/Page_Vault/select_Select Service TypeAfip testingDPOPA_409451'), 
    'f8c01590-6374-ed11-80bf-9418826fce1f', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 1/testthree/Page_Vault/input_Testing Type_ArmedForcesServiceNumber'), 'test3')

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testthree/Page_Vault/span_Select Name'))

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testthree/Page_Vault/button_Submit'))

WebUI.closeBrowser()

