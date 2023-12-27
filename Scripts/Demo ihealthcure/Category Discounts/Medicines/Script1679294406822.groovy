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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 8/8th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test3/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test3/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test3/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test3/Page_/span_Category Discounts'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test3/Page_/span_Medicines'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test3/Page_Category Medicine/button_Add Category Medicine'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test3/Page_Category Medicine/div_Select Patient Category'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test3/Page_Category Medicine/span_Cat-II'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 8/8th day test3/Page_Category Medicine/select_Select Patient CategoryCat-IIAsdCat-_c257a7'), 
    'c2bbc30b-336e-47c2-a8ae-33790fdd3537', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test3/Page_Category Medicine/div_Please Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test3/Page_Category Medicine/button_Please Select'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 8/8th day test3/Page_Category Medicine/input__Share'), '5')

WebUI.click(findTestObject('Object Repository/2nd Month/day 8/8th day test3/Page_Category Medicine/button_Submit'))

WebUI.closeBrowser()

