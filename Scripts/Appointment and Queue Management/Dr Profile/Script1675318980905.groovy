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

WebUI.setText(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_/span_Appointment  Queue Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_/span_Dr Profile'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/div_Select Title'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/span_Mr'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/select_Select TitleMr.Mrs.MissDr.Prof.Not A_e0dd14'), 
    'c1b03d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/input__firstname'), 'asd')

WebUI.setText(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/input__lastName'), 'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/input__DateOfBirth'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/th_February 2023'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/th_2023'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/th_'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/th_'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/span_1999'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/span_Feb'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/td_2'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/input__CNICNumber'), '37412-1215215-0')

WebUI.setText(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/input__PMDCNumber'), '123')

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/div__form-control file-caption  kv-fileinpu_32ac36'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/span_Dr. Aasifa Siddiqa  Assist.Prof.Pathal_4169ab'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/select_Please SelectDr. Aasifa Siddiqa  Ass_a53fa0'), 
    '34184748-6b14-4493-b3a2-07988607484c', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test13/Page_Dr Profile/input_Deselect All_Register'))

WebUI.closeBrowser()

