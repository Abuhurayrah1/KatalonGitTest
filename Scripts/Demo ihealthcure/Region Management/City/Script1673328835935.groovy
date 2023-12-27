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

WebUI.setText(findTestObject('Object Repository/1st Month/day 14/14th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 14/14th day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test4/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test4/Page_/span_Region Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test4/Page_/span_City'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test4/Page_City/button_Add City'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 14/14th day test4/Page_City/input__Name'), 'test city')

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test4/Page_City/span_Select Province'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 14/14th day test4/Page_City/input_concat(id(, , select2-ProvinceId-cont_090ae2'), 
    'test')

WebUI.click(findTestObject('1st Month/day 14/14th day test4/Page_City/span_Test State'))

WebUI.click(findTestObject('Object Repository/1st Month/day 14/14th day test4/Page_City/input_City already exists_SubmitId'))

WebUI.closeBrowser()

