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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_/span_Budget Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_/span_Release Head of Account'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/button_Add Release Head Of Account'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/div_Select Reference Letter No'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/span_234'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/select_Select Reference Letter No.234'), 
    '193f4d21-8474-4edd-a49e-c3085ad5e117', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/input__ReleasedReferenceLetterNumber'), 
    '123')

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/div_1st Quarter'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/a_1st Quarter'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/input__DurationStartDate'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/td_25'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/input__DurationEndDate'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/td_25'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/input_Health Risk Allowance_ReleaseBudgetSe_16e523'), 
    '500')

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/input_Close_Submit'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/a_Open_Action Update btn btn-sm btn-clean b_27788c'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/input_Close_UpdateSubmit'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 11/11th day test5/Page_Relesase Head of Account/a_Open_Action Delete btn btn-sm btn-clean b_2c6b7f'))

WebUI.closeBrowser()

