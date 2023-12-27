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

WebUI.navigateToUrl('http://192.168.88.254:325/Account/LogIn?ReturnUrl=%2f')

WebUI.setText(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_/span_Organization Setup'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_/span_Preference Configuration'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Preference Configuration/div_Select Preference Configuration'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Preference Configuration/span_General Setting'))

WebUI.selectOptionByValue(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Preference Configuration/select_Select Preference Configuration     _7c17dc'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Preference Configuration/label_Custom Gulf Countries Form'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Preference Configuration/input_Display Religion And Marital Status O_051b7b'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Preference Configuration/button_Yes'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Preference Configuration/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Preference Configuration/span_Patient Management'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Preference Configuration/span_Add Patient'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Add Patient/span_Mr. Muhammad Mudassar'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Add Patient/div_Refresh Cache'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Add Patient/button_Select Title'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Add Patient/span_Mr'))

WebUI.selectOptionByValue(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Add Patient/select_Select TitleMr.Mrs.MissDr.Prof.Not A_e0dd14'), 
    'c1b03d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.setText(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Add Patient/input__FirstName'), 'test')

WebUI.setText(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Add Patient/input__CNICNumber'), '546-4564-6512185-6')

WebUI.setText(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Add Patient/input__yb'), '23')

WebUI.setText(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Add Patient/input__Address'), 'asd')

WebUI.setText(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Add Patient/input__CellNumber'), '03125421236')

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Add Patient/label_Registration Fee'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Add Patient/button_Submit'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Add Patient/button_Save'))

WebUI.click(findTestObject('Object Repository/High priority v4.8.9/1.0/Page_Add Patient/button_Check In Mr. Test     (Private)_clos_9c0a53'))

WebUI.closeBrowser()

