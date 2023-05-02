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

WebUI.setText(findTestObject('Object Repository/1st Month/day 16/16th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 16/16th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test3/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test3/Page_/span_Patient Packages'))

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test3/Page_/span_Consultancy Fee'))

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test3/Page_Consultancy Fees/button_Add Package Consultancy Fee'))

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test3/Page_Consultancy Fees/div_Select Individual Package'))

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test3/Page_Consultancy Fees/span_Angiography'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 16/16th day test3/Page_Consultancy Fees/select_Select Individual PackageAngiography_bc3a36'), 
    '2f5a9d63-6e67-ed11-80e6-005056af7c10', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test3/Page_Consultancy Fees/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 16/16th day test3/Page_Consultancy Fees/input_Please Select_form-control'), 
    'karam iqbal')

WebUI.click(findTestObject('1st Month/day 16/16th day test3/Page_Consultancy Fees/span_Dr. Karam Iqbal'))

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test3/Page_Consultancy Fees/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test3/Page_Consultancy Fees/input_Total Amount_TAmount'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 16/16th day test3/Page_Consultancy Fees/input__NumberOfItemsId'), '50')

WebUI.click(findTestObject('Object Repository/1st Month/day 16/16th day test3/Page_Consultancy Fees/input_Please enter a valid number_Individua_8e64da'))

WebUI.closeBrowser()

