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

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_/span_Organization Setup'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_/span_Departments (Dept)'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/button_Add Department'))

WebUI.click(findTestObject('1st Month/day 9/9th day test6/Page_Departments/label_In Patient'))

WebUI.click(findTestObject('1st Month/day 9/9th day test6/Page_Departments/label_Surgical'))

WebUI.click(findTestObject('1st Month/day 9/9th day test6/Page_Departments/label_Check In'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/input__departments'), 'test department')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/button_Select Department Category'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/span_Test 1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/select_Select Department CategoryGeneral Wa_557763'), 
    '0d2d1862-97f6-4e72-b53f-06a5ebcf5dc4', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/span_Test1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/select_Rawalpindi Institute Of CardiologyMo_1e546d'), 
    'fecdd4f2-c581-ed11-80e6-005056af7c10', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/div_Test1'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/div_Please Select'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/select_Testfloor1'), 
    '66736408-c681-ed11-80e6-005056af7c10', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/div_Testfloor1'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/div_Please Select'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/select_Testroom1'), 
    'ded29614-c681-ed11-80e6-005056af7c10', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/div_Testroom1'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/input_Description_description'), 
    '01/03/2023')

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/input__Amount'), '0200')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/div_Once'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/a_Once'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test6/Page_Departments/input__SubmitDepartment'))

WebUI.closeBrowser()

