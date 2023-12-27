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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_/span_Misc Services'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_/span_Misc Services Charges'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_Misc Services Charges/button_Add Misc Services Charges'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_Misc Services Charges/div_Select Misc Service Type'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_Misc Services Charges/span_Asd'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_Misc Services Charges/select_Select Misc Service TypeAcbhjtAsdBlo_f92a55'), 
    '136e0531-e830-4303-83bc-76ac9b1a4bc9', true)

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_Misc Services Charges/input__UpdateName'), 
    'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_Misc Services Charges/input__Amount'), 
    '500')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_Misc Services Charges/input_Description_Description'), 
    'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_Misc Services Charges/div_Select Type'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_Misc Services Charges/span_Once'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_Misc Services Charges/select_Select TypeOncePeriodic'), 
    '97ac3d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_Misc Services Charges/input_Please enter a value with valid lengt_efa5ae'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_Misc Services Charges/a_No Discount_Action Update btn btn-sm btn-_e1242f'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_Misc Services Charges/input_Total  500.00_UpdateFee'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test8/Page_Misc Services Charges/a_No Discount_Action Delete btn btn-sm btn-_5dc929'))

WebUI.closeBrowser()

