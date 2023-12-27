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

WebUI.setText(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_/span_Procedure Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_/span_Book Procedure'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_Book Procedure/input_CNICMR No_SearchMRNo'), 
    '0401-23-004874')

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_Book Procedure/input_CNICMR No_SearchBtn'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_Book Procedure/i_Feb 08, 2023 1052_glyphicon glyphicon-cal_53b40a'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_Book Procedure/div_Select Procedure'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_Book Procedure/a_Acute Limbs Ischemia Intervention'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_Book Procedure/select_Select ProcedureAcute Limbs Ischemia_dc8cd6'), 
    'a4b73e52-a2aa-47cd-9093-eec51475a5d2', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_Book Procedure/div_Please select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_Book Procedure/span_Dr. Aasifa Siddiqa  Assist.Prof.Pathal_4169ab'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_Book Procedure/select_Please selectDr. Aasifa Siddiqa  Ass_acd57f'), 
    '34184748-6b14-4493-b3a2-07988607484c', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_Book Procedure/input__ProcedureTime'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_Book Procedure/textarea_Clinical History_ProcedureClinicalHistory'), 
    'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_Book Procedure/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_Book Procedure/button_60'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test4/Page_Book Procedure/input_Please enter valid procedure duration_5d2bad'))

WebUI.closeBrowser()

