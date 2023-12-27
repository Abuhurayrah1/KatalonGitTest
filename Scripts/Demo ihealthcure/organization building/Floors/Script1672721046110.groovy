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

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 9/9th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test2/Page_/span_Organization Building'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test2/Page_/span_Floors'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test2/Page_Floor/button_Add Floor'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test2/Page_Floor/div_Select Building'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test2/Page_Floor/span_Test 1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test2/Page_Floor/select_Select BuildingModel PharmacyRawalpi_163808'), 
    '7ba8b700-218b-ed11-80e6-005056af7c10', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test2/Page_Floor/input__Name'), 'Test floor 2')

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test2/Page_Floor/input_Description_Description'), 
    '01/03/2022')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test2/Page_Floor/input_Please enter less than 1000 character_7640d1'))

WebUI.closeBrowser()

