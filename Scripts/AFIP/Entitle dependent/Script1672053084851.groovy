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

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'afipadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_/span_Patient Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_/span_Add Patient'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/label_Entitle'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/span'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/input__EmployeeServiceNumberDependent'), 
    '01233')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/button_Search'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/button_Select Relation'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/span_Daughter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/select_Select RelationDaughterFatherHusband_0b343e'), 
    '8d1968fd-df16-e811-80c1-a0b3cce147ba', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/input__FirstName'), 'testseven')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/span_1'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/input__CNICNumber'), '37410-5896320-0')

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/input__yb'), '53')

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/input__Address'), 'rwp')

WebUI.setText(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/input__CellNumber'), '03125212521')

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/span_1_2'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/button_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 5/5th day test7/Page_Add Patient/button_Check In Mr. Testseven FO ACO-01233 _5703e4'))

WebUI.closeBrowser()

