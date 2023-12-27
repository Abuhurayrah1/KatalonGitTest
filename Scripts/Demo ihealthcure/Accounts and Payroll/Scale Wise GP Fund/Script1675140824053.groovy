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

WebUI.setText(findTestObject('Object Repository/1st Month/day 23/23rd day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 23/23rd day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test4/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test4/Page_/span_Accounts  Payroll'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test4/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test4/Page_/span_Scale Wise GP Fund'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test4/Page_Scale Wise GP Funds/button_Add Scale Wise GP Funds'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test4/Page_Scale Wise GP Funds/span_Select Scales'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test4/Page_Scale Wise GP Funds/ul_Select ScalesBPS-1BPS-10BPS-11BPS-12BPS-_f72f2c'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test4/Page_Scale Wise GP Funds/span_Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test4/Page_Scale Wise GP Funds/ul_Select 2019-20202020-20212021-20222022-2_2a771f'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 23/23rd day test4/Page_Scale Wise GP Funds/input__Amount'), 
    '500')

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test4/Page_Scale Wise GP Funds/span_Select_1'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test4/Page_Scale Wise GP Funds/ul_Select GI(Over All)Trade Tax (RMP)(On Gr_864c6e'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test4/Page_Scale Wise GP Funds/input_Please Select Deduction_btn btn-primary'))

WebUI.closeBrowser()

