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

WebUI.setText(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_/span_Patient Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_/span_Add Patient'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_Add Patient/div_Select Title'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_Add Patient/span_Mr'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_Add Patient/select_Select TitleMr.Mrs.MissDr.Prof.Not A_e0dd14'), 
    'c1b03d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_Add Patient/input__FirstName'), 'asd')

WebUI.setText(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_Add Patient/input__CNICNumber'), '37410-4741014-7')

WebUI.setText(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_Add Patient/input__yb'), '23')

WebUI.setText(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_Add Patient/input__Address'), 'asd')

WebUI.setText(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_Add Patient/input__CellNumber'), '03121212121')

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_Add Patient/button_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_Add Patient/button_Save'))

WebUI.click(findTestObject('Object Repository/1st Month/day 25/25th day test2/Page_Add Patient/button_Check In Mr. Asd  (Regular)_close bt_fd0728'))

WebUI.closeBrowser()

