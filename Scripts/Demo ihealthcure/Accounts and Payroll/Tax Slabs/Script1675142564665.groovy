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

WebUI.setText(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_/span_Accounts  Payroll'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_/span_Tax Slabs'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_Tax Slabs/button_Add Tax Slab'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_Tax Slabs/span_Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_Tax Slabs/ul_Select2019-20202020-20212021-20222022-20_1e5bff'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_Tax Slabs/span_Select Deduction'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_Tax Slabs/ul_Select DeductionGI(Over All)Trade Tax (R_0d46e8'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_Tax Slabs/input__MinAmount'), '500')

WebUI.setText(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_Tax Slabs/input__MaxAmount'), '5000')

WebUI.setText(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_Tax Slabs/input__TaxAmount'), '5')

WebUI.setText(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_Tax Slabs/input__TaxPercentage'), '5')

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_Tax Slabs/span_Select Income Tax After Net Deduction'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_Tax Slabs/ul_Select Income Tax After Net DeductionGI(_87ca2c'))

WebUI.click(findTestObject('Object Repository/1st Month/day 23/23rd day test8/Page_Tax Slabs/input_Hostel Room Rent (PGT)(On Net Pay)_TaxSlabId'))

WebUI.closeBrowser()

