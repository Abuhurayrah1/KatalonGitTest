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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_/span_Session Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_/span_Restaurant Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_/span_Preference'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_Preference/input_No_ServiceCharges'), 
    '500')

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_Preference/div_Please enter a value greater than or eq_a32ebb'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_Preference/input_GST()_GST'), '2')

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_Preference/div_Apply GST_switch'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_Preference/div_Apply GST'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_Preference/input_GSTN_GSTN'), '5')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_Preference/input_NTN_NTN'), '2')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_Preference/textarea_Note in English_EnglishNote'), 
    'Test English')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_Preference/textarea_Note in Urdu_UrduNote'), 
    'Test Urdu')

WebUI.click(findTestObject('Object Repository/2nd Month/day 14/14th day test7/Page_Preference/input_Note in Urdu_btnSubmit'))

WebUI.closeBrowser()

