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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_/span_Blood Bank'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_/span_Blood Bank Institute'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_Blood Bank Institute/button_Add Blood Bank Institute'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_Blood Bank Institute/input__BloodBankInstituteName'), 
    'Test Bank')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_Blood Bank Institute/input_Code_BloodBankInstituteCode'), 
    '0011')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_Blood Bank Institute/input__BloodBankInstituteAddress'), 
    'Testing address')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_Blood Bank Institute/span_Select Country'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_Blood Bank Institute/ul_Select CountryAfghanistanBelgiumChinaEgy_9ef9bf'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_Blood Bank Institute/input_Contact No_BloodBankInstituteCNo'), 
    '03000000000000')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_Blood Bank Institute/input_Email_BloodBankInstituteEmail'), 
    'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_Blood Bank Institute/textarea_Description_BloodBankInstituteDescription'), 
    'Test Description')

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_Blood Bank Institute/input_Description_SubmitId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_Blood Bank Institute/a_Testing address_Action Update btn btn-sm _53686d'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_Blood Bank Institute/input_Description_UpdateSubmitId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_Blood Bank Institute/a_Testing address_Action Delete btn btn-sm _7d6bbc'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 16/16th day test3/Page_Blood Bank Institute/button_Yes'))

WebUI.closeBrowser()

